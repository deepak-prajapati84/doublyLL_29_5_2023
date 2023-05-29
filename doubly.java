public class doubly {
    
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        Node a=new Node(30);
        Node b=new Node(10);
        Node c=new Node(12);
        Node d=new Node(7);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;

        display(a);
    }
}
