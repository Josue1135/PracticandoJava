public class Calculadora {
    //Atributos
    int numero1;
    int numero2;

    //creamos el constructor
    public Calculadora(int numero1,  int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //set and get

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2 (){
        return numero2;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }

    public int sumarNumeros(){
        return numero1 + numero2;
    }
}
