package designPattern.create.singleton;

/**
 * @ClassName LazyModel
 * @Description [懒汉式]
 * @Author ANGLE0
 * @Date 2020/4/29 19:35
 * @Version V1.0
 **/
public class LazyModel {

    private static Target target;

    //lazy loading v1.0
    public static Target getInstance() {
        if (target == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target = new Target();
        }
        return target;
    }

    //lazy loading v1.1
    public static synchronized Target getInstance1() {
        if (target == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target = new Target();
        }
        return target;
    }

    //lazy loading v1.2
    //双重检查锁
    public static Target getInstance2(){
        synchronized (LazyModel.class){
            if (target == null){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return target;
    }
}
