package com.projetocurso.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetocurso.course.entities.User;
import com.projetocurso.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
		// método para retornar todos os usuários do banco de dados.
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();// a operação get do optional retorna o objeto do tipo que está dentro de < > que está dentro do optional.
		// método para recuperar um usuário por Id
		
	}
	public User insert(User obj) {
		return repository.save(obj);
	}
}
