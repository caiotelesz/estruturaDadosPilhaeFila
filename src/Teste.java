// Usando o método pilha direto da biblioteca Stack

import java.util.Stack;

public class Teste {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

//      verificar se a pilha está vazia
        System.out.println(stack.isEmpty());

//      empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

//      verificar o tamanho
        System.out.println(stack.size());

//      toString
        System.out.println(stack);

//      desempilhar
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
