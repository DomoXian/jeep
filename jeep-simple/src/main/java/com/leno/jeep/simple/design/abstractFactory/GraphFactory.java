package com.leno.jeep.simple.design.abstractFactory;

/**
 * <p>抽象工厂模式</p>
 *
 * @author: XianGuo
 * @date: 2018年05月15日
 */
public interface GraphFactory {
    Color getColor(String color);

    Shape getShare(String shape);
}
