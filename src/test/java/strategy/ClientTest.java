package strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DEll on 2019-11-3.
 */
public class ClientTest {

    @Test
    public void testMain() throws Exception {
        Client client = new Client();
        client.main(new String[]{});
    }
}