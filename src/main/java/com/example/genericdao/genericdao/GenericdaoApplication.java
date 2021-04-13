package com.example.genericdao.genericdao;

import com.example.genericdao.genericdao.model.RequestType;
import com.example.genericdao.genericdao.model.Role;
import com.example.genericdao.genericdao.model.ServiceRequest;
import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.ClientOrganization;
import com.example.genericdao.genericdao.model.organization.ServiceCenterOrganization;
import com.example.genericdao.genericdao.service.AbstractOrganizationService;
import com.example.genericdao.genericdao.service.ServiceRequestService;
import com.example.genericdao.genericdao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication(scanBasePackages = "com.example.genericdao.genericdao")
public class GenericdaoApplication {
    @Autowired
    UserService userService;

    @Autowired
    AbstractOrganizationService organizationService;

     @Autowired
    ServiceRequestService requestService;


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
            user1.setRole(Role.CLIENT_DIRECTOR);



            User directorServiceCenter = new User();
            directorServiceCenter.setFirstName("Директор");
            directorServiceCenter.setLastName("Сервиса");
            directorServiceCenter.setRole(Role.DIRECTOR);

            User user3 = new User();
            user3.setFirstName("Барбекю Сысой");
            user3.setLastName("Армагеддонович");
            user3.setRole(Role.CLIENT_EMPLOYEE);

            User engineer1 = new User();
            engineer1.setFirstName("Инженер1");
            engineer1.setLastName("Петрович");
            engineer1.setRole(Role.ENGINEER);


            User engineer2 = new User();
            engineer2.setFirstName("Инженер2");
            engineer2.setLastName("Васильич");
            engineer2.setRole(Role.ENGINEER);




            ClientOrganization clientOrg = new ClientOrganization();
            clientOrg.setName("Рога и Копыта");
            clientOrg.addNewEmployee(user1);
            clientOrg.addNewEmployee(user3);
            organizationService.save(clientOrg);

            ServiceCenterOrganization serviceCenterOrganization = new ServiceCenterOrganization();
            serviceCenterOrganization.setName("Сервис рогов и копыт");
            serviceCenterOrganization.addNewEmployee(directorServiceCenter);
            serviceCenterOrganization.addNewEmployee(engineer1);
            serviceCenterOrganization.addNewEmployee(engineer2);
            organizationService.save(serviceCenterOrganization);

            ServiceRequest order1 = new ServiceRequest();
            order1.setCustomer(engineer1);
            order1.setRequestType(RequestType.REQUEST_TYPE_1);
            order1.setDateOfCreate(LocalDate.of(2021,4,13));
            order1.setProblem("Кондей не пашет");
            order1.setVehicleNumber("1");
            requestService.saveServiceRequest(order1);

            ServiceRequest order2 = new ServiceRequest();
            order2.setCustomer(engineer2);
            order2.setRequestType(RequestType.REQUEST_TYPE_2);
            order2.setDateOfCreate(LocalDate.of(2021,3,23));
            order2.setProblem("Кондей  опять не пашет");
            order2.setVehicleNumber("2");
            requestService.saveServiceRequest(order2);






        };
    }


}
