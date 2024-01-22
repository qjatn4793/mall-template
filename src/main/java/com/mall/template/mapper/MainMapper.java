package com.mall.template.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mall.template.vo.MainVo;

@Repository
@Mapper
public interface MainMapper {
	
	List<MainVo> getUser();
}