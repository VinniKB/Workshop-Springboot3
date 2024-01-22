package com.projetocurso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	//só com isso já é possível instanciar um objeto repository que vai ter várias operações para trabalhar.

}
