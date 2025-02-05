package com.bootcamp.demo;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class EmailAddressMatcher extends TypeSafeMatcher<String> {
  @Override
  public boolean matchesSafely(String email) {
    return email.matches("[a-zA-Z0-9]+@[a-z]+.com");
  }

  @Override
  public void describeTo(Description description) { // pass by reference
    description.appendText("Wrong Email Address!!!");
  }
}
