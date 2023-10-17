package myspring.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.customer.dao.CustomerDao;
import myspring.customer.vo.CustomerVO;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerdao;
	
	@Override
	public void insertCustomer(CustomerVO user) {
		customerdao.insert(user);
	}

	public List<CustomerVO> getCustomerList() {
		return customerdao.readAll();
	}

	@Override
	public void deleteCustomer(String id) {
		customerdao.delete(id);
		
	}

	@Override
	public CustomerVO getCustomer(String id) {
		return customerdao.read(id);
	}

	@Override
	public void updateCustomer(CustomerVO user) {
		customerdao.update(user);
	}
}
