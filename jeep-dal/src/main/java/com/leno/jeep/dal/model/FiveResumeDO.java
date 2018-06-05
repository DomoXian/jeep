package com.leno.jeep.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class FiveResumeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * five_resume.resume_id
     */
    private Long resumeId;

    /**
     * 
     * five_resume.biz_id
     */
    private Long bizId;

    /**
     * 
     * five_resume.url
     */
    private String url;

    /**
     * 
     * five_resume.gmt_create
     */
    private Date gmtCreate;

    /**
     * 
     * five_resume.gmt_modified
     */
    private Date gmtModified;

}