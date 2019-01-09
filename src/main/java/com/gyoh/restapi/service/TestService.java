package com.gyoh.restapi.service;

import java.util.List;
import com.gyoh.restapi.domain.TestVO;

/**
 * Test 서비스
 *
 * @author 오군영
 * @version 2018.08.01 v1.0
 */
public interface TestService {
  /**
   * Test 쿼리
   *
   * @param String
   * @return
   */
  public List<TestVO> readUser(String name);

}