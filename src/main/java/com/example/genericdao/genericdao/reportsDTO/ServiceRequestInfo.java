package com.example.genericdao.genericdao.reportsDTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class ServiceRequestInfo implements Serializable {
        private Long sr_id;
        private LocalDate dateOfCreate;
        private String problem;
        private Long manager_id;

        public ServiceRequestInfo(Long sr_id, LocalDate dateOfCreate, String problem, Long manager_id) {
                this.sr_id = sr_id;
                this.dateOfCreate = dateOfCreate;
                this.problem = problem;
                this.manager_id = manager_id;
        }
}
