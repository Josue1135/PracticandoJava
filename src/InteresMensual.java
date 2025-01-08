public class InteresMensual {
    //private double interesMensual;
    private double capitalInicial;
    //private int tasaInteres;

    public InteresMensual(double capitalInicial) {
        this.capitalInicial = capitalInicial;
        //this.interesMensual = interesMensual;
        //this.tasaInteres = tasaInteres;
    }



    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }


    public double calcularInteresGanado(){
    double tasaInteres;
    double interesMensual;
        if(capitalInicial <  500){
            tasaInteres =0.02;

        }else if(capitalInicial >= 500 && capitalInicial <= 1500){
            tasaInteres =0.045;
        }else{
            tasaInteres = 0.09;
        }
        interesMensual = capitalInicial * tasaInteres;
        return interesMensual;
    }
}
