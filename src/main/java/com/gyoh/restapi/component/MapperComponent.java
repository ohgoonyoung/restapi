package com.gyoh.restapi.component;

import com.gyoh.restapi.mapper.TestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperComponent {

  @Autowired
  private TestMapper testMapper;

  public TestMapper getTestMapper() {
    return this.testMapper;
  }

}