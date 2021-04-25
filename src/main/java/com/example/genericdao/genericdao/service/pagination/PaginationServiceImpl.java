package com.example.genericdao.genericdao.service.pagination;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.dao.pagination.PaginationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class PaginationServiceImpl<T, V> implements PaginationService<T, V>{

    private final Map<String, PaginationRepository<T>> pageBean;

    @Override
    public PageDto<T> getPageDto(String methodName, Map<String, Object> parameters) {
        PageDto<T> pageDto = new PageDto<>();
        PaginationRepository<T> paginationDaoBean = pageBean.get(methodName);

        int totalResultCount = paginationDaoBean.getCount(parameters);

        pageDto.setCurrentPageNumber((int)parameters.get("page"));
        pageDto.setTotalResultCount(totalResultCount);
        pageDto.setItemsOnPage((int)parameters.get("size"));
        pageDto.setItems(paginationDaoBean.getItems(parameters));
        pageDto.setTotalPageCount((int) Math.ceil(totalResultCount / (double)((int)parameters.get("size"))));

        return pageDto;
    }
}
