package ejercicico_ppt;
import java.util.Scanner;

public class BuscarElemento {

    public static class LinkedList {
        Node head;

        private static class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
                this.next = null;
            }
        }

        LinkedList() {
            this.head = null;
        }

        /*  --- MÉTODO RECURSIVO DE BÚSQUEDA ---
        public boolean buscar(Node actual, int objetivo) {
           
        }
        */

        public void add(int value) {
            Node nuevo = new Node(value);
            if (head == null) {
                head = nuevo;
                return;
            }
            Node aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = nuevo;
        }
    }

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.add(10);
        lista.add(25);
        lista.add(40);

        int x = 25;
        
        // Iniciamos la búsqueda desde el head
        if (lista.buscar(lista.head, x)) {
            System.out.println("El elemento " + x + " si esta");
        } else {
            System.out.println("El elemento " + x + " no esta");
        }
    }
}