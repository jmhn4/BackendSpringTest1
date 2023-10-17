package myspring.di.strategy2.dao.annot;

import java.util.List;

import myspring.user.vo.UserVO;

public interface UserDao {

	public List<UserVO> readAll();

	public UserVO read(int id);

}
