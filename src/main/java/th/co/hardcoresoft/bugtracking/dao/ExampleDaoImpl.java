package th.co.hardcoresoft.bugtracking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import th.co.hardcoresoft.bugtracking.domain.Example;
import th.co.hardcoresoft.common.dao.AbstractDaoImpl;

@Repository
public class ExampleDaoImpl extends AbstractDaoImpl<Example, Integer> implements ExampleDao {

	public void addExample(Example example) {
		save(example);
	}

	@SuppressWarnings("unchecked")
	public List<Example> listExample() {
		return getCurrentSession().createCriteria(Example.class).list();
	}

	public void removeExample(Integer id) {
		Example example = (Example) getCurrentSession().load(Example.class, id);
		if (null != example) {
			getCurrentSession().delete(example);
		}

	}
}
