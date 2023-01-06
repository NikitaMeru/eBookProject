package com.nikita.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nikita.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer>  {
	

}
