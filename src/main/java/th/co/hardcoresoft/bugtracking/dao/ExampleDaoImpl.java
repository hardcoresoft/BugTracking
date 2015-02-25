package th.co.hardcoresoft.bugtracking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import th.co.hardcoresoft.bugtracking.domain.Example;

@Repository
public class ExampleDaoImpl extends BaseDaoImpl<Example, Integer> implements ExampleDao {

	public void addExample(Example example) {
		getCurrentSession().save(example);
	}

	@SuppressWarnings("unchecked")
	public List<Example> listExample() {
		return getCurrentSession().createQuery("from Example").list();
	}

	public void removeExample(Integer id) {
		Example example = (Example) getCurrentSession().load(Example.class, id);
		if (null != example) {
			getCurrentSession().delete(example);
		}

	}
}
