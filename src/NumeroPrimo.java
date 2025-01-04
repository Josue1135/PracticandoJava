public class NumeroPrimo {
    private int numero;
    public NumeroPrimo(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean esPrimo(){

        //manejo de casos especiales
        if(numero <= 1){
            return false;
        }
        if(numero % 2 == 0){
            return false;
        }
        if(numero <= 3){
            return true;
        }

        //revisar numeros impares hasta la raiz cuadrada
        for(int i=3; i<= Math.sqrt(numero); i+=2){
            if(numero%i == 0){
                return false;
            }
        }
        return true;
    }
}
