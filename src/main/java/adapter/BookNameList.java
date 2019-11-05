package adapter;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by DEll on 2019-11-5.
 * 旧类中使用了Enumeration接口的实现类
 */
public class BookNameList {
    private Vector<String> vector;
    private Enumeration bookEnum;
    BookNameList(){
        vector = new Vector<>();
    }

    public void setBookEnum(){
        vector.add("java程序设计");
        vector.add("j2me程序设计");
        vector.add("xml程序设计");
        vector.add("jsp程序设计");
    }

    public Enumeration getEnumeration(){
        return vector.elements();
    }
}
