package EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{

//    Construtor padrão
    public Pilha() {
        super();
    }

//    Construtor com parâmetros porque está herdando
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

//    Verificar o elemento no topo
    public T topo() {
        if(this.estaVazia()) {
            return null;
        } else {
            return this.elementos[tamanho-1];
        }
    }

//    Desempilhar o elememento
    public T desempilha() {
        if(this.estaVazia()) {
            return null;
        }
        T elemento = this.elementos[tamanho - 1];
        tamanho--;
        return elemento;
    }
}