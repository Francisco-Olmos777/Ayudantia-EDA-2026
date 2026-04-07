package ejercicico_ppt;
import java.util.Scanner;

public class EstructuraParaControl {

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
/* 
        // --- MÉTODO RECURSIVO PARA IMPRIMIR AL REVÉS ---
        public void imprimirAlReves(Node actual) {
           
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
        lista.add(20);
        lista.add(30);

        System.out.print("Lista al reves: ");
        lista.imprimirAlReves(lista.head);
        System.out.println();
    }
}