package com.projetocurso.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{



	//só com isso já é possível instanciar um objeto repository que vai ter várias operações para trabalhar.

}
