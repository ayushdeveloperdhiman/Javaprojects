public class Nodes {
    int data;
    Nodes next;Node previous;
    static Nodes insertAtEnd(Nodes head,int data){
        Nodes newNode=new Nodes();
        newNode.data=data;
        newNode.next=null;
        newNode.previous=null;
        if(head==null){
            head=newNode;
            return head;
        }
        Nodes temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    static Nodes insertAtBeginning(Nodes head,int data){
        Nodes newNode=new Nodes();
        newNode.data=data;
        newNode.next=null;
        newNode.previous=null;

    }
    static void display(Nodes head){
        Nodes temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Nodes head=null;
        head=Nodes.insertAtEnd(head,15);
        head=Nodes.insertAtEnd(head,12);
        Nodes.display(head);
    }
}
