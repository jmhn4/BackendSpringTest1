package myspring.cutomer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.customer.vo.CustomerVO;

//@Repository("userDao")
public class CustomerDaoImpl implements CustomerDao {

	//@Autowired
    private SqlSession session;
	
	public void setSqlSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public CustomerVO read(String id) {
		CustomerVO user  = session.selectOne("userNS.selectUserById", id);
		return user;
	}

	public List<CustomerVO> readAll() {
		List<CustomerVO> userList = session.selectList("userNS.selectUserList");
		return userList;
	}
	
	public void insert(CustomerVO user) {
		session.update("userNS.insertUser", user);
		System.out.println("등록된 Record UserId=" + user.getUserId() + " Name=" + user.getName());
	}

	@Override
	public void update(CustomerVO user) {
		session.update("userNS.updateUser", user);
	}

	@Override
	public void delete(String id) {
		session.delete("userNS.deleteUser", id);
		System.out.println("삭제된 Record with ID = " + id ); 
	}

}
