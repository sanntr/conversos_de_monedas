package com.alulara.interfaces;

import com.alulara.modules.ConversorMoneda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class SolicitudUsuario {
    private List<String> lista= new ArrayList<>();
    private ConversorMoneda conversorMoneda = new ConversorMoneda();
    public void convertirMoneda() {
        Scanner scanner = new Scanner(System.in);
        int selector=0;
        String nombreMoneda1;
        String nombreMoneda2;
        double valor;
        double valorConvertido;
        while (selector!=3){
            System.out.println("\n ****************************************************************" +
                    "\n Sea bienvenido/a al Conversor de monedas" +
                    "\n 1) Para convertir monedas  \n 2) Para ver el historial   \n 3) Para finalizar" +
                    "\n****************************************************************"
            );

            try {
                selector = scanner.nextInt();
                switch (selector){
                    case 1:
                        mostrarMonedas();
                        System.out.println("Escriba el nombre de la moneda que decea convertir ");
                        nombreMoneda1=scanner.next();
                        System.out.println("Que valor decea convertir: ");
                        valor= scanner.nextDouble();
                        System.out.println("A que moneda desea convertir?");
                        nombreMoneda2= scanner.next();
                        valorConvertido= conversorMoneda.Conversor(nombreMoneda1,nombreMoneda2,valor);
                        double i = 0;
                        if (valorConvertido!= i){
                           System.out.printf("El valor: %.2f [%s] corresponde al valor de %.2f [%s]\n", valor,nombreMoneda1,valorConvertido,nombreMoneda2);
                           lista.add(String.format(
                                   "El valor: %.2f [%s] corresponde al valor de %.2f [%s]",
                                   valor, nombreMoneda1, valorConvertido, nombreMoneda2));
                       }else {
                           System.out.println("");
                       }
                        break;
                    case 2:
                        System.out.println("lista de converciones realizadas");
                        System.out.println(lista);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }

            } catch (InputMismatchException e) {
                System.out.println("************************************************************" +
                        "\nIngrese un valor numerico\n" +
                        "************************************************************");
                convertirMoneda();
            }
        }
        scanner.close();
    }
    private void mostrarMonedas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea ver la lista de monedas?\n si o no ");
        String  opcion= scanner.next().toLowerCase();
        if (opcion.equals("si")){
            conversorMoneda.listarMonedas();
        }
    }

}
