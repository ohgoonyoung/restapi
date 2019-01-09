package com.gyoh.restapi.component;

import com.gyoh.restapi.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Service 컴포넌트
 *
 * @author 오군영
 * @version 2018.08.01 v1.0
 */
@Component
public class ServiceComponent {

  @Autowired
  private TestService testService;

  public TestService getTestService() {
    return this.testService;
  }
}