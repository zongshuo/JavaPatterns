package strategy;

/**
 * Created by DEll on 2019-11-3.
 * 使用CompressStrategy策略的客户端
 */
public class Client {
    static void main(String [] args){
        ContextStrategy zip = new ContextStrategy(new ZipStrategy());
        zip.compress("a", "b");
        zip.uncompress("a", "b");
        ContextStrategy gzip = new ContextStrategy(new GzipStrategy());
        gzip.compress("a", "b");
        gzip.uncompress("a", "b");
    }
}
