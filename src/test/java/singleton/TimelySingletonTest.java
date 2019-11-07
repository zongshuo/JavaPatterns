package singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DEll on 2019-11-3.
 */
public class TimelySingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        final TimelySingleton timelySingleton = TimelySingleton.getInstance();
        for(int i=0 ; i<100 ; i++){
            new Thread() {
                @Override
                public void run() {
                    Assert.assertEquals(timelySingleton,TimelySingleton.getInstance());
                }
            }.start();
        }
    }
}