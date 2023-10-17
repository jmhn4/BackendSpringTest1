package myspring.cutomer.dao;

import java.util.List;

import myspring.customer.vo.CustomerVO;

public interface CustomerDao {
	public void insert(CustomerVO user);

	public List<CustomerVO> readAll();

	public void update(CustomerVO user);

	public void delete(String id);

	public CustomerVO read(String id);

}
