/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmust;

/**
 *
 * @author ALVIN X
 */
   
public class MMUST {
    
    private Node head; 
    
   
    private class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    
    public void addNode(int dat) {
        Node newNode = new Node(dat);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void printLST() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MMUST mmust = new MMUST();
        
        mmust.addNode(3);
        mmust.addNode(4);
        mmust.addNode(2);
        mmust.addNode(1);
        mmust.addNode(5);
        
        mmust.printLST(); 
    }
}

