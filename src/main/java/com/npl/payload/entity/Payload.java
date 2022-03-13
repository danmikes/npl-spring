package com.npl.payload.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Collections;
import java.util.List;

@Data
public class Payload {

  @NotEmpty
  private String string;
  @Pattern(regexp = "-?[0-9]+")
  private String stringinteger;
  private int integer;
  private String optional;
  private List<String> list;
  private ObjectWrapper object;
  private List<ObjectlistWrapper> objectlist;

  public void setString(String string) {
    this.string = string.trim();
  }

  public void setList(List<String> list) {
    this.list = list;
    Collections.reverse(this.list);
  }
}
