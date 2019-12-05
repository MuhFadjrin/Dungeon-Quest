/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

/**
 *
 * @author Hamba Allah
 */
public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;
    
    int kdTerakhir = 0;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void print() {
        LinkedListNode current = head;
//        System.out.println("");
//        System.out.println("================================================================");
//        System.out.println("|Kode Transaksi |Nama           |Nama Menu      |Harga         |");
//        System.out.println("================================================================");
        while (current != null) {
//            System.out.printf("|%-15s", current.kTrans);
//            System.out.printf("|%-15s", current.namaP);
//            System.out.printf("|%-15s", current.namaM);
//            System.out.printf("|%-14s|", current.harga);
            current = current.next;
//            System.out.println("");
        }
//        System.out.println("================================================================");
//        System.out.println("");
    }
    void printD() {
        LinkedListNode current = tail;
        System.out.println("");
        System.out.println("================================================================");
        System.out.println("|Kode Transaksi |Nama           |Nama Menu      |Harga         |");
        System.out.println("================================================================");
//        while (current != null) {
//            System.out.printf("|%-15s", current.kTrans);
//            System.out.printf("|%-15s", current.namaP);
//            System.out.printf("|%-15s", current.namaM);
//            System.out.printf("|%-14s|", current.harga);
//            current = current.prev;
//            System.out.println("");
//        }
        System.out.println("================================================================");
        System.out.println("");
    }
    
    int lastKD(){
        return kdTerakhir;
    }

    void push(LinkedListNode new_node) {
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            this.tail.set_next(new_node);
            this.tail = new_node;
        }
        kdTerakhir++;
    }

    LinkedListNode qpop() {
        LinkedListNode taken;
        if (this.head == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = this.head;
            this.head = null;
            this.tail = null;
        } else {
            taken = this.head;
            this.head = this.head.next;
            this.head.prev = null;
            taken.next = null;
        }
        return taken;
    }

    LinkedListNode spop() {
        LinkedListNode taken;
        if (this.head == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = this.head;
            this.head = null;
            this.tail = null;
        } else {
            taken = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            taken.prev = null;
        }
        return taken;
    }
}
