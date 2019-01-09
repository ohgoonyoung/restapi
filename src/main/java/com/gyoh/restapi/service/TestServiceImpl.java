package com.gyoh.restapi.service;

import java.util.List;
import com.gyoh.restapi.component.MapperComponent;
import com.gyoh.restapi.domain.TestVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TestServiceImpl implements TestService {

  @Autowired
  private MapperComponent mapper;

  @Override
  public List<TestVO> readUser(String name) {
    return mapper.getTestMapper().readUser("readUserTest");
  }

}