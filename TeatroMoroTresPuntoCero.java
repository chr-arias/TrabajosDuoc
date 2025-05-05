package teatromorotrespuntocero;

        import java.util.*;

public class TeatroMoroTresPuntoCero {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int menu = 0;
        double precio = 5000.0;

        boolean asiento1 = false, asiento2 = false, asiento3 = false, asiento4 = false, asiento5 = false;
        boolean asiento6 = false, asiento7 = false, asiento8 = false, asiento9 = false, asiento10 = false;

        int[] asientos = new int[10]; //0 = LIBRE, 1 = RESERVADO, 2 = COMPRADO

        List<String> reservas = new ArrayList<>();

        System.out.println("Bienvenido al Teatro Moro. Estos son los asientos disponibles:");
        while (menu != 4) {
            

            //MAPA DE ASIENTOS
            for (int i = 0; i < 10; i++) {
                String estado = asientos[i] == 0 ? "[ ]" : asientos[i] == 1 ? "[R]" : "[X]";
                System.out.println((i + 1) + ": " + estado + " - $" + precio);
            }

            //MENU
            System.out.println("Seleccione una opción:");
            System.out.println("1.- Reservar entrada");
            System.out.println("2.- Comprar entrada");
            System.out.println("3.- Imprimir boleta");
            System.out.println("4.- Salir");
            

            menu = scanner.nextInt();

            switch (menu) {
                
                case 1: //Reservar entrada
                    System.out.print("Elija un asiento para reservar (1-10):");
                    int asientoReservado = scanner.nextInt() - 1;
                    if (asientoReservado >= 0 && asientoReservado < 10) {
                        if (asientos[asientoReservado] == 0) {
                            asientos[asientoReservado] = 1;
                            
                            System.out.println("Asiento " + (asientoReservado + 1) + " reservado con éxito.");
                            reservas.add("Asiento " + (asientoReservado + 1));
                        } else {
                            System.out.println("Asiento no disponible para reservar.");
                        }
                    } else {
                        System.out.println("Número de asiento inválido.");
                    }
                    break;

                case 2: //Comprar entrada
                    System.out.print("Indique el número del asiento que reservó:");
                    int asientoComprar = scanner.nextInt() - 1;

                    if (asientoComprar >= 0 && asientoComprar < 10) {
                        if (asientos[asientoComprar] == 0 || asientos[asientoComprar] == 1) {
                            asientos[asientoComprar] = 2;

                            //Descuento
                            System.out.println("¿Desea aplicar un descuento? (1 = SÍ, 2 = NO):");
                            int aplicarDescuento = scanner.nextInt();

                            int[] descuentos = {0, 10, 15}; //  0: sin descuento, 10%: estudiante, 15%: tercera edad
                            int descuento = 0;

                            if (aplicarDescuento == 1) {
                               
                                System.out.println("¿Qué tipo de descuento desea aplicar?:");
                                System.out.println("1.- Estudiante");
                                System.out.println("2.- Tercera edad");
                                
                                int tipoCliente = scanner.nextInt();

                                if (tipoCliente == 1 || tipoCliente == 2) {
                                    descuento = descuentos[tipoCliente];
                                }
                            }

                            double precioFinal = precio - (precio * descuento / 100.0);
                            System.out.println("Compra realizada con éxito. Precio final: $" + precioFinal);
                        } else {
                            System.out.println("Asiento no disponible para compra.");
                        }
                    } else {
                        System.out.println("Número de asiento inválido.");
                    }
                    break;

                case 3: //Imprimir boleta
                    
                    System.out.print("Indique el número de asiento que compró: ");
                    int asientoBoleta = scanner.nextInt() - 1;

                    if (asientoBoleta >= 0 && asientoBoleta < 10 && asientos[asientoBoleta] == 2) {
                        
                        System.out.println("---BOLETA ELECTRÓNICA TEATRO MORO---");
                        System.out.println("Asiento: " + (asientoBoleta + 1));
                        System.out.println("Precio: $" + precio);
                        System.out.println("------------------------------------");
                    } else {
                        System.out.println("ERROR: Asiento no ha sido comprado.");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema del Teatro Moro. Disfrute su función");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
