package com.leno.jeep.service.impl;

import com.leno.jeep.common.net.HttpService;
import com.leno.jeep.common.net.RetrofitHelper;
import com.leno.jeep.common.utils.LastValueHelper;
import com.leno.jeep.dal.manager.FiveResumeManager;
import com.leno.jeep.dal.model.FiveResumeDO;
import com.leno.jeep.service.WebCrawlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>TODO</p>
 *
 * @author: XianGuo
 * @date: 2018年04月22日
 */
@Service
@Slf4j
public class WebCrawlServiceImpl implements WebCrawlService {


    @Autowired
    private FiveResumeManager resumeManager;

    @Override
    public void webCrawlResumeList() {
        String value = LastValueHelper.getLastValue("web_crawl_resume");
        Long resumeId = StringUtils.isEmpty(value)?5474109340L:Long.valueOf(value);
        int count = 0;
        while (count < 20) {
            HttpService service = RetrofitHelper.invoke(HttpService.class);
            String content = RetrofitHelper.getExecuteBody(service.webCrawler(resumeId));
            if (content == null) {
                log.info("失败！");
                continue;
            }
            if (content.contains("DEFAULT_URL")) {
                // 把url取出来
                log.info("resumeId:{}找到了相关简历", resumeId);
                int i = content.indexOf("DEFAULT_URL");
                String url = content.substring(i, i + 170);
                int a = url.indexOf("=");
                int b = url.indexOf(";");
                url = url.substring(a, b).replaceAll("=", "").replaceAll("\"", "");
                FiveResumeDO resume = new FiveResumeDO();
                resume.setBizId(resumeId);
                resume.setUrl(url);
                resumeManager.insertSelective(resume);
                count++;
            }else{
                log.info("resumeId：{}没有找到相关简历",resumeId);
            }

            resumeId--;
            LastValueHelper.setLastValue("web_crawl_resume",String.valueOf(resumeId));
        }

    }
}
