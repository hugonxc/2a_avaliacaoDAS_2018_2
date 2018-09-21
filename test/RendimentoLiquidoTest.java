import junit.framework.Assert;
import org.junit.Test;

public class RendimentoLiquidoTest {

    @Test()
    public void testCalculaRendimentoLiquido() {
        CDB cdb = new CDB(60.0, 1000.0, 8.5, 22.5);
        Double rendimento_liquido = cdb.calculaRendimentoLiquido();

        Assert.assertEquals(1.0829, rendimento_liquido, 0.01);

    }

}
