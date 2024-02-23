package com.dyd.utils;

import com.dyd.exception.ParkingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** @author gubinxian */
public class AssertUtil {

  private static final Logger logger = LoggerFactory.getLogger(AssertUtil.class);

  public static void isTrue(boolean expression, String message) throws ParkingException {
    if (!expression) {
      logger.info(message);
      throw new ParkingException(message);
    }
  }
}
