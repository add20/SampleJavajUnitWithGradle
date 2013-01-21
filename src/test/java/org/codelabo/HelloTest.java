import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import org.codelabo.*;

@RunWith(JUnit4.class)
public class HelloTest {
  @Test
  public void testHelloMethod() {
    assertEquals(Hello.hello(), "Hello, World!");
  }
}
