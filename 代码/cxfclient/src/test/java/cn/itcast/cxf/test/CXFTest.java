package cn.itcast.cxf.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.cxfserver.impl.IWeatherService;

public class CXFTest {

	@Test
	public void clientTest(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext_cxf.xml");
		IWeatherService ws = (IWeatherService)ac.getBean("weatherClient");
		System.out.println(ws.info("北京"));
		System.out.println(ws.info("深圳"));
	}
}
