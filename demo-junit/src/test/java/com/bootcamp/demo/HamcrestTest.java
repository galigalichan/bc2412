package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.Matchers.typeCompatibleWith;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testBasic() {
    assertThat(Calculator.sum2(1, 2), is(equalTo(3)));
    assertThat(10, is(greaterThan(9)));
    assertThat("Hello World", not(containsString("!")));
    assertThat("Hello World", containsString("World"));
    String s = null;
    assertThat(s, nullValue());
    assertThat("hello", notNullValue());
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, is(sameInstance(s2)));
    assertThat(10, is(greaterThanOrEqualTo(10)));
    assertThat("", is(emptyString()));
  }

  // List
  @Test
  void testList() {
    List<String> names = Arrays.asList("John", "Steve", "Vincent");
    assertThat(names, hasItem("Steve"));
    assertThat(names, hasItems("Vincent", "John"));

    // contains() -> with ordering
    assertThat(names, contains("John", "Steve", "Vincent"));
    assertThat(names, containsInAnyOrder("Vincent", "Steve", "John"));

    // hasSize()
    assertThat(names, hasSize(3));
  }

  @Test
  void testNumber() {
    double tolerance = 0.01d;
    double actual = 3.14149d;

    // ! 3.13150 <= x <= 3.15149
    assertThat(actual, closeTo(3.13150, tolerance));
    assertThat(actual, not(closeTo(3.13149, tolerance)));
    assertThat(actual, closeTo(3.15149, tolerance));
    assertThat(actual, not(closeTo(3.15150, tolerance)));
  }

  @Test
  void testInstance() {
    // Check Child Object vs Parent Object
    Number num = new Double("3.0");
    assertThat(num, instanceOf(Double.class));

    // Check Child Class vs Parent Class
    assertThat(Long.class, typeCompatibleWith(Number.class));
    assertThat(String.class, typeCompatibleWith(CharSequence.class));
    assertThat(StringBuilder.class, typeCompatibleWith(CharSequence.class));
  }

  @Test
  void testCustomMatcher() {
    assertThat("HELLO", UppercaseMatcher.containUppercaseOnly());
    assertThat("vincent009@gmail.com", new EmailAddressMatcher());
  }

}
