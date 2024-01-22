package com.projetocurso.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetocurso.course.entities.User;
import com.projetocurso.course.repositories.UserRepository;

@Configuration // p falar para o spring que é uma classe especifica de configuração usar configuration
@Profile("test") //especificar o perfil para rodar somente quando estiver nesse perfil.
public class TestConfig implements CommandLineRunner {
	
	@Autowired // somente com essa anotação o spring resolve essa dependencia e associa uma instancia dentro.
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));// saveAll passa uma lista de objetos e ele salva no banco de dados
		// e para criar a lista Arrays.asList usando u1 e u2 como argumento.
		
	}
	
	
}
