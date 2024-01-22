package com.projetocurso.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetocurso.course.entities.Product;
import com.projetocurso.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
		// método para retornar todos os usuários do banco de dados.
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();// a operação get do optional retorna o objeto do tipo que está dentro de < > que está dentro do optional.
		// método para recuperar um usuário por Id
		
	}
}
