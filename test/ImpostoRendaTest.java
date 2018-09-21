import org.junit.Assert;
import org.junit.Test;


public class ImpostoRendaTest {
    @Test()
    public void test1() {
        CDB cdb = new CDB(60.0, 1000.0, 8.5,22.5);

        Double ir = cdb.calculaImpostoDeRenda();

        Assert.assertEquals(3.14, ir, 0.01);
    }
}