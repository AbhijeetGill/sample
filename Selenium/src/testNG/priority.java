package testNG;

import org.testng.annotations.Test;

public class priority {
  @Test(groups="A")
  public void a() 
  {
  }
  @Test(groups={"A"})
  public void b()
  {
  }
  @Test(groups="A")
  public void c()
  {
  }
  @Test(priority=2)
  public void d()
  {
  }
  @Test(priority=1)
  public void e()
  {
  }
  @Test(priority=6)
  public void f() 
  {
  }
}
