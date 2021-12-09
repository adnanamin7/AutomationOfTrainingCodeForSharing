package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("This is  NewTest1 annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is  before class annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is  after test annotation");
	  
  }

}
