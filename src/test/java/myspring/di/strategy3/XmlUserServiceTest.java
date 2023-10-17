//package myspring.di.strategy3;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import myspring.di.strategy2.dao.annot.UserDao;
//import myspring.di.strategy2.service.annot.UserServiceImpl;
//import myspring.di.strategy3.config.XmlDaoConfig;
//
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = XmlDaoConfig.class)
//public class XmlUserServiceTest {
//	
//	@Autowired
//	UserDao userdao;
//	
//	@Autowired
//	UserServiceImpl userServiceImpl;
//	
//	@Test
//	public void dao() {
//		assertEquals(2, userServiceImpl.getUserList().size());
//	}
//}
