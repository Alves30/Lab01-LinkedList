package estruturaDeDados;

public class ListaCircular {
    
    public No ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    public void insereInicio(int i) {
        No novoNo = new No(i);

        if (ultimo == null) {
            ultimo = novoNo;
            ultimo.prx = ultimo;
        } else {
            novoNo.prx = ultimo.prx;
            ultimo.prx = novoNo;
        }
    }

    public boolean buscaElemento(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscaElemento'");
    }

    public Object buscaIndice(int i) {
        if (ultimo == null) {
            return false;
        }
        No noAtual = ultimo.prx;
        int cont = 0;
        do {
            if (cont == i) {
                return noAtual.valor;
            }
            cont++;
            noAtual = noAtual.prx;
        } while (noAtual != ultimo.prx);

        return false;
    }

    public void insereFim(int i) {
        insereInicio(i);
        ultimo = ultimo.prx;
    }

    public void removeInicio() {
        if (ultimo == null) {
            System.out.println("Lista vazia");
            return;
        }

        if(ultimo.prx == ultimo) {
            ultimo = null;
        } else {
            No noAtual = ultimo.prx;

            while (noAtual.prx != ultimo) {
                noAtual = noAtual.prx;
            }

            noAtual.prx = ultimo.prx;
            ultimo = noAtual;
        }
    }

    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }

    public void removeIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    public void insereElementoPosicao(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }
}
