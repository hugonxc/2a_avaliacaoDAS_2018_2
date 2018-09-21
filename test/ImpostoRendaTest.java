import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ImpostoRendaTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {60.0, 1000.0, 8.5, 22.5, 3.14},
                {120.0, 500.0, 8.0, 22.5, 2.96},
                {240.0, 3000.0, 9.0, 20.0, 35.51},
        });
    }

    @Parameter
    public Double dias;
    @Parameter(1)
    public Double aplicacao_inicial;
    @Parameter(2)
    public Double juros_anual;
    @Parameter(3)
    public Double ir;
    @Parameter(4)
    public Double imposto_de_renda;


    @Test()
    public void testCalculaRendimentoBruto() {
        CDB cdb = new CDB(dias, aplicacao_inicial, juros_anual,ir);
        Double ir = cdb.calculaImpostoDeRenda();

        Assert.assertEquals(this.imposto_de_renda, ir, 0.01);

    }
}