package EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T>{

//    Construtor com parâmetros porque está herdando
    public Lista(int capacidade) {
        super(capacidade);
    }

//    Construtor padrão
    public Lista() {
        super();
    }

    public boolean adiciona(T elementos) {
        return super.adiciona(elementos);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
}