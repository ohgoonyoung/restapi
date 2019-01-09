package com.gyoh.restapi.domain;

import org.hibernate.validator.internal.util.privilegedactions.GetMethods;

import io.swagger.annotations.ApiModelProperty;

/**
 * 응답 도메인
 *
 * @author 오군영
 * @version 2018.08.01 v1.0
 */
public class ResponseVO<T> {

  @ApiModelProperty(value = "코드")
  private int code = 200;
  @ApiModelProperty(value = "메세지")
  private String message;
  @ApiModelProperty(value = "성공여부")
  private boolean check = true;
  @ApiModelProperty(value = "json 데이터")
  private T response;

  public void setCode(int code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setCheck(boolean check) {
    this.check = check;
  }

  public void setResponse(T response) {
    this.response = response;
  }

  public int getCode() {
    return this.code;
  }

  public String getMessaage() {
    return this.message;
  }

  public Boolean getCheck() {
    return this.check;
  }

  public T getResponse() {
    return this.response;
  }

  @Override
  public String toString() {
    return "ResponseVO [ code=" + this.code + ", message=" + this.message + ", check=" + this.check + ", response="
        + this.response + "]";
  }
}