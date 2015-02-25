package th.co.hardcoresoft.bugtracking.dao;

import java.util.List;

import th.co.hardcoresoft.bugtracking.domain.Example;

public interface ExampleDao extends BaseDao<Example, Integer>{

	public void addExample(Example example);

	public List<Example> listExample();

	public void removeExample(Integer id);
}
