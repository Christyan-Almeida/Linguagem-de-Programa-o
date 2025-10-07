public class EIException extends Exception {
    private int codProd;
    private int qtdeEst;
    public EIException(){
        super("Estoque Insuficiente");
    }
    public EIException (int cod, int qtde){
        super("Estoque Insuficiente");
        codProd = cod;
        qtdeEst = qtde;
    }

    public int getCodProd() {
        return codProd;
    }

    public int getQtdeEst() {
        return qtdeEst;
    }
}
