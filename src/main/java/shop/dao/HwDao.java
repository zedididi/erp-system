package shop.dao;


import org.springframework.stereotype.Repository;
import shop.bean.Hw;

import java.util.List;


public interface HwDao {
	List  sp(Hw hw);
	int   spxj(Hw hw);
	int  xjrk(Hw hw);
	int jj(int id);
	Hw  dy(int id);
	int ckkk(Hw hw);
	Hw dys(String name);
	int updateHw(Hw hw);
}
