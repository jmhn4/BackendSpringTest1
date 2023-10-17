package myspring.di.strategy3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import myspring.di.strategy2.service.annot.UserService;
import myspring.di.strategy3.config.AnnotatedUserServiceConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AnnotatedUserServiceConfig.class,
									 loader = AnnotationConfigContextLoader.class)

public class AnnotatedUserServiceTest {
	@Autowired
	UserService userservice;
	
	@Test
	public void userServiceImpl() {
		assertEquals(2, userservice.getUserList().size());
	}
}
