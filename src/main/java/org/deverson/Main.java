package org.deverson;

import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args)
	{
		System.out.println( "<System.out.println> = Hello Main World !" );
        log.info("<log.info> = Hello Main World!");
    }
}
