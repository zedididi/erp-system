package shop.service;


import org.springframework.stereotype.Service;
import shop.bean.User;


import java.util.List;



public interface UserService {
	User login(User user);
	int touser(User user);
	List findall( User user);
	int delete(int id);
	User findid(int id);
	int  userup(User user);


}
