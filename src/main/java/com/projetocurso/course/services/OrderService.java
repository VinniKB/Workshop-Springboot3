package com.projetocurso.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetocurso.course.entities.Order;
import com.projetocurso.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
		// método para retornar todos os usuários do banco de dados.
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();// a operação get do optional retorna o objeto do tipo que está dentro de < > que está dentro do optional.
		// método para recuperar um usuário por Id
		
	}
}
