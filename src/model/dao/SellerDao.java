package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //insere no bd esse objeto
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer Id);//responsável por procurar no bd um objeto com esse ID
	List<Seller> findAll();
}
