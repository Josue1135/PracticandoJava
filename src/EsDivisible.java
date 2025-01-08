public class EsDivisible {
    private int numeroA;
    private int numeroB;

    public EsDivisible(int numeroA, int numeroB){
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public int getNumeroA() {
        return numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    public boolean esDivisible(){
        if(numeroB == 0){
            System.out.println("No puedes dividir entre: " + numeroB);
            return false; //retorno para evitar cálculos innecesarios
        }return numeroA % numeroB == 0;
    }
}
