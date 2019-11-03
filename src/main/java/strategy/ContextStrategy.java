package strategy;

/**
 * Created by DEll on 2019-11-3.
 * CompressStrategy策略使用的上下文类
 * 用于客户端进行使用
 * 使用要求客户端了解该策略的具体策略对应的类
 */
public class ContextStrategy {
    private CompressStrategy strategy;
    public ContextStrategy(CompressStrategy strategy){
        this.strategy = strategy;
    }

    boolean compress(String source, String to ){
        return strategy.compress(source, to);
    }

    boolean uncompress(String source, String to){
        return strategy.unCompress(source, to);
    }
}
