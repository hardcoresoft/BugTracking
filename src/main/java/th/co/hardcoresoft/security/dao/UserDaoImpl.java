package th.co.hardcoresoft.security.dao;
import org.springframework.stereotype.Repository;

import th.co.hardcoresoft.common.dao.AbstractDaoImpl;
import th.co.hardcoresoft.security.domain.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao {

}
