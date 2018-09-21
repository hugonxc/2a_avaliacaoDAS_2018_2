import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RendimentoBrutoTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {60.0, 1000.0, 8.5, 22.5, 13.97},
                {120.0, 500.0, 8.0, 22.5, 13.15},
                {240.0, 3000.0, 9.0, 20.5, 177.53},
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
    public Double rendimento_bruto;


    @Test()
    public void testCalculaRendimentoBruto() {
        CDB cdb = new CDB(dias, aplicacao_inicial, juros_anual,ir);
        Double rendimento_bruto = cdb.calculaRendimentoBruto();

        assertEquals(this.rendimento_bruto, rendimento_bruto, 0.01);
    }
}