package com.example.genericdao.genericdao.dao.reportsDao;

import com.example.genericdao.genericdao.dao.pagination.PaginationRepository;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository(value = "PaginationServiceRequestInfoDao")
public class PaginationServiceRequestInfoRepositoryImpl implements PaginationRepository<ServiceRequestInfo> {

    @PersistenceContext
    private EntityManager em;

    @Override
    @SuppressWarnings(value = "unchecked")
    public List<ServiceRequestInfo> getItems(Map<String, Object> parameters) {

        int page = (int)parameters.get("page");
        int size = (int)parameters.get("size");
        List<Long> serviceRequestsIds =(List<Long>) em.createQuery(
                "select sr.id from ServiceRequest sr")
                .setFirstResult(page*size-size)
                .setMaxResults(size)
                .getResultList();

        return (List<ServiceRequestInfo>) em.createQuery(
                "select new com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo(sr.id, sr.dateOfCreate, sr.problem, sr.service_manager.id) " +
                        "from ServiceRequest sr " +
                        "where sr.id in (:ids) " +
                        "order by sr.id")
                .setParameter("ids", serviceRequestsIds)
                .getResultList();
    }

    @Override
    public int getCount(Map<String, Object> parameters) {
        return (int)(long) em.createQuery("select count (sr) from ServiceRequest sr").getSingleResult();
    }
}
