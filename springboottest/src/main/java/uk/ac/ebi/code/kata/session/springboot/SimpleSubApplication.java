package uk.ac.ebi.code.kata.session.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Project: demo
 * Package: uk.ac.ebi.code.kata.session.springboot
 * Timestamp: 2017-03-08 14:22
 * ---
 * © 2017 Manuel Bernal Llinares <mbdebian@gmail.com>
 * All rights reserved.
 */
@Component
public class SimpleSubApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(SimpleSubApplication.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("SimpleSubApplication JUST STARTED TO RUN");
        Thread.currentThread().sleep(3000);
        logger.info("SimpleSubApplication IS DONE");
    }
}
