package myspring.customer.service;

import java.util.List;
import java.util.Map;

import myspring.customer.vo.CustomerVO;

public interface CustomerService {
	
	public void insertCutomer(CustomerVO user);

	public List<CustomerVO> getCustomerList();

	public void deleteCustomerr(String id);

	public CustomerVO getCustomer(String id);

	public void updateCustomer(CustomerVO user);
	
}
