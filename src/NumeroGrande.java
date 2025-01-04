import java.util.List;

public class NumeroGrande {
    private int[] numeros;

    //contructor arreglo
    public NumeroGrande(int[] numeros) {
        this.numeros = numeros;
    }
    public int[] getNumeros() {
        return numeros;
    }
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int encontrarMayor(){
        int mayor = Integer.MIN_VALUE; //valor inicial bajo

        for(int numero : numeros){
            if(numero > mayor){
                mayor = numero;
            }
        }
        return mayor;
    }

    public void imprimirArreglo(){
        System.out.print("El arreglo es: [");
        for(int i =0; i < numeros.length; i++ ){
            System.out.print(numeros[i]);
            if(i < numeros.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
