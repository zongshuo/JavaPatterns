package prototype;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DEll on 2019-11-3.
 */
public class LazySingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        final LazySingleton lazySingleton = LazySingleton.getInstance();
        for(int i=0 ; i<100 ; i++){
            new Thread(){
                @Override
                public void run() {
                    Assert.assertEquals(lazySingleton, LazySingleton.getInstance());
                }
            }.start();
        }
    }

    @Test
    public void testGetInnerInstance() throws Exception {
        final LazySingleton lazySingleton = LazySingleton.getInnerInstance();
        for(int i=0 ; i<100 ; i++){
            new Thread(){
                @Override
                public void run() {
                    Assert.assertEquals(lazySingleton, LazySingleton.getInnerInstance());
                }
            }.start();
        }
    }
}