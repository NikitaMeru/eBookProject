package com.nikita.cntr;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.nikita.model.Book;
import com.nikita.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping(value = {"/book"})
	public String productAdd(@RequestBody Book book) {
		bookService.add(book);
		return "insert successful";
		
	}
	
//	@PutMapping(value = {"/product"})
//	public String productUpdate(@RequestBody Book product) {
//		productService.modify(product);
//		return "Update Successful";
//	}
//	
//	@DeleteMapping(value = {"/product"})
//	public String productDelete(@RequestParam int id) {
//		System.out.println("first delete");
//		productService.removeById(id);
//		return "success";
//	}
//	
//	@DeleteMapping(value = {"/product/{id}"})
//	public String productDelete1(@PathVariable int id) {
//		System.out.println("second delete");
//		productService.removeById(id);
//		return "success";
//	}
//	
//	@GetMapping(value = {"/product/{id}"} )
//	public Book productGet(@PathVariable int id) {
//		return productService.getById(id);
//		
//	}
//	
//	@GetMapping(value = {"/product"} )
//	public List<Book> productList(){
//		return productService.getAll();
//		
//	}
//	
//	@GetMapping(value = {"/product/byname/{name}"})
//	public List<Book> productListByName(@PathVariable String name){
//		return productService.getAllByName(name);
//	}
//	
////	@GetMapping(value = {"/product/byprice/{price}"})
////	public List<Product> productListBySalary(@PathVariable float price){
////		return productService.getBySalary(price);
////	}
	
}
