package strategy;

/**
 * Created by DEll on 2019-11-3.
 * 具体策略类
 * CompressStrategy策略的一个具体实现
 * 实现了使用gzip格式对文件的压缩与解压
 */
public class GzipStrategy implements CompressStrategy {
    @Override
    public boolean compress(String source, String to) {
        System.out.println("compressing file to gzip:"+source);
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println("uncompress file from gzip:"+source);
        return true;
    }
}
