/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatromorodospuntocero;

import java.util.Scanner;

/**
 *
 * @author PC RST
 */
public class TeatroMoroDosPuntoCero {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int menu = 0;
        double precio = 5000.0;

        
        boolean asiento1 = false, asiento2 = false, asiento3 = false, asiento4 = false, asiento5 = false;
        boolean asiento6 = false, asiento7 = false, asiento8 = false, asiento9 = false, asiento10 = false;

        System.out.println("Bienvenido al Teatro Moro");
        while (menu != 4) {    //breakpoint aquí
            //MAPA DE ASIENTOS
            
            System.out.println("1: " + (asiento1 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("2: " + (asiento2 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("3: " + (asiento3 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("4: " + (asiento4 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("5: " + (asiento5 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("6: " + (asiento6 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("7: " + (asiento7 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("8: " + (asiento8 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("9: " + (asiento9 ? "[X]" : "[ ]") + " - $" + precio);
            System.out.println("10: " + (asiento10 ? "[X]" : "[ ]") + " - $" + precio);
                      
            
           //MENU
            System.out.println("1.- Reservar entrada");
            System.out.println("2.- Comprar entrada");
            System.out.println("3.- Imprimir boleta");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opción:");
            
            
            menu = scanner.nextInt();   //breakpoint aquí
            
            switch (menu) {
                case 1: //RESERVAR ENTRADA
                    System.out.print("Elija un asiento para reservar:");
                    int numAsiento = scanner.nextInt();   //breakpooint aquí
                    
                    
                    if (numAsiento == 1 && !asiento1) {
                        asiento1 = true;     //breakpoint aquí
                        System.out.println("Asiento 1 reservado");
                    } else if (numAsiento == 2 && !asiento2) {
                        asiento2 = true;     //y aquí
                        System.out.println("Asiento 2 reservado");
                    } else if (numAsiento == 3 && !asiento3) {
                        asiento3 = true;    //y aquí
                        System.out.println("Asiento 3 reservado");
                    } else if (numAsiento == 4 && !asiento4) {
                        asiento4 = true;    //y aquí
                        System.out.println("Asiento 4 reservado");
                    } else if (numAsiento == 5 && !asiento5) {
                        asiento5 = true;    //y aquí
                        System.out.println("Asiento 5 reservado");
                    } else if (numAsiento == 6 && !asiento6) {
                        asiento6 = true;    //y aquí
                        System.out.println("Asiento 6 reservado");
                    } else if (numAsiento == 7 && !asiento7) {
                        asiento7 = true;   //y aquí
                        System.out.println("Asiento 7 reservado");
                    } else if (numAsiento == 8 && !asiento8) {
                        asiento8 = true;    //y aquí
                        System.out.println("Asiento 8 reservado");
                    } else if (numAsiento == 9 && !asiento9) {
                        asiento9 = true;   //...
                        System.out.println("Asiento 9 reservado");
                    } else if (numAsiento == 10 && !asiento10) {
                        asiento10 = true;
                        System.out.println("Asiento 10 reservado");
                    } else {
                        System.out.println("Asiento ocupado o inválido");
                    }
                    break;

                    //COMPRAR ENTRADA
                case 2: 
                    System.out.print("Indique el asiento que reservó:");
                    int asientoCompra = scanner.nextInt(); 
                    
                    if (asientoCompra == 1 && !asiento1) {
                        asiento1 = true;
                        System.out.println("Asiento 1 comprado con éxito");
                    } else if (asientoCompra == 2 && !asiento2) {
                        asiento2 = true;
                        System.out.println("Asiento 2 comprado con éxito");
                    } else if (asientoCompra == 3 && !asiento3) {
                        asiento3 = true;
                        System.out.println("Asiento 3 comprado con éxito");
                    } else if (asientoCompra == 4 && !asiento4) {
                        asiento4 = true;
                        System.out.println("Asiento 4 comprado con éxito");
                    } else if (asientoCompra == 5 && !asiento5) {
                        asiento5 = true;
                        System.out.println("Asiento 5 comprado con éxito");
                    } else if (asientoCompra == 6 && !asiento6) {
                        asiento6 = true;
                        System.out.println("Asiento 6 comprado con éxito");
                    } else if (asientoCompra == 7 && !asiento7) {
                        asiento7 = true;
                        System.out.println("Asiento 7 comprado con éxito");
                    } else if (asientoCompra == 8 && !asiento8) {
                        asiento8 = true;
                        System.out.println("Asiento 8 comprado con éxito");
                    } else if (asientoCompra == 9 && !asiento9) {
                        asiento9 = true;
                        System.out.println("Asiento 9 comprado con éxito");
                    } else if (asientoCompra == 10 && !asiento10) {
                        asiento10 = true;
                        System.out.println("Asiento 10 comprado con éxito");
                    } else {
                        System.out.println("Asiento ocupado");
                    }
                    break;
                    
                   //IMPRIMIR BOLETA
                case 3: 
                    System.out.print("Indique el número de asiento que compró:");
                    int asientoBoleta = scanner.nextInt(); 
                    
                    if (asientoBoleta == 1 && asiento1) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");                     
                        System.out.println("Asiento: 1");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 2 && asiento2) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 2");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 3 && asiento3) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 3");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 4 && asiento4) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 4");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 5 && asiento5) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 5");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 6 && asiento6) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 6");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 7 && asiento7) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 7");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 8 && asiento8) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 8");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 9 && asiento9) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 9");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else if (asientoBoleta == 10 && asiento10) {
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: 10");
                        System.out.println("Precio: $" + precio);
                        System.out.println("---------");
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                    
                 

                case 4:
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
        scanner.close();
    }
}
