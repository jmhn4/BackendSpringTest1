package myspring.cutomer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import myspring.customer.dao.CustomerDaoImplJDBC.CustomerMapper;
import myspring.customer.vo.CustomerVO;

//@Repository("userDao")
public class CustomerDaoImplJDBC implements CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	//@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	class CustomerMapper implements RowMapper<CustomerVO> {
		public CustomerVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			CustomerVO user = new CustomerVO();
			user.setUserId(rs.getString("userid"));
			user.setName(rs.getString("name"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			return user;
		}
	}
	
	@Override
	public CustomerVO read(String id) {	
		String SQL = "select * from users where userid = ?";
		try {
			CustomerVO user = jdbcTemplate.queryForObject(SQL,
					new Object[] { id }, new CustomerMapper());
			return user;
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}	
	public void insert(CustomerVO user) {
		String SQL = "insert into users (userid, name, gender,city) values (?, ?, ?, ?)";
		jdbcTemplate.update(SQL, user.getUserId(), user.getName(), user.getGender(), user.getCity());
		
		System.out.println("등록된 Record CustomerId=" + user.getUserId() + " Name=" + user.getName());
	}

	public List<CustomerVO> readAll() {
		String SQL = "select * from users"; 
		List<CustomerVO>  userList = jdbcTemplate.query(SQL, new CustomerMapper());
		return userList;
	}

	//@Override
	public void delete(String id) {
		String SQL = "delete from users where userid = ?"; 
		jdbcTemplate.update(SQL, id); 
		System.out.println("삭제된 Record with ID = " + id ); 
	}

	//@Override
	public void update(CustomerVO user) {
		String SQL = "update users  set name = ?, gender = ?, city = ? where userid = ?"; 
		jdbcTemplate.update(SQL, user.getName(), user.getGender(), user.getCity(),user.getUserId()); 
		System.out.println("갱신된 Record with ID = " + user.getUserId() ); 
	}
}
