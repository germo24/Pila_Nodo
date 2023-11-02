package clases;

import javax.swing.JOptionPane;

public class Pila {

    int size;
    Nodo UNodo;
    String cadena = "";

    public Pila() {

        size = 0;
        UNodo = null;

    }

    public void AddNodo(int valor) {

        Nodo nuevonodo = new Nodo(valor);        
        nuevonodo.siguiente = UNodo;
        UNodo = nuevonodo;

        size++;

    }

    public boolean PilaVacia() {

        return UNodo == null;

    }

    public int DeleteNodo() {

        int aux = UNodo.valor;
        UNodo = UNodo.siguiente;
        size--;
        return aux;

    }

    public int SizeN() {

        return size;

    }

    public void PrintNodo() {

        Nodo recorrido = UNodo;

        do {

            cadena += recorrido.valor + "\n";
            recorrido = recorrido.siguiente;

        } while (recorrido != null);

        JOptionPane.showMessageDialog(null, cadena);

        cadena = "";
    }

    public void VaciarPila() {

        while (!PilaVacia()) {

            DeleteNodo();

        }

    }

    public int UltimoValor() {

        return UNodo.valor;

    }

}
