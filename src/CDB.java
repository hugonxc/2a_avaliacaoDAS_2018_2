public class CDB {

    private Double dias;
    private Double aplicacao_inicial;
    private Double juros_anual;
    private Double ir;

    public CDB() {
    }

    public CDB(Double dias, Double aplicacao_inicial, Double juros_anual, Double ir) {
        this.dias = dias;
        this.aplicacao_inicial = aplicacao_inicial;
        this.juros_anual = juros_anual;
        this.ir = ir;
    }

    public Double getDias() {
        return dias;
    }

    public void setDias(Double dias) {
        this.dias = dias;
    }

    public Double getAplicacao_inicial() {
        return aplicacao_inicial;
    }

    public void setAplicacao_inicial(Double aplicacao_inicial) {
        this.aplicacao_inicial = aplicacao_inicial;
    }

    public Double getJuros_anual() {
        return juros_anual;
    }

    public void setJuros_anual(Double juros_anual) {
        this.juros_anual = juros_anual;
    }

    public Double getIr() {
        return ir;
    }

    public void setIr(Double ir) {
        this.ir = ir;
    }


    public Double calculaRendimentoBruto(){
        Double dias = this.getDias();
        Double aplicacao_inicial = this.getAplicacao_inicial();
        Double taxa_anual = this.getJuros_anual();

        Double tempo = dias/365;

        Double rendimento_bruto = (tempo * aplicacao_inicial * taxa_anual)/ 100;

        return rendimento_bruto;
    }



}
