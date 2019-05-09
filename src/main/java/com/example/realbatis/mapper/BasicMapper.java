package com.example.realbatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BasicMapper {
    List list(); 
}