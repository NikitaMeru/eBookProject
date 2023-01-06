package com.nikita.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikita.dao.BookDao;
import com.nikita.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao productDao;
	@Override
	public void add(Book product) {
		productDao.save(product);
		
	}

//	@Override
//	public void modify(Book product) {
//		productDao.save(product);
//		
//	}
//
//	@Override
//	public void removeById(int id) {
//		productDao.deleteById(id);
//		
//	}
//
//	@Override
//	public Book getById(int id) {
//		Optional<Book> opt = productDao.findById(id);
//			if(opt.isPresent()) {
//				return opt.get();
//			}
//		return null;
//	}
//
//	@Override
//	public List<Book> getAll() {
//		Iterable<Book> itr = productDao.findAll();
//		List<Book> lst = new ArrayList<Book>();
//		itr.forEach(ele->lst.add(ele));
//		return lst;
//	}
//
//	@Override
//	public List<Book> getAllByName(String name) {
//		
//		return productDao.findByName(name);
//	}

}
