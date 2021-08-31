class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data=data;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
}

class LinkedList {

    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }
    public Node getTail(){
        return this.tail;
    }
    public void addAtEnd(int data){
        Node node = new Node(data);

        if(this.head == null)
            this.head=this.tail=node;
        else{
            this.tail.setNext(node);
            this.tail=node;
        }

    }


    public void addAtBeginning(int data){
        Node node=new Node(data);
        if(this.head == null) {
            this.head = this.tail = node;
        }
        else{
            Node next=this.head;
            this.head=node;
            this.head.setNext(next);

        }
    }

    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    public void insert(int data,int dataBefore){
        Node node=new Node(data);
        if(this.head==null){
            this.head=this.tail=node;
        }else{
            Node nodeBefore=find(dataBefore);
            if(nodeBefore!=null){
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
                if(nodeBefore==this.tail){
                    this.tail=node;
                }else{
                    System.out.println("Node not found");
                }
            }
        }
    }
    public Node find(int data){
        Node temp=this.head;
        while(temp!=null) {
            if (temp.getData()==data) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

}

class Tester{

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addAtEnd(5);
        list.addAtEnd(10);
        list.addAtEnd(7);
        list.addAtBeginning(15);
        list.insert(14,10);
        list.display();
        if(list.find(25)!=null){
            System.out.println("Item found");
        }else{
            System.out.println("Item not found");
        }
        if(list.find(15)!=null){
            System.out.println("Item found");
        }else{
            System.out.println("Item not found");
        }

    }
}