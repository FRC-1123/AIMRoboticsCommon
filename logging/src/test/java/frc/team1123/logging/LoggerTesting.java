package frc.team1123.logging;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTesting {

	@Test
	public void testLoggingMethod() {
		Logger log = LoggerFactory.getLogger(LoggerTesting.class);
		log.debug("This is a test");
		log.debug("This is a test of logging parameter {}", "'This is a parameter'");
		Exception ex = new Exception("Logging exceptions testing.");
		log.error("This is a problem!", ex);
	}
}
