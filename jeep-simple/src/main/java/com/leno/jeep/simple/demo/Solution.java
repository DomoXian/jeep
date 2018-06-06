package com.leno.jeep.simple.demo;

import java.util.Stack;

/**
 * <p>使用两个栈完成队列</p>
 */
public class Solution {

    private Stack<Integer> pushStack = new Stack<>();

    private Stack<Integer> popStack = new Stack<>();


    /**
     * 入栈
     */
    public void push(Integer value) {
        pushStack.push(value);
    }

    /**
     * 出栈
     */
    public Integer pop() {
        if (!popStack.isEmpty()) {
            return popStack.pop();
        }

        while (!pushStack.isEmpty()) {
            Integer temp = pushStack.pop();
            popStack.push(temp);
        }

        if (popStack.isEmpty()) {
            return null;
        }

        return popStack.pop();
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return popStack.isEmpty() && pushStack.isEmpty();
    }

    /**
     * 测试入口
     */
    public static void main(String[] args) {
        Solution queue = new Solution();

        for (int i = 0; i < 100; i++) {
            queue.push(i);
        }

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }


    }

}
