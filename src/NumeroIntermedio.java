/**
 * Diseñe un programa que lea 3 números enteros y determine el número intermedio. No usar
 * operadores lógicos.
 */
public class NumeroIntermedio {
    int numeroA;
    int numeroB;
    int numeroC;

    public NumeroIntermedio(int numeroA, int numeroC, int numeroB) {
        this.numeroA = numeroA;
        this.numeroC = numeroC;
        this.numeroB = numeroB;
    }

    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }


}
