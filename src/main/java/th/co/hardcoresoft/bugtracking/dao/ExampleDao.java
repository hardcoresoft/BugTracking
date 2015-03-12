package th.co.hardcoresoft.bugtracking.dao;

import java.util.List;

import th.co.hardcoresoft.bugtracking.domain.Example;
import th.co.hardcoresoft.common.dao.AbstractDao;

public interface ExampleDao extends AbstractDao<Example, Integer>{

	public void addExample(Example example);

	public List<Example> listExample();

	public void removeExample(Integer id);
}
