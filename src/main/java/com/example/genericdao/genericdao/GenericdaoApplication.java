package com.example.genericdao.genericdao;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.service.AbstractOrganizationService;
import com.example.genericdao.genericdao.service.ServiceRequestService;
import com.example.genericdao.genericdao.service.UserService;
import com.example.genericdao.genericdao.service.util.ReportService;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

@SpringBootApplication(scanBasePackages = "com.example.genericdao.genericdao")
@Transactional
public class GenericdaoApplication {
     @PersistenceContext
     EntityManager em;

    @Autowired
    UserService userService;

    @Autowired
    AbstractOrganizationService organizationService;

     @Autowired
    ServiceRequestService requestService;

     @Autowired
    ReportService reportService;


    public static void main(String[] args) {

        SpringApplication.run(GenericdaoApplication.class, args);


    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Hello Generic");

//            User client_director = new User();
//            client_director.setFirstName("Директор клиента");
//            client_director.setLastName("Пупкинг");
//            client_director.setRole(Role.CLIENT_DIRECTOR);
//
//            User client_employee1 = new User();
//            client_employee1.setFirstName("Работник клиента 1");
//            client_employee1.setLastName("Клиента");
//            client_employee1.setRole(Role.CLIENT_EMPLOYEE);
//
//            User client_employee2 = new User();
//            client_employee2.setFirstName("Работник клиента 2");
//            client_employee2.setLastName("Армагеддонович");
//            client_employee2.setRole(Role.CLIENT_EMPLOYEE);
//
//            User directorServiceCenter = new User();
//            directorServiceCenter.setFirstName("Директор сервиса");
//            directorServiceCenter.setLastName("Сервиса");
//            directorServiceCenter.setRole(Role.DIRECTOR);
//
//            User engineer1 = new User();
//            engineer1.setFirstName("Инженер1");
//            engineer1.setLastName("Петрович");
//            engineer1.setRole(Role.ENGINEER);
//
//            User engineer2 = new User();
//            engineer2.setFirstName("Инженер2");
//            engineer2.setLastName("Васильич");
//            engineer2.setRole(Role.ENGINEER);
//
//            User engineer3 = new User();
//            engineer3.setFirstName("Инженер3");
//            engineer3.setLastName("Халявыч");
//            engineer3.setRole(Role.ENGINEER);
//
//            User manager1 = new User();
//            manager1.setFirstName("Менеджер");
//            manager1.setLastName("Эффективыч");
//            manager1.setRole(Role.MANAGER);
//
//            ClientOrganization clientOrg = new ClientOrganization();
//            clientOrg.setName("Рога и Копыта");
//            clientOrg.addNewEmployee(client_director);
//            clientOrg.addNewEmployee(client_employee1);
//            clientOrg.addNewEmployee(client_employee2);
//            clientOrg.addNewEmployee(client_director);
//            organizationService.save(clientOrg);
//
//            ServiceCenterOrganization serviceCenterOrganization = new ServiceCenterOrganization();
//            serviceCenterOrganization.setName("Сервис рогов и копыт");
//            serviceCenterOrganization.addNewEmployee(directorServiceCenter);
//            serviceCenterOrganization.addNewEmployee(engineer1);
//            serviceCenterOrganization.addNewEmployee(engineer2);
//            serviceCenterOrganization.addNewEmployee(engineer3);
//            serviceCenterOrganization.addNewEmployee(manager1);
//            organizationService.save(serviceCenterOrganization);
//
//            ServiceRequest order1 = new ServiceRequest();
//            order1.setServiceCenterOrganization(serviceCenterOrganization);
//            order1.setClientOrganization(clientOrg);
//            order1.setStatusRequestType(StatusRequestType.NEW);
//            order1.addEngineer(engineer1);
//            order1.addEngineer(engineer2);
//            order1.setClient_employee(client_employee1);
//            order1.setService_manager(manager1);
//            order1.setRequestType(RequestType.REQUEST_TYPE_1);
//            order1.setDateOfCreate(LocalDate.of(2021,4,13));
//            order1.setProblem("Кондей не пашет");
//            order1.setVehicleNumber("1");
//            requestService.saveServiceRequest(order1);
//
//            ServiceRequest order2 = new ServiceRequest();
//            order2.setClientOrganization(clientOrg);
//            order2.setServiceCenterOrganization(serviceCenterOrganization);
//            order2.setStatusRequestType(StatusRequestType.IN_WORK);
//            order2.addEngineer(engineer1);
//            order2.setClient_employee(client_employee2);
//            order2.setService_manager(manager1);
//            order2.setRequestType(RequestType.REQUEST_TYPE_2);
//            order2.setDateOfCreate(LocalDate.of(2021,3,23));
//            order2.setProblem("Кондей  опять не пашет");
//            order2.setVehicleNumber("2");
//            requestService.saveServiceRequest(order2);




//            AbstractOrganization sc_organization =  organizationService.findById(2L);
//            AbstractOrganization cl_organization =  organizationService.findById(1L);
//
//
//
//
//            User engineer = userService.findById(6L);
//
//
//            Long countSRbyEngineer= reportService.getCountServiceRequestByEngineer(engineer, sc_organization);
//            System.out.println(countSRbyEngineer);
//            Long countSRbyClientOrg = reportService.getCountServiceRequestByClientOrganization(cl_organization, sc_organization);
//            System.out.println(countSRbyClientOrg);
//            Long countAllSR = reportService.getCountAllServiceRequest(sc_organization);
//            System.out.println(countAllSR);
//            List<User> userList = reportService.getAllUser();
//            System.out.println(userList.size());

//            String queryString = "from User";
//            Session session = em.unwrap(Session.class);
//            Query<User> query = session.createQuery(queryString, User.class);
//
//
//            int page = 2;
//            int maxResult = 10;
//            int maxNavigationResult = 3;
//
//            PaginationResult<User> result
//                    = new PaginationResult<>(query, page, maxResult, maxNavigationResult);
//
//            List<User> userList = result.getList();
//            int totalPages = result.getTotalPages();
//            int totalRecords = result.getTotalRecords();
//
//              //List<User>  res =  query.getResultList();
//
//
//
//
//            System.out.println(userList.size());

//            String queryString = "select new com.example.genericdao.genericdao.model.reports.ServiceRequestInfo(sr.id, sr.dateOfCreate, sr.problem, sr.service_manager.id) " +
//                    "from ServiceRequest sr  " +
//                    "where sr.serviceCenterOrganization.id=:sc_organization_id ";
//
//            Query query = em.createQuery(queryString, ServiceRequestInfo.class);
//
//            query.setParameter("sc_organization_id", 2L);
//
//            List<ServiceRequestInfo> list = query.getResultList();


        };
    }


}
