public class Doublylist
{
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }

    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void displayreverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.prev;
        }
    }
    public static void main(String[] args)
    {
        Node a=new Node(9);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(1);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;

        display(a);
        displayreverse(d);
    }
}