package th.co.hardcoresoft.bugtracking.dao;
import org.springframework.stereotype.Repository;

import th.co.hardcoresoft.bugtracking.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao {

}
