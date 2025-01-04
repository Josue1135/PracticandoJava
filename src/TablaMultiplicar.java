public class TablaMultiplicar {
    int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public int numero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void multiplicar(int numero) {

        for(int i=1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
