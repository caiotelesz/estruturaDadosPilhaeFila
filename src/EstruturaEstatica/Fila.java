package EstruturaEstatica;

public class Fila <T> extends EstruturaEstatica<T>{
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira() {
        if (this.estaVazia()) {
            return null;
        }
        final int pos = 0;

        T elementoASerRemovido = this.elementos[pos];
        this.remove(pos);
        return elementoASerRemovido;
    }
}
