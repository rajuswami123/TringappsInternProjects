package org.example;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
class Node{
    int data;
    Node next;
}
class Ll{
    Logger ou = Logger.getLogger("com.api.jar");
    Node head;
    void insert(int value){
        Node inode=new Node();
        inode.data=value;
        if(this.head==null){
            head=inode;
        }
        else{
            Node cnode=head;
            while(cnode.next !=null){
                cnode=cnode.next;
            }
            cnode.next=inode;
        }
    }
    void insert(int value,int ind) {
        Node inode = new Node();
        inode.data = value;
        Node n = head;
        for(int i=0;i<ind-1;i++){
            n=n.next;
        }
        inode.next=n.next;
        n.next=inode;
    }
    void remove(int ind){
        Node n =head;
        Node n1=null;
        if(ind==0){
            head=head.next;
        }
        else{
            for(int i=0;i<ind-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
        }}
    void print(){
        while(head !=null){
            ou.log(Level.INFO,()->""+head.data);
            head=head.next;
        }
    }
}
public class Lists {
    public static void collections_1() {
        Logger ou = Logger.getLogger("com.api.jar");
//        LINKED LIST....
        Ll ob=new Ll();
        ob.	insert(1);
        ob.	insert(2);
        ob.insert(3);
        ob.insert(12,1);
        ob.remove(3);
        ob.print();
        ou.info("this are some implementation of linked list.............................");
//        ARRAY LIST
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(255);
        numbers.add(3,143);
        numbers.remove(0);
        ou.log(Level.INFO,()->"the size is"+numbers.size());
        ou.log(Level.INFO,()->""+numbers);
        ou.info("this are some implementations of arraylist......................");
//       ARRAYS
        String []list=new String[10];
//        Adding elements in the lsit
        list[0]="hello";
        list[1]="sir";

        ou.log(Level.INFO,()->"Length is "+list.length+"\n"+list[0]+" "+list[1]);
    }
}