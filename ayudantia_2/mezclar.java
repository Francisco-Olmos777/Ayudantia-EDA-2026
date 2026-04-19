import java.util.Scanner;

public class mezclar{
    public static class linkedlist{
        
        Node head;
        public class Node{
            int value;
            Node next;
            Node(int value){
                this.value = value;
                next = null;
            }
        }
        linkedlist(){
            head = null;
        }
        
        void insert(int value){
            Node nuevo = new Node(value);
            if(head == null){
                head = nuevo;
                return;
            }
            Node aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = nuevo;
        }
        
        void print(){
            Node aux = head;
            while(aux != null){
                System.out.printf("%d -> ", aux.value);
                aux = aux.next;
            }
            System.out.printf("null\n");
        }
        //ejemplo con iteraciones
        public static linkedlist solve(linkedlist uno, linkedlist dos){
            linkedlist mezcla = new linkedlist();
            Node aux1 = uno.head;
            Node aux2 = dos.head;
            while(aux1 != null && aux2 != null){
                if(aux1.value <= aux2.value){
                    mezcla.insert(aux1.value);
                    aux1 = aux1.next;
                }else{
                    mezcla.insert(aux2.value);
                    aux2 = aux2.next;
                }
            }
            while(aux1 != null){
                mezcla.insert(aux1.value);
                aux1 = aux1.next;
            }
            while(aux2 != null){
                mezcla.insert(aux2.value);
                aux2 = aux2.next;
            }
            return mezcla;
        }
        //ejercicio conr recursividad
        public static Node intercalarPlaylists(Node l1, Node l2) {
            // 1. Casos bases
            if (l1 == null) return l2;
            if (l2 == null) return l1;
        
            // 2. Paso Recursivo
            l1.next = intercalarPlaylists(l2, l1.next);
        
            // 3. Retorno del nodo cabecilla que tiene las referencias
            return l1;
        }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N;
        linkedlist uno = new linkedlist();
        linkedlist dos = new linkedlist();
        
        System.out.printf("Ingrese largo de linkedlist 1: ");
        N = scan.nextInt();
        System.out.printf("Ingrese linkedlist (ordenada)\n");
        for(int i = 0 ; i < N ; i ++){
            System.out.printf("(%d) = ", i);
            uno.insert(scan.nextInt());
        }
        
        System.out.printf("Ingrese largo de linkedlist 2: ");
        N = scan.nextInt();
        System.out.printf("Ingrese linkedlist (ordenada)\n");
        for(int i = 0 ; i < N ; i++){
            System.out.printf("(%d) = ", i);
            dos.insert(scan.nextInt());
        }
        
        System.out.printf("Lista 1: ");
        uno.print();
        System.out.printf("Lista 2: ");
        dos.print();
        System.out.printf("Listas mezcladas: ");
        linkedlist.intercalarPlaylists(uno, dos).print();
        scan.close();
    }
}
