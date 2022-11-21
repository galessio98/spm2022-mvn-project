package unicam.spm2022.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import unicam.spm2022.MyClass;

public class MyClassTest {


  @Test
  //@Disabled
  public void testMultiply() {
    MyClass tester = new MyClass();
    assertEquals(50, tester.multiply(10, 5));
  }
}