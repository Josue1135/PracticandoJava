/**
 * Un número perfecto es un número entero positivo que es igual a la suma de sus divisores propios positivos,
 * excluyendo el mismo número.
 * Instrucción:
 * Crea un programa que reciba un número y determine si es perfecto.
 */
public class NumeroPerfecto {
    private int numero;

    public NumeroPerfecto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Verificar si el numero es perfecto
    public boolean esPerfecto() {
        int suma = 0;
        for(int i = 1; i < numero; i++) {
            if(numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }

    public String divisoresPropios() {
        StringBuilder divisor = new StringBuilder();
        for(int i = 1; i < numero; i++) {
            if(numero%i==0){
                divisor.append(i).append(" ");
            }
        }
        return divisor.toString();
    }
}
