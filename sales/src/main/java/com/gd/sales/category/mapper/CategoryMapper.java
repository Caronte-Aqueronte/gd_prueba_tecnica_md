package com.gd.sales.category.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.gd.sales.category.model.dto.response.CategoryDTO;
import com.gd.sales.category.model.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    public List<CategoryDTO> fromEntitiesToResponseDtos(List<Category> categories);
}
