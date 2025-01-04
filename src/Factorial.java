public class Factorial {
    public int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int calcularFactotorial(int numero) {
        int factorial = 1;
        for(int i = numero; i > 1; i--) {
            factorial = factorial * i;
            System.out.println("Los números factoriales son : " + i);
        }
        return factorial;
    }
}
