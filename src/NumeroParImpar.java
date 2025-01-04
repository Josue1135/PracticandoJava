public class NumeroParImpar {
    int numero;

    //constructor

    public NumeroParImpar(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean esPar(int numero){
        return numero % 2 == 0;
    }
}
