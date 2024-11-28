package estruturaDeDados;

public class Lista {
    public No cabeça;
    public int tamanho;

    public Lista() {
        this.cabeça = null;
        this.tamanho = 0;
    }

    public void insereInicio(int i) {
        No novoNo = new No(i);
        if (tamanho==0){
            novoNo.prx=null;
            cabeça = novoNo;
        }
        else {
            novoNo.prx = cabeça;
            cabeça = novoNo;
        }
        tamanho++;
    }

    public boolean buscaElemento(int i) {
        if(cabeça==null){
            return false;
        }
        No nodavez = cabeça;
        for(int n = 0; n <= tamanho; n++){
            if (nodavez.valor == i){
                return true;
            }
            else {
                nodavez = nodavez.prx;
            }
        }
        return false;
    }

    public Object buscaIndice(int i) {
        if(i == 0){
            return cabeça;
        }
        else {
            No noDesejado = cabeça;
            for(int n=1; n == i; i++){
                noDesejado = noDesejado.prx;
            }
            return noDesejado;
        }
    }

    public void insereFim(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
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
