import java.util.Scanner;

public class insertAtPosition {
    public static class linkedlist {
        
        Node head;

        public class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
                next = null;
            }
        }

        linkedlist() {
            head = null;
        }

//metodo relevante para insertar en una posicion i
    void insertAt(int value, int pos) {
        Node nuevo = new Node(value);

        if (pos == 0) {
            nuevo.next = head;
            head = nuevo;
            return;
        }

        Node actual = head;

        for (int i = 0; i < pos - 1 && actual != null; i++) {
            actual = actual.next;
        }

        if (actual == null) {
            System.out.println("Error: Posición fuera de rango.");
        } else {
            nuevo.next = actual.next;
            actual.next = nuevo;
        }
    }

//metodo para insertar en la ultima posicion
        void insertLast(int value) {
            Node nuevo = new Node(value); // 1

            if (head == null) {           // 2
                head = nuevo;
                return;
            }

            Node actual = head;           // 3
            while (actual.next != null) { // 4
                actual = actual.next;
            }

            actual.next = nuevo;          // 5
        }

//metodo para imprimir la lista
        void print() {
            Node aux = head;
            System.out.printf("Lista: ");
            while (aux != null) {
                System.out.printf("%d -> ", aux.value);
                aux = aux.next;
            }
            System.out.println("null");
        }
    }

//ejemplo de uso para n numero en n posiciones de una lista definida previamente
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        linkedlist LL = new linkedlist();

        //Valores iniciales para la lista
        LL.insertLast(10);
        LL.insertLast(5);
        LL.insertLast(20);
        LL.insertLast(15);
        
        System.out.println("Lista inicial cargada:");
        LL.print(); // Muestra la lista antes de pedir datos
        System.out.println("-----------------------");
        

        int aux = 1;
        int val, pos;

        while (aux == 1) {
            System.out.printf("¿Desea ingresar un numero?\n1 = si\ncualquier otro = no\n");
            aux = scan.nextInt();
            if (aux == 1) {
                System.out.printf("Numero a ingresar: ");
                val = scan.nextInt();
                System.out.printf("Posicion: ");
                pos = scan.nextInt();
                
                LL.insertAt(val, pos);
                LL.print();
            } else break;
        }
        scan.close();
    }
}