package com.npl.payload.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Collections;
import java.util.List;

@Data
public class ObjectlistWrapper {

  @NotEmpty
  private String string;
  private List<String> list;

  public void setString(String string) {
    this.string = string.trim();
  }

  public void setList(List<String> list) {
    this.list = list;
    Collections.reverse(this.list);
  }
}
