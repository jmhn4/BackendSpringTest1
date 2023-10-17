package myspring.cutomer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.customer.dao.mapper.CustomerMapper;
import myspring.cutomer.vo.CustomerVO;

@Repository("userDao")
public class CustomerDaoImplMapper implements CustomerDao {
	@Autowired
	private CustomerDaoImplJDBCMapper customerMapper;	
	
	@Override
	public CustomerDaoImplJDBCVO read(String id) {
		CustomerVO user  = customerMapper.selectCustomerById(id);
		return user;
	}
	
	public List<CustomerVO> readAll() {
		List<CustomerVO> userList = userMapper.selectUserList();
		return userList;
	}

	public void insert(CustomerVO user) {
		customerMapper.insertCustomer(user);
		System.out.println("등록된 Record UserId=" + user.getUserId() + 
				" Name=" + user.getName());
	}

	@Override
	public void update(CustomerVO user) {
		customerMapper.updateCustomer(user);
	}
	
	@Override
	public void delete(String id) {
		customerMapper.deleteUser(id);
		System.out.println("삭제된 Record with ID = " + id ); 
	}
}










