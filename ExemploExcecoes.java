public class ExemploExcecoes {
    public static void main(String[] args) {
        Estoque est = new Estoque(0, 200);
        try {
            est.setCodProd(1);
            est.setQtdeEstoque(200);
            est.decrementaEstoque(200);
            System.out.println(est.getQtdeEstoque());
        } catch (EIException e) {
            System.out.println(e.getMessage() + " Produto: " + e.getCodProd() + " Estoque: " + e.getQtdeEst());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
