package com.npl.payload.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class ObjectWrapper {

  @NotEmpty
  private String string;
  @Pattern(regexp = "-?[0-9]+")
  private String stringinteger;
  private int integer;
  private String optional;

  public void setString(String string) {
    this.string = string.trim();
  }
}
