package shop.dao;


import org.springframework.stereotype.Repository;
import shop.bean.Sh;

import java.util.List;

public interface ShDao {
	int  ck(Sh sh);
	int cksh(Sh sh);
	int jj(int id);
	List  cc(int sh);
	List bb();
	List  hws(String hw);
	Sh hwss(int id);
	List bbs();
	
}
