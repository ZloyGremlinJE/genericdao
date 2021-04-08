package com.example.genericdao.genericdao;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.service.AbstractOrganizationService;
import com.example.genericdao.genericdao.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenericdaoApplication {
    @Autowired
    UserServiceImpl userService;

    @Autowired
    AbstractOrganizationService organizationService;

    public static void main(String[] args) {

        SpringApplication.run(GenericdaoApplication.class, args);


    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Hello Generic");
            User user1 = new User();
            user1.setFirstName("Вася");
            user1.setLastName("Пупкинг");
            userService.dao.create(user1);
//            user1.setRole(Role.CLIENT_DIRECTOR);
//
//            User user2 = new User();
//            user2.setFirstName("Конь");
//            user2.setLastName("Педальный");
//            user2.setRole(Role.DIRECTOR);
//
//            User user3 = new User();
//            user3.setFirstName("Барбекю Сысой");
//            user3.setLastName("Армагеддонович");
//            user3.setRole(Role.CLIENT_EMPLOYEE);
//
//            ClientOrganization clientOrg = new ClientOrganization();
//            clientOrg.setName("Рога и Копыта");
//            clientOrg.addNewEmployee(user1);
//            clientOrg.addNewEmployee(user3);
//            organizationService.create(clientOrg);
//
//            ServiceCenterOrganization serviceCenterOrganization = new ServiceCenterOrganization();
//            serviceCenterOrganization.setName("Сервис рогов и копыт");
//            serviceCenterOrganization.addNewEmployee(user2);
//            organizationService.create(serviceCenterOrganization);
//            List<User> userList = userService.findAll();
//
//            User userUpdate = userService.findOne(userList.get(0).getId());
//            userUpdate.setLastName("Мультипедальный");
//             userUpdate = userService.update(userUpdate);
//
//            User userDelete =  userService.findOne(userList.get(0).getId());
//            userService.delete(userDelete);
//
//             List<AbstractOrganization> organizations = organizationService.findAll();
//             AbstractOrganization organizationDelete= organizationService.findOne(organizations.get(1).getId()) ;
//             //organizationService.delete(organizationDelete);
//             organizationService.deleteById(organizations.get(0).getId());

        };
    }


}
