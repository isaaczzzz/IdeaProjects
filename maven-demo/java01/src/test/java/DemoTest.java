import junit.framework.Assert;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void testSay() {
        Demo d = new Demo();
        String ret = d.say("isaac");
        Assert.assertEquals("Hello isaac", ret);
    }
}
