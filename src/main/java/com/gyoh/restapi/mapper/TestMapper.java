package com.gyoh.restapi.mapper;

import java.util.List;
import com.gyoh.restapi.domain.TestVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
  public List<TestVO> readUser(String name);
}