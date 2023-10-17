package myspring.di.strategy1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.strategy1.service.UserServiceImpl;


public class UserTest {
	BeanFactory factory;
	
	@BeforeEach
	void init() {
		factory = new GenericXmlApplicationContext("classpath:spring-beans-config1.xml");
	}
	
	@Test
	void Dao받기() {
		UserServiceImpl bean = (UserServiceImpl)factory.getBean("userServiceImpl");
		assertEquals(2, bean.getUserList().size());
	}
}
