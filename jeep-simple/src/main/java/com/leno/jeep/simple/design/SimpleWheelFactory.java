package com.leno.jeep.simple.design;

/**
 * <p>简单工厂模式</p>
 *
 * @author: XianGuo
 * @date: 2018年05月15日
 */
public class SimpleWheelFactory {


    public static void main(String[] args) {
        Wheel wheelFive = SimpleWheelFactory.getWheel(5);
        System.out.println(wheelFive.diameter());

        Wheel wheelTen = SimpleWheelFactory.getWheel(10);
        System.out.println(wheelTen.diameter());
    }


    public static Wheel getWheel(int dimaeter) {
        if (dimaeter == 5) {
            return new FiveWheel();
        }
        if (dimaeter == 10) {
            return new TenWheel();
        }
        return null;
    }


    public interface Wheel {
        /**
         * 直径
         */
        String diameter();
    }

    public static class FiveWheel implements Wheel {

        @Override
        public String diameter() {
            return "直径为5";
        }
    }

    public static class TenWheel implements Wheel {

        @Override
        public String diameter() {
            return "直径为10";
        }
    }
}
