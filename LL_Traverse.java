public class LL_Traverse<T> {
        LL_Traverse<Integer> next;
        T data;
        LL_Traverse(T data){
            this.data=data;
        }

        public static void main(String[] args) {
            LL_Traverse<Integer> n1=new LL_Traverse(10);
            LL_Traverse<Integer> n2=new LL_Traverse<>(20);
            LL_Traverse<Integer> n3=new LL_Traverse<>(30);
            LL_Traverse<Integer> head=n1;
            head.next=n2;
            n2.next=n3;
            n3.next=null;
            LL_Traverse. transverse(head);
            System.out.println(n1.data);

        }
        static void  transverse(LL_Traverse<Integer> head){
            LL_Traverse<Integer> cur=head;
            while(cur.next!=null){
                System.out.println(cur.data);
                cur=cur.next;
            }

    }
    }


