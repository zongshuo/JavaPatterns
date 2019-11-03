package prototype;

/**
 * Created by DEll on 2019-11-3.
 * 单例模式中的懒汉模式
 * 该模式只在需要使用实例时才生成实例
 * 该模式需要注意线程安全问题，
 * 如果两个线程同时获取了未生成实力的单例对象，
 * 会获取两个单例对象。
 * 实现思路：
 * 1、声明一个私有的静态的未初始化的单例类类型的变量
 * 2、设置构造方法为私有
 * 3、声明一个公共的静态的方法用于获取单例对象，对于单例对象的创建需要线程安全（加锁）
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton;
    private LazySingleton(){};

    /**
     * 使用重量级锁进行双重检查限制对单例实例的创建
     * 变量不为空时不做处理直接返回实例
     * 变量为空时，使用线程锁锁住创建实例的代码
     * 只有其中一个线程完成对象的初始化后，下一个线程才能访问代码
     * 此时对象已经不为空，线程继续执行后续代码，不再初始化对象
     * @return
     */
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    /**
     * 使用内部静态类保存单例对象
     * 原理相当于延迟加载一个饿汉模式的单例
     * 相对于使用线程锁，该模式避免了对线程时的锁竞争
     * @return
     */
    public static LazySingleton getInnerInstance(){
        return Inner.singleton;
    }

    private static class Inner{
        private static final LazySingleton singleton = new LazySingleton();
    }
}
