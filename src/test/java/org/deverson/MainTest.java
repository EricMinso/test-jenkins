package org.deverson;

import static org.junit.Assert.*;

import java.util.logging.Logger;
import org.junit.Test;

public class MainTest {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    @Test
    public void test() {
        // fail("Not yet implemented");
		log.info("log.info = Hello Test World ! ");
		System.out.println( "System.out.println = Hello Test World ! " );
    }

}
