package th.co.hardcoresoft.bugtracking.dao;

import org.springframework.stereotype.Repository;

import th.co.hardcoresoft.bugtracking.domain.User;

@Repository
public interface UserDao extends BaseDao<User, String> {

}
