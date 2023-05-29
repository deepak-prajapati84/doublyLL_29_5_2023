public class inSertDLL {

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }

    public static Node inSert(Node head,int v){
        Node t=new Node(90);
        t.next=head;
        head.prev=t;
        // head=t;
        return t;
    }

    public static Node inSertTail(Node head,int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;

        return temp;
    }

public static Node inSertidx(Node head,int idx,int x)
{
    Node temp=head;

    for(int i=1;i<=idx-1;i++){
        temp=temp.next;
    }

    Node r=temp.next;
    Node t=new Node(x);
    temp.next=t;
    t.prev=temp;
    t.next=r;
    r.prev=t;

    return t;
}

    public static void display(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        Node a=new Node(39);
        Node b=new Node(9);
        Node c=new Node(3);
        Node d=new Node(329);
        Node e=new Node(20);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        
        display(a);
        System.out.println();
       /*Node head1=inSert(a, 3900);
       display(head1);
       */
      
       /*Node newtail=inSertTail(a,300);
       display(newtail);
       */
      Node idx=inSertidx(a, 1, 45);
        display(idx);
    }
}
