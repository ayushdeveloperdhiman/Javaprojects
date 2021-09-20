public class Node {
    int data;
    Node next;

    Node delete(int data,Node head){
        Node temp=head;
        if(temp.data==data){
            head=temp.next;
            return head;
        }
        else {
            while (temp.next!=null){
                if(temp.next.data==data){
                    if(temp.next.next!=null){
                        temp.next=temp.next.next;
                    }else{
                        temp.next=null;
                    }
                    break;
                }
                temp=temp.next;
            }
        }
        return head;
    }
    Node insertAtEnd(int data,Node head){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head== null){
            head=newNode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    Node insertAtBeginning(int data,Node head){
        Node newNode=new Node();
        newNode.data=data;
        if(head==null){
            head=newNode;
            return head;
        }
        else {
            Node temp=head;
            head=newNode;
            newNode.next=temp;
            return head;
        }
    }
    void insertAfter(int after,int data,Node head){
        Node a=find(after,head);
        if(a!=null){
            Node newNode=new Node();
            newNode.data=data;
                Node temp=a.next;
                a.next=newNode;
                newNode.next=temp;
        }

    }

       Node find(int data,Node head){
        Node temp=head;
        while (temp!=null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
class Testing{
    public static void main(String[] args) {
        Node head=null;
        Node obj=new Node();
        head=obj.insertAtEnd(10,head);
        head=obj.insertAtEnd(25,head);
        head=obj.insertAtEnd(50,head);
        head=obj.insertAtBeginning(5,head);
        head=obj.insertAtBeginning(1,head);
        obj.insertAfter(1,15,head);
        head=obj.delete(1,head);
        head=obj.delete(5,head);
        head=obj.delete(50,head);
        obj.display(head);
    }
}
