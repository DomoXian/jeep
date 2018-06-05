package com.leno.jeep.model;

import lombok.Data;

/**
 * <p>人</p>
 *
 * @author: XianGuo
 * @date: 2018年04月26日
 */
@Data
public class PersonModel {

    /**
     * 头发
     */
    private String hair;

    /**
     * 脸
     */
    private String face;

    /**
     * 眼睛
     */
    private String eyes;

    /**
     * 耳朵
     */
    private String ear;

    /**
     * 嘴巴
     */
    private String mouth;

    /**
     * 鼻子
     */
    private String nose;

    /**
     * 身体
     */
    private String body;

    /**
     * 手
     */
    private String hand;

    /**
     * 脚
     */
    private String foot;

    /**
     * 退
     */
    private String leg;


    public PersonModel(Builder builder) {
        this.hair = builder.hair;
        this.face = builder.face;
        this.eyes = builder.eyes;
        this.ear = builder.ear;
        this.mouth = builder.mouth;
        this.nose = builder.nose;
        this.body = builder.body;
        this.hand = builder.hand;
        this.foot = builder.foot;
        this.leg = builder.leg;
    }


    public static final class Builder {
        /**
         * 头发
         */
        private String hair;

        /**
         * 脸
         */
        private String face;

        /**
         * 眼睛
         */
        private String eyes;

        /**
         * 耳朵
         */
        private String ear;

        /**
         * 嘴巴
         */
        private String mouth;

        /**
         * 鼻子
         */
        private String nose;

        /**
         * 身体
         */
        private String body;

        /**
         * 手
         */
        private String hand;

        /**
         * 脚
         */
        private String foot;

        /**
         * 退
         */
        private String leg;


        public Builder() {
            this.hair = "黑头发";
            this.face = "瓜子脸";
            this.eyes = "大眼睛";
            this.ear = "小耳朵";
            this.mouth = "黑头发";
            this.nose = "黑头发";
            this.body = "黑头发";
            this.hand = "黑头发";
            this.foot = "黑头发";
            this.leg = "黑头发";
        }

        public Builder hair(String hair){
            this.hair = hair;
            return this;
        }


        public PersonModel build() {
            return new PersonModel(this);
        }

    }


}
