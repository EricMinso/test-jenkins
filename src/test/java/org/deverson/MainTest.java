package org.deverson;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.logging.Logger;

public class MainTest {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    @Test
    public void test()
	{
		System.out.println( "<System.out.println> = Hello Test World ! " );
		log.info("<log.info> = Hello Test World ! ");
        
		/// fail("Echec du test");
    }

}
