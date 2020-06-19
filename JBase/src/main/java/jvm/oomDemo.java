package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName oomDemo
 * @Description [oom异常测试及查错]
 * @Author ANGLE0
 * @Date 2020/4/25 10:00
 * @Version V1.0
 **/
public class oomDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (long i = 0; i < 1000000000; i++) {
            Object o = new StringBuffer();
            list.add(o);
        }
    }
}
