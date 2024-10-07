//public class LinkedList_creation {
//    LinkedList_creation next;
//    int data;
//    LinkedList_creation(int data){
//        this.data=data;
//    }
//
//    public static void main(String[] args) {
//        LinkedList_creation n1=new LinkedList_creation(10);
//        LinkedList_creation n2=new LinkedList_creation(20);
//        LinkedList_creation n3=new LinkedList_creation(30);
//        LinkedList_creation head=n1;
//        head.next=n2;
//        n2.next=n3;
//        n3.next=null;
//        System.out.println(n1);
//        System.out.println(n2);
//
//    }
//}


//Generic Type
public class LinkedList_creation <T>{
    LinkedList_creation<Integer> next;
    T data;
    LinkedList_creation(T data){
        this.data=data;
    }

    public static void main(String[] args) {
        LinkedList_creation<Integer> n1=new LinkedList_creation<>(10);
        LinkedList_creation<Integer> n2=new LinkedList_creation<>(20);
        LinkedList_creation<Integer> n3=new LinkedList_creation<>(30);
        LinkedList_creation<Integer> head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
        System.out.println(n1.data);

    }
}
