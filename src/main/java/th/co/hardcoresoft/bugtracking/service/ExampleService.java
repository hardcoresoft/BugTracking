package th.co.hardcoresoft.bugtracking.service;

import java.util.List;

import th.co.hardcoresoft.bugtracking.domain.Example;

public interface ExampleService {

	public void addExample(Example example);

	public List<Example> listExample();

	public void removeExample(Integer id);
}
