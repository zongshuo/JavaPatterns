package strategy;

/**
 * Created by DEll on 2019-11-3.
 * 具体策略类
 * CompressStrategy接口的一个具体实现
 * 实现了用zip格式对文件的压缩与解压
 */
public class ZipStrategy implements CompressStrategy {
    @Override
    public boolean compress(String source, String to) {
        System.out.println("compressing file to zip:"+source);
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println("uncompress file from zip:"+source);
        return true;
    }
}
