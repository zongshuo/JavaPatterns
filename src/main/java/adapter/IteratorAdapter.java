package adapter;

import java.util.Enumeration;
import java.util.Iterator;


/**
 * Created by DEll on 2019-11-5.
 * 适配器
 * 目标接口:Iterator
 * 被适配者：Enumeration
 * 通过Iterator接口使用Enumeration的具体实现类
 */
public class IteratorAdapter implements Iterator{
    Enumeration bookEnum;

    public IteratorAdapter(Enumeration bookEnum){
        this.bookEnum = bookEnum;
    }

    @Override
    public boolean hasNext() {
        return bookEnum.hasMoreElements();
    }

    @Override
    public Object next() {
        return bookEnum.nextElement();
    }
}
