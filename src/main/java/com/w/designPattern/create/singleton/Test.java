package com.w.designPattern.create.singleton;

import com.sun.prism.RenderTarget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName Test
 * @Description [测试]
 * @Author ANGLE0
 * @Date 2020/4/29 19:41
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
//      测试懒汉模式多线程下的问题
        testMultithread();

    }

    private static void testMultithread() {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->
                    System.out.println(LazyModel.getInstance().hashCode())
            ).start();
        }
    }
}
