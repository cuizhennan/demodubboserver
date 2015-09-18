package demo.service.impl;

import java.util.Calendar;

import demo.service.IDemoService;

/**
 * @author zhennan-cui @date 2015年9月16日
 */
public class DemoServiceImpl implements IDemoService {

    @Override
    public String sayHello(String args) {
        args = "Hello " + args + " 2:" + Calendar.getInstance().getTime();
        System.out.println(args);

        return args;
    }
}
