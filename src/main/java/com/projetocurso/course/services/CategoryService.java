package com.projetocurso.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetocurso.course.entities.Category;
import com.projetocurso.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
		// método para retornar todos os usuários do banco de dados.
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();// a operação get do optional retorna o objeto do tipo que está dentro de < > que está dentro do optional.
		// método para recuperar um usuário por Id
		
	}
}
