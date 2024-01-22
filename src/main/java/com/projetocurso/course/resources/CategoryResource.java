package com.projetocurso.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetocurso.course.entities.Category;
import com.projetocurso.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}") // isso indica que requisição vai aceitar um id entro da url
	public ResponseEntity<Category> findById(@PathVariable Long id){ 
		//pathvariable é necessário para o spring aceitar esse id e considerar como paramentro que vai chegar na url
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		//.ok para indicar que teve sucesso e no corpo da requisição que é o .body colocar o obj
	}
}

