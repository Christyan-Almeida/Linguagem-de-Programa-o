import java.util.ArrayList;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        /*int vetor [] = new int [10];
        for (int i = 0; i < vetor.length ; i++) {
            vetor [i] = i;
            System.out.println(vetor[i]);
        }

        Vector<String> vetor = new Vector<>();
        vetor.add("Maria");
        vetor.add("José");
        vetor.add("Marilene");
        System.out.println(vetor);

    ArrayList <Integer> numero = new ArrayList<>();
    numero.add(2);
    numero.add(5);
    numero.add(4);
    int tamanho = numero.size();
    System.out.println(tamanho);
    int posicao0 = numero.get(0);
    System.out.println(posicao0);
    int posicaoFim = numero.get(tamanho-1);
    System.out.println(posicaoFim);
    numero.remove(2);
    System.out.println(tamanho);
    */
        ArrayList<Pessoas> arrayPessoa = new ArrayList<>();
        Pessoas p1 = new Pessoas();
        p1.setNome("Maria da Silva");
        p1.setCpf("123.123.123-12");
        p1.setTelefone("31987655434");
        arrayPessoa.add(p1);
        Pessoas p2 = new Pessoas();
        p2.setNome("Jonas da Silva");
        p2.setCpf("444.123.123-12");
        p2.setTelefone("31987655980");
        arrayPessoa.add(p2);
        for (int i = 0; i < arrayPessoa.size(); i++) {
            System.out.println("Nome: "+arrayPessoa.get(i).getNome());
            System.out.println("CPF: "+arrayPessoa.get(i).getCpf());
            System.out.println("Telefone: "+arrayPessoa.get(i).getTelefone());

        }
    }
}

