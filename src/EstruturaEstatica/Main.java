package EstruturaEstatica;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

//        for(int i = 1; i<= 15; i++) {
//            pilha.empilha(i);
//        }

        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha.topo());
        System.out.println(pilha);
        System.out.println("Desempilhar elemento " + pilha.desempilha());
        System.out.println(pilha);
        System.out.println("======================");

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println("Está vazia? " + fila.estaVazia());
        System.out.println("Tamanho? " + fila.tamanho());
        System.out.println(fila.toString());

        System.out.println(fila.espiar());

        if(fila.espiar() == null) {
            System.out.println("Ninguem na fila");
        } else {
            System.out.println("O elemento da primeira posição é: " + fila.espiar());
        }

        System.out.println(fila.toString());
        System.out.println(fila.desenfileira());
        System.out.println(fila.toString());
    }
}
