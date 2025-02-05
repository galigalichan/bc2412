package com.bootcamp.demo;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class UppercaseMatcher extends TypeSafeMatcher<String> {

  public static UppercaseMatcher containUppercaseOnly() {
    return new UppercaseMatcher();
  }
  
  // String Regular Expression = The Rule of String
  @Override
  public boolean matchesSafely(String item) {
    return item.matches("[A-Z]+"); 
  }

  @Override
  public void describeTo(Description description) { // pass by reference
    description.appendText("Contain Uppercase Only!!!");
  }

}
