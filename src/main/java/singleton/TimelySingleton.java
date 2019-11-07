package singleton;

/**
 * Created by DEll on 2019-11-3.
 * 单例模式中的饿汉模式
 * 该模式在类文件加载的时候就生成了实例
 * 如果后续没有使用实例，会造成创建实例和垃圾回收使用资源的浪费
 * 实现思路:
 * 1、声明一个单例类类型的静态私有变量并初始化
 * 2、设置单例类构造方法为私有
 * 3、声明一个公共静态方法返回单例类的私有静态变量
 */
public class TimelySingleton {
    private static TimelySingleton timelySingleton = new TimelySingleton();
    private TimelySingleton(){};
    public static TimelySingleton getInstance(){
        return timelySingleton;
    }
}
