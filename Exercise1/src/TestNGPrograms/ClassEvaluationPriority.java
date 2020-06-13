package TestNGPrograms;

import org.testng.annotations.Test;

public class ClassEvaluationPriority {
  @Test (priority=1)
  public void f() {
	  System.out.println("Print letter f");
  }
  
  @Test (priority=2)
  public void d() {
	  System.out.println("Print letter d");
  }
  
  @Test (priority=200)
  public void a() {
	  System.out.println("Print letter a");
  }
  
  @Test (priority=200)
  public void c() {
	  System.out.println("Print letter c");
  }
  
  @Test (dependsOnMethods="a")
  public void m() {
	  System.out.println("Print letter m");
  }
  
  @Test (priority=250)
  public void e() {
	  System.out.println("Print letter e");
  }
  
  @Test (enabled=false)
  public void z() {
	  System.out.println("Print letter z");
  }
  
  @Test (enabled=true)
  public void x() {
	  System.out.println("Print letter x");
  }
}
