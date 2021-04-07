package com.example.genericdao.genericdao;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.ClientOrganization;
import com.example.genericdao.genericdao.service.AbstractOrganizationService;
import com.example.genericdao.genericdao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class GenericdaoApplication {
     @Autowired
	 UserService userService;

     @Autowired
	AbstractOrganizationService organizationService;

	public static void main(String[] args) {

		SpringApplication.run(GenericdaoApplication.class, args);



	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

			User user1 = new User();
			user1.setFirstName("Вася");
			user1.setLastName("Пупкинг");
			//userService.create(user1);

			ClientOrganization clientOrg = new ClientOrganization();
			clientOrg.setName("Рога и Копыта");
			clientOrg.addNewEmployee(user1);
            organizationService.create(clientOrg);

		};
	}



}
