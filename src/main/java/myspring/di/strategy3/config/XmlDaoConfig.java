//package myspring.di.strategy3.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import myspring.di.strategy2.dao.annot.UserDao;
//import myspring.di.strategy2.dao.annot.UserDaoImpl;
//import myspring.di.strategy2.service.annot.UserServiceImpl;
//
//@Configuration
//public class XmlDaoConfig {
//	@Bean
//	public UserDao user() {
//		return new UserDaoImpl();
//	}
//	
//	@Bean
//	public UserServiceImpl userServiceDao() {
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		userServiceImpl.setUserdao(userDao());
//		return userServiceImpl;
//}
