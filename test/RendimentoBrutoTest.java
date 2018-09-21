import org.junit.Test;

public class RendimentoBrutoTest {

    @Test()
    public void testCalculaRendimentoBruto() {
        //Criação do CDB com valores iniciais de dias, aplicação inicial, taxa de juros anual, Aliquota IR
        CDB cdb = new CDB(60, 1000, 8.5, 22.5);

        Double rendimentoBruto = cdb.calculaRendimentoBruto();

        assertEquals(13.97, rendimentoBruto);
    }

}
