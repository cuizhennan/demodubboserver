package demo.service.impl;

import java.util.Calendar;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import demo.service.IDemoService;

/**
 * @author zhennan-cui @date 2015年9月16日
 */
public class DemoServiceImpl implements IDemoService {
	private static final Logger logger = LogManager.getLogger(DemoServiceImpl.class);

	@Override
	public String sayHello(String args) {
		args = "Hello provider " + args + " 2:" + Calendar.getInstance().getTime();
		logger.info(args);

		return args;
	}
}
