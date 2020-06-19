package designPattern.create.singleton;

/**
 * @ClassName HungryModel
 * @Description [饿汉式]
 *      优点：
 *          只一个实力，JVM 保证线程安全
 *      缺点:
 *          无论是否使用，类装载时便完成实例化
 * @Author ANGLE0
 * @Date 2020/4/29 20:49
 * @Version V1.0
 **/
public class HungryModel {

    private static final Target target = new Target();

    public HungryModel() {
    }

    public static Target getTarget() {
        return target;
    }
}
