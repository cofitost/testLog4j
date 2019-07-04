package selab.cofitost.testlog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
  private static final Logger logger = LogManager.getLogger(App.class);

  public static void main(String[] args) {

    logger.debug("debug");
    logger.info("info");
    logger.warn("warn");
    logger.error("error");
    logger.fatal("fatal");
  }
}
