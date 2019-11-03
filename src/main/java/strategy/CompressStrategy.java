package strategy;

/**
 * Created by DEll on 2019-11-3.
 * 策略类
 * 用于抽象具体实现需要实现的功能
 * 类型需要作为上下文环境类中方法的形参
 */
public interface CompressStrategy {

    boolean compress(String source, String to);

    boolean unCompress(String source, String to);
}
