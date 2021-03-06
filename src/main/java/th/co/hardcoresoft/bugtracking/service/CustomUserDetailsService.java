package th.co.hardcoresoft.bugtracking.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import th.co.hardcoresoft.bugtracking.dao.UserDao;
import th.co.hardcoresoft.bugtracking.domain.Role;
import th.co.hardcoresoft.bugtracking.domain.User;

/**
 * A custom {@link UserDetailsService} where user information is retrieved from
 * a JPA repository
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED)
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	/**
	 * Returns a populated {@link UserDetails} object. The username is first
	 * retrieved from the database and then mapped to a {@link UserDetails}
	 * object.
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			User user = userDao.get(username.toLowerCase());
			if (user == null) {
				throw new UsernameNotFoundException(username);
			}

			user.setAuthorities(this.getAuthorities(user));
			return user;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Retrieves a collection of {@link GrantedAuthority} based on a numerical
	 * role
	 * 
	 * @param role
	 *            the numerical role
	 * @return a collection of {@link GrantedAuthority

	 */
	public Collection<? extends GrantedAuthority> getAuthorities(th.co.hardcoresoft.bugtracking.domain.User domainUser) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(domainUser));
		return authList;
	}

	/**
	 * Converts a numerical role to an equivalent list of roles
	 * 
	 * @param role
	 *            the numerical role
	 * @return list of roles as as a list of {@link String}
	 */
	public List<String> getRoles(th.co.hardcoresoft.bugtracking.domain.User domainUser) {
		List<String> authorities = new ArrayList<String>();

		List<Role> roles = domainUser.getRoles();
		for (Role role : roles) {
			authorities.add(role.getRoleCode());
		}
		return authorities;
	}

	/**
	 * Wraps {@link String} roles to {@link SimpleGrantedAuthority} objects
	 * 
	 * @param roles
	 *            {@link String} of roles
	 * @return list of granted authorities
	 */
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}
}