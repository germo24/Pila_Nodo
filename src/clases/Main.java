package clases;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opciones = 0;
        Pila mensajero = new Pila();

        do {

            try {
                try {

                    opciones = Integer.parseInt(JOptionPane.showInputDialog(null,
                            " Menu de Opciones  \t \n\n"
                            + "   1. Insertar un nodo  \t \n"
                            + "   2. Eliminar un nodo  \t \n"
                            + "   3. La pila se encuentra vacia?  \t \n"
                            + "   4. Cuál es el último valor ingresado?  \t \n"
                            + "   5. Cuántos nodos posee la pila?  \t \n"
                            + "   6. Vaciar Pila  \t \n"
                            + "   7. Mostrar Pila  \t \n"
                            + "   8. Salir  \t \n\n"));

                    switch (opciones) {

                        case 1:

                            int nodotemporal = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el nodo que desea agregar: "));
                            mensajero.AddNodo(nodotemporal);

                            break;

                        case 2:

                            if (!mensajero.PilaVacia()) {

                                JOptionPane.showMessageDialog(null, " El nodo con valor " + mensajero.DeleteNodo() + " ha sido eliminado correctamente");

                            } else {

                                JOptionPane.showMessageDialog(null, " No hay nodos existentes para eliminar ");

                            }

                            break;

                        case 3:

                            if (!mensajero.PilaVacia()) {

                                JOptionPane.showMessageDialog(null, " La pila no está vacía ");

                            } else {

                                JOptionPane.showMessageDialog(null, " La pila está vacía ");

                            }

                            break;

                        case 4:

                            JOptionPane.showMessageDialog(null, " El último valor ingresado es: " + mensajero.UltimoValor());
                            break;

                        case 5:

                            JOptionPane.showMessageDialog(null, " La pila posee " + mensajero.SizeN() + " nodos");

                            break;

                        case 6:

                            if (!mensajero.PilaVacia()) {

                                mensajero.VaciarPila();
                                JOptionPane.showMessageDialog(null, " La pila se ha eliminado correctamente ");

                            } else {

                                JOptionPane.showMessageDialog(null, " No hay nodos existentes para eliminar ");

                            }

                            break;

                        case 7:

                            if (!mensajero.PilaVacia()) {

                                mensajero.PrintNodo();

                            } else {

                                JOptionPane.showMessageDialog(null, " No hay nodos existentes para mostrar ");

                            }

                            break;

                        case 8:

                            System.exit(0);
                            break;

                        default:

                            JOptionPane.showMessageDialog(null, " La opción sleeccionada es inexistente ");

                            break;

                    }

                } catch (NumberFormatException t) {

                    JOptionPane.showMessageDialog(null, " Opcion inexistente");

                }

            } catch (NullPointerException e) {

                JOptionPane.showMessageDialog(null, "No existe último nodo");

            }
        } while (opciones != 8);
    }

}
