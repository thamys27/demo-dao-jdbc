package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //insere no bd esse objeto
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer Id);//responsável por procurar no bd um objeto com esse ID
	List<Department> findAll();
	
}
