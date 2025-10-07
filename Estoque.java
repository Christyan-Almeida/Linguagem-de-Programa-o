public class Estoque {
    private int codProd;
    private int qtdeEstoque;

    // Construtor para inicializar codProd e qtdeEstoque
    public Estoque(int codProd, int qtdeEstoque) {
        this.codProd = codProd;
        this.qtdeEstoque = qtdeEstoque;
    }

    public void decrementaEstoque(int qtde) throws EIException {
        if (qtdeEstoque >= qtde) {
            qtdeEstoque = qtdeEstoque - qtde;
        } else {
            throw new EIException(codProd, qtdeEstoque); // Lança a exceção caso o estoque seja insuficiente
        }
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }
}
