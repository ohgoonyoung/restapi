package com.gyoh.restapi.controller.helloWorld;

import com.gyoh.restapi.component.ServiceComponent;
import com.gyoh.restapi.domain.ResponseVO;
import com.gyoh.restapi.domain.TestVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
public class HelloWorldController {

  @Autowired
  private ServiceComponent service;

  /**
   * Api Test Controller
   *
   * @param null
   * @return
   */
  @ApiOperation(value = "", notes = "API Test")
  @GetMapping("/v1.0/test")
  public ResponseVO test() {
    ResponseVO responseVO = new ResponseVO();
    return responseVO;
  }

  /**
   * Api Test Controller
   *
   * @param null
   * @return
   */
  @ApiOperation(value = "", notes = "API Test")
  @PostMapping("/v1.0/test/{test}")
  public ResponseVO<List<TestVO>> testPost(@PathVariable String test) {
    ResponseVO<List<TestVO>> responseVO = new ResponseVO<>();
    List<TestVO> testList = service.getTestService().readUser(test);
    responseVO.setResponse(testList);
    if (testList.size() == 0) {
      responseVO.setCheck(false);
    }
    return responseVO;
  }
}