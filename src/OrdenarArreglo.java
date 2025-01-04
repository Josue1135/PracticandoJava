import java.lang.reflect.Array;
import java.util.Arrays;

public class OrdenarArreglo {
    private int[] arregloParaOrdenar;

    public OrdenarArreglo(int[] arregloParaOrdenar) {
        this.arregloParaOrdenar = arregloParaOrdenar;
    }

    public int[] getArregloParaOrdenar() {
        return arregloParaOrdenar;
    }

    public void setArregloParaOrdenar(int[] arregloParaOrdenar) {
        this.arregloParaOrdenar = arregloParaOrdenar;
    }

    //metodo para ordenar => Burbuja

    public void ordenarArregloBurbuja() {
        int valores = arregloParaOrdenar.length;
        for(int i = 0; i < valores - 1; i++) {
            for(int j = 0; j < valores - i - 1; j++) {
                if(arregloParaOrdenar[j] > arregloParaOrdenar[j + 1]) {
                    int temp = arregloParaOrdenar[j + 1];
                    arregloParaOrdenar[j] = arregloParaOrdenar[j + 1];
                    arregloParaOrdenar[j + 1] = temp;
                }
            }
        }
    }

    //Metodo para imprimir un arreglo
    public String imprimirArreglo() {
        return Arrays.toString(arregloParaOrdenar);
    }
}
