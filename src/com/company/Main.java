package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pilas p = new pilas();
//Método para mandar a traer el menú principal
    String opcion;
    do {
        System.out.println("********** Menú Principal ***********");
        System.out.println("*            1. Insertar.           *");
        System.out.println("*            2. Mostrar.            *");
        System.out.println("*            3. Buscar.             *");
        System.out.println("*            4. Eliminar.           *");
        System.out.println("*            5. Tamaño.             *");
        System.out.println("*            6. Máximo.             *");
        System.out.println("*            7. Mínimo.             *");
        System.out.println("*            0. Terminar.           *");
        System.out.println("*************************************");
        System.out.print("           Elija una opción: ");
        opcion = sc.nextLine();//Leer opcion selecionada

        switch (opcion) {
            case "0": {//caso 0 El sistema finaliza
                System.out.println("Finalizado");
                System.exit(0);
                break;
            }
            case "1": {//Caso 1 se le pide al usuario un número que desea insertar posteriormente se manda como parámetro lo que
                System.out.println("Número a insertar: ");//el usuario insertó y se lo asigna a el método push
                p.push(sc.nextInt());//que es para insertar valores a la Pila.
                sc.nextLine();
                break;
            }
            case "2": {//caso 2 se invoca el método peek que es el que se encarga de mostrar los valores que tiene la pila
                p.peek();
                break;
            }
            case "3": {//caso 3
                System.out.println("inserta el numero a buscar");//Se inserta el número que se desea buscar
                int valor = sc.nextInt();//y el valor lo manda como parámero a el método cima que es el que busca el valor
                p.buscar(valor);//y dice en que pocisión está
                sc.nextLine();
                break;
            }
            case "4": {//caso 4 se invoca el método pop que sirve para eliminar el primer elemento que esté en la pila
                p.pop();
                break;
            }
            case "5": {//caso 5
                p.tamaño();//Se invoca el método tamaño que sirve para devolver el tamaño de la pila(La longitud)
                break;
            }
            case "6": {//Caso 6
                p.max();//Se invoca el método max que devuelve el valor máximo de la pila
                break;
            }
            case "7": {//caso 7
                p.min();//Se invoca el método min que devuelve el valor mínimo de la pila
                break;
            }
            default: {//En caso de que ninguna opción sea elegida manda un mensaje que diga opción Incorrecta
                System.out.println("Opción incorrecta");
                break;
            }
        }
    } while (!opcion.equals("0"));
}

}
