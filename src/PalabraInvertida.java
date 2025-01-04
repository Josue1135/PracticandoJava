public class PalabraInvertida {
    String palabra;

    public PalabraInvertida(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra(){
        return palabra;
    }

    public void setPalabra(String palabra){
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "PalabraInvertida{" +
                "palabra='" + palabra + '\'' +
                '}';
    }

    public String metodoPalabraInvertida(String palabra){
        StringBuilder invertida = new StringBuilder();
        for(int i = palabra.length() - 1; i >= 0; i--){
            invertida.append(palabra.charAt(i));
        }
        return  invertida.toString();
    }
}
