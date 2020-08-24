package com.application.dao;

import java.util.List;

import com.application.exception.ProductException;
import com.application.model.Product;



public interface ProductDao {

	Product add(Product contact) throws ProductException;

	Product save(Product contact) throws ProductException;

	Product getById(int contactId) throws ProductException;

	List<Product> getAll() throws ProductException;
}
