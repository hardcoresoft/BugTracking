package th.co.hardcoresoft.security.dao;

import org.springframework.stereotype.Repository;

import th.co.hardcoresoft.common.dao.AbstractDao;
import th.co.hardcoresoft.security.domain.User;

@Repository
public interface UserDao extends AbstractDao<User, String> {

}
