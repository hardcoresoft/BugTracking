package th.co.hardcoresoft.bugtracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.hardcoresoft.bugtracking.dao.ExampleDao;
import th.co.hardcoresoft.bugtracking.domain.Example;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDao exampleDAO;

	@Transactional
	public void addExample(Example example) {
		exampleDAO.save(example);
	}

	@Transactional
	public List<Example> listExample() {

		return exampleDAO.getAll();
	}

	@Transactional
	public void removeExample(Integer id) {
		exampleDAO.delete(id);
	}
}
