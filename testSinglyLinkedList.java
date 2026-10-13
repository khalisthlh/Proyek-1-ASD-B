import java.util.Arrays;

/**
 * testSinglyLinkedList
 */
public class testSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 4 (indeks ke-2)
        System.out.println(linkedList.get(12)); // Menghasilkan null
        System.out.println(linkedList.indexOf(4));// menghasilkan 2
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 1,2,3,4,5,6
        System.out.println(linkedList.remove(3)); // Menghasilkan true
        System.out.println(linkedList.remove(8)); // Menghasilkan false
        System.out.println(Arrays.toString(linkedList.toArray())); //Menghasilkan [6, 5, 4, 2, 1] (karena angka 3 sudah diremove)
    }
}
