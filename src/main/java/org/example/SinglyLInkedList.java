package org.example;

public class SinglyLInkedList {
  SinglyLInkedList (){
      this.size=0;
  }
    private  class Node {
        int data;
        Node next;
        public Node(){
            size++;
        }

        public Node(int data) {
            this.data=data;
            size++;
        }
    }
    private  Node head;
    private  Node tail;
    public int size=0;





    public  void addMoreVal(int... arr){
        for(int val:arr){
            add(val);
        }
    }

    public void insertAtMiddle(int index,int data){
        Node temp=head;
        if(index >=size){
            add(data);
            return;
        }
        if(index ==0 ){
            insertAtFirst(data);
            return;
        }
        if(head == null){
            add(data);
            return;
        }
        Node prev = null;
        for(int i=0;i<index;i++){
            prev=temp;
            temp=temp.next;
        }
        Node ptr=new Node(data);
        ptr.next=temp;
        prev.next=ptr;

    }
    public void insertAtFirst(int data){
         Node node=new Node(data);
         node.next=head;
         head=node;
    }
    public  void add(int data){
        Node temp=new Node();
        temp.data=data;
        if(head==null){
            head=temp;
        }else {
            tail.next=temp;
        }

        tail=temp;
    }


    void  deleteAtFirst(){
        if(head==null)return;
        head=head.next;
        size--;
    }
    void deleteAtLast(){
        Node temp=head;
        if(head == null)return;

        for (int i=1;i<size-1;i++){

            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    void  deleteAtIndex(int index){
        if(index <=0){
            deleteAtFirst();
            return;
        }
        if (size <=index){
            deleteAtLast();
            return;
        }
        Node temp=head,prev=null;
        for (int i=0;i<index;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        size--;
    }

    public void display(){
           Node temp=head;
          while ( temp.next!= null){
                System.out.print(temp.data+"->");
                temp=temp.next;
         }
          System.out.println(temp.data);
    }


}
