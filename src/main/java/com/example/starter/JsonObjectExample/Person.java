package com.example.starter.JsonObjectExample;

public class Person {
  private Integer id;
  private String name;
  private boolean levevertx;

  public Person() {
  }

  public Person(Integer id, String name, boolean levevertx) {
    this.id = id;
    this.name = name;
    this.levevertx = levevertx;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isLevevertx() {
    return levevertx;
  }

  public void setLevevertx(boolean levevertx) {
    this.levevertx = levevertx;
  }
}
