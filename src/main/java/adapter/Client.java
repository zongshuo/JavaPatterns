package adapter;

import java.util.Enumeration;

/**
 * Created by DEll on 2019-11-5.
 */
public class Client {
    public static void main(String [] args){
        BookNameList oldObject = new BookNameList();
        oldObject.setBookEnum();
        Enumeration enumeration = oldObject.getEnumeration();
        IteratorAdapter adapter = new IteratorAdapter(enumeration);
        NewBookNameList newObject = new NewBookNameList(adapter);
        newObject.setBookName();
        System.out.println("新系统中的图书列表");
        newObject.getBookName();
    }
}
