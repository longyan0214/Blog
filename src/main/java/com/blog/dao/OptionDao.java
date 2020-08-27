package com.blog.dao;

import com.blog.domain.Option;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OptionDao {

    List<Option> findAll();
}
