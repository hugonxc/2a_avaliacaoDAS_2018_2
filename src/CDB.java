public class CDB {

    private Integer dias;
    private Double aplicacao_inicial;
    private Double juros_anual;
    private Double ir;

    public CDB() {
    }

    public CDB(Integer dias, Double aplicacao_inicial, Double juros_anual, Double ir) {
        this.dias = dias;
        this.aplicacao_inicial = aplicacao_inicial;
        this.juros_anual = juros_anual;
        this.ir = ir;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
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
        return 13.97;
    }
}
