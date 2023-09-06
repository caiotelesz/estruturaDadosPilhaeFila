import java.util.LinkedList;
import java.util.Queue;

public class TesteComFila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

//      Adicionar elementos
        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString());

//      Recupera, mas não remove, ira retornar fila
        System.out.println(fila.peek());

//      Remover elemento da fila
        System.out.println(fila.remove());

    }
}
