import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {
    @Test
    public void testsum() {
        Caculator cac = new Caculator();
        Assert.assertEquals(cac.sum(2,3),5);
    }

    @Test
    public void testsub() {
        Caculator cac = new Caculator();
        Assert.assertEquals(cac.sub(2,2),0);
    }
}
