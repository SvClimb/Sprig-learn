package ru.mts.spring.ws;

import javax.swing.Spring;

public class Greeting {

  private final long id;
  private final String content;
  private final String test;

  public Greeting(long id, String content, String test) {
    this.id = id;
    this.content = content;
    this.test = test;
  }

  public long getId() {
    return id;
  }

  public String getTest() {
    return test;
  }

  public String getContent() {
    return content;
  }
}
