import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Menu,  codigo limpio
        System.out.println("Practicando Java - Josue Vera");
        System.out.println("ELIGE TU OPERACIÓN A REALIZAR");
        System.out.println("1. Sumar dos números: ");
        System.out.println("2. Verificar si el numero es PAR o IMPAR: ");
        System.out.println("3. Verificar mayor de todos: ");
        System.out.println("4. Imprima la tabla de multiplicar de un numero: ");
        System.out.println("5. Factorial de un número: ");
        System.out.println("6. Invertir una palabra: ");
        System.out.println("7. Imprimir si es NUMERO PRIMO o NO: ");
        System.out.println("8. Número mayor en un arreglo: ");
        System.out.println("9. Numero Perfecto");
        System.out.println("10. Ordenar Arreglo");
        System.out.print("Ingrese su opción (1 - 10): ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:

                System.out.println("****Suma de dos números****");
                System.out.print("Ingrese el primer número: ");
                int numero1 = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int numero2 = sc.nextInt();
                Calculadora calculadora = new Calculadora(numero1, numero2);
                int resultado = calculadora.sumarNumeros();
                System.out.print("La suma de los números es: " + resultado);
                break;
            case 2:
                System.out.println("****¿EL NUMERO ES PAR O IMPAR?: ");
                System.out.print("Ingresa el numero: ");
                int numero = sc.nextInt();
                NumeroParImpar numeroParImpar = new NumeroParImpar(numero);
                if (numeroParImpar.esPar(numero)) {
                    System.out.println("El número " + numero + " es Par");
                } else {
                    System.out.println("El numero " + numero + " es impar");
                }
                break;
            case 3:
                System.out.println("**** EL MAYOR DE TODOS****");
                System.out.print("Ingresa el primero numero: ");
                int number1 = sc.nextInt();
                System.out.print("ingrese el segundo numero: ");
                int number2 = sc.nextInt();
                System.out.print("Ingrese el tercer numero: ");
                int number3 = sc.nextInt();
                EsMayor esMayor = new EsMayor(number1, number2, number3);
                int valor = esMayor.esMayorDeTodos(number1, number2, number3);
                System.out.print("El mayor de todos es: " + valor);
                break;
            case 4:
                System.out.println("****TABLA DE MULTIPLICAR****");
                System.out.print("Ingresa el numero a multiplicar: ");
                int number = sc.nextInt();
                TablaMultiplicar tablaMultiplicar = new TablaMultiplicar(number);
                tablaMultiplicar.multiplicar(number);
                break;
            case 5:
                System.out.println("****FACTORIAL DE UN NUMERO****");
                System.out.print("Ingrese el número: ");
                int numeroA = sc.nextInt();
                Factorial factorial = new Factorial(numeroA);
                int resultadoFactorial = factorial.calcularFactotorial(numeroA);
                System.out.print("El factorial de: " + numeroA + " es: " + resultadoFactorial);
                break;
            case 6:
                System.out.println("****INVERTIR PALABRA*****");
                System.out.print("Ingresa la palabra que vas a invertir: ");
                String palabra = sc.next();
                PalabraInvertida palabraInvertida = new PalabraInvertida(palabra);
                String nuevaPalabra = palabraInvertida.metodoPalabraInvertida(palabra);
                System.out.println("Ahora la palabra es: " + nuevaPalabra);
                break;
            case 7:
                System.out.println("****¿ES PRIMO?****");
                System.out.print("Ingresa un numero: ");
                int numeroP = sc.nextInt();
                NumeroPrimo numeroPrimo = new NumeroPrimo(numeroP);
                if(numeroPrimo.esPrimo()){
                   System.out.println("El numero: " + numeroP+ " es PRIMO");
                }else{
                   System.out.println("El numero: " + numeroP+ " NO ES PRIMO");
                }
            case 8:
                System.out.println("****NUMERO MAYOR DENTRO DEL ARREGLO****");
                System.out.print("¿Cuantos numeros vas a ingresar al arreglo?: ");
                int cantidadNumerosArreglo = sc.nextInt();

                //creamos el arreglo con la cantidad de numeros que me indica el usuario
                int[] numerosArreglo = new int[cantidadNumerosArreglo];
                //llenamos el arreglos
                System.out.println("Ingresa el numero para el arreglo: ");

                for (int i = 0; i < cantidadNumerosArreglo; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numerosArreglo[i] = sc.nextInt();
                }
                NumeroGrande numeroGrande = new NumeroGrande(numerosArreglo);
                //Imprimimos el arreglo
                numeroGrande.imprimirArreglo();
                //llamamos a nuestro metodo
                int mayor = numeroGrande.encontrarMayor();
                //mostra
                System.out.print("El mayor es: " + mayor);
            case 9:
                System.out.println("**** VERIFICAR SI UN NUMERO ES PERFECTO****");
                System.out.print("Ingresame el numero a verificar: ");
                int numeroAVerificar = sc.nextInt();
                NumeroPerfecto numeroPerfecto = new NumeroPerfecto(numeroAVerificar);
                if(numeroPerfecto.esPerfecto()){
                    System.out.println("El numero: " + numeroAVerificar + " es PERFECTO");
                    System.out.println("Sus divisores propios son: " + numeroPerfecto.divisoresPropios());

                }else{
                    System.out.println("El numero: " + numeroAVerificar + " NO PERFECTO");
                    System.out.println("Sus divisores: " + numeroPerfecto.divisoresPropios());
                }
                break;
            case 10:
                System.out.println("****ORDENAR ARREGLO CON METODO BURBUJA****");
                System.out.print("¿Cuantos elementos tiene tu arreglo?: ");
                int elementos = sc.nextInt();
                int[] elementosArreglo = new int[elementos];
                System.out.println("Ingresa los elementos a ordenar");
                for (int i = 0; i < elementos; i++) {
                    System.out.print("Elemento " + (i + 1) + ": ");
                    elementosArreglo[i] = sc.nextInt();
                }

                OrdenarArreglo ordenarArreglo = new OrdenarArreglo(elementosArreglo);
                ordenarArreglo.ordenarArregloBurbuja();

                System.out.println("Arreglo ordenado de mayor a menor");
                System.out.println(ordenarArreglo.imprimirArreglo());
        }

    sc.close();

    }
}