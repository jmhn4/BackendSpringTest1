package myspring.di.strategy2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.strategy2.service.annot.UserService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-beans-config2.xml")
public class UserTest2 {
	
	@Autowired
//	@Qualifier("user")
	UserService userservice;
	
	@Test
	public void userServiceImpl() {
		assertEquals(2, userservice.getUserList().size());
	}

}
