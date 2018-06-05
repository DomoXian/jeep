package com.leno.jeep.common.utils;

import java.util.Random;

/**
 * <p>字符串工具</p>
 *
 * @author: XianGuo
 * @date: 2018年04月27日
 */
public class ConstantUtil {

    public static final String FIRST_NAME = "赵钱孙李周吴郑王" +
            "冯陈褚卫蒋沈韩杨" +
            "朱秦尤许何吕施张" +
            "孔曹严华金魏陶姜" +
            "戚谢邹喻柏水窦章" +
            "云苏潘葛奚范彭郎" +
            "鲁韦昌马苗凤花方" +
            "俞任袁柳酆鲍史唐" +
            "费廉岑薛雷贺倪";
    public static final String PHRASE = "刚开学大家总归是客客气气的过了一段时间大家都玩得很熟了眼" +
            "看张扬一个帅气的三步上篮运球跳准备投的时候被一个跳起的瘦高个挡了一下投偏了没有进张扬你是猪吗" +
            "看不见他从这边拦你啊我大声嚷着许紫菲你懂个毛闭嘴张扬大汗淋漓晚霞的余光照到他身上感觉好像他整" +
            "个人都在发光他掀起黄色球衣一次性盖在脸上擦掉脸上汗珠我就默默的关注着他做他的小粉丝只有我自己" +
            "清楚我有多么崇拜他我喜欢他的霸道喜欢他和我斗嘴";

    public static final String HAIR = "长短密薄顺";

    /**
     * 获取一个随机的名字
     */
    public static String getRandomName() {
        Random random = new Random();
        int firstIndex = random.nextInt(FIRST_NAME.length());
        int nameIndex = random.nextInt(PHRASE.length());
        if (nameIndex == 0) {
            nameIndex++;
        }
        if (firstIndex == 0) {
            firstIndex++;
        }

        return FIRST_NAME.substring(firstIndex - 1, firstIndex % 2 == 0 ? firstIndex : firstIndex + 1) + PHRASE.substring(nameIndex - 1, nameIndex);
    }

    public static String getRandomHair(){
        Random random = new Random();
        int index = random.nextInt(HAIR.length());
        if (index == 0) {
            index++;
        }
        return HAIR.substring(index-1,index)+"发";
    }


    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(getRandomName());
        }
    }

}
