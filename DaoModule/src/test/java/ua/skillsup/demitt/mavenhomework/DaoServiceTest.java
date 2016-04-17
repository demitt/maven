package ua.skillsup.demitt.mavenhomework;

import org.junit.Test;

import static org.junit.Assert.*;

public class DaoServiceTest {

    @Test
    public void testGetConnection() throws Exception {
        DaoService dao = new DaoService();
        int connectionId = dao.getConnection("address", 3306, "login", "pass");
        assertTrue("Id соединения д.б. > 0", connectionId>0 );

    }
}