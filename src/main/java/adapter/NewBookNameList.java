package adapter;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by DEll on 2019-11-5.
 * 新类使用了Iterator接口的实现类
 */
public class NewBookNameList {
    LinkedList<String > bookList;
    Iterator iterator;

    NewBookNameList(Iterator iterator){
        bookList = new LinkedList<>();
        this.iterator = iterator;
    }

    public  void setBookName(){
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            bookList.add(name);
        }
    }

    public void getBookName(){
        Iterator<String> it = bookList.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }
    }

}
