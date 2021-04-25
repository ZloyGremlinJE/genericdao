package com.example.genericdao.genericdao.service.pagination;


import com.example.genericdao.genericdao.model.pagination.PageDto;

import java.util.Map;

public interface PaginationService<T, V> {
    PageDto<T> getPageDto(String methodName, Map<String, Object> parameters);
}
