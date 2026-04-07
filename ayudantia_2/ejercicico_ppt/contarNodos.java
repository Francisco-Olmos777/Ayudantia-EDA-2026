//no ver torpedo
package ejercicico_ppt;
import java.util.Scanner;

public class contarNodos {
    //estructura base de lista enlazada para los ejercicios de la ayudantia
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
        // metodo recursivo ----> EL desafio que se les pide
        public int contar(Node actual) {

        
        }
*/
        // Método para agregar datos rápidamente --> solo para la prueba en pc -  pero revisar como funciona para mayor entendimiento
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

        int total = lista.contar(lista.head);
        
        System.out.println("Total de nodos: " + total);
    }
}