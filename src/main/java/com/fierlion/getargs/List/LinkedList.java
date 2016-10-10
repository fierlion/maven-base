package com.fierlion.getargs;

public class LinkedList {
    public int size;
    public ListNode head;
    public ListNode tail;

    public LinkedList() {
        clear();
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public ListNode getNode(int index) {
        ListNode iter = this.head.getNext();
        for (int i=0; i<index; i++) {
            iter = iter.getNext();
        }
        return iter;
    }

    public void insert(int index, Integer data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ListNode tmp = new ListNode(data);
        ListNode before = getNode(index);
        tmp.setNext(before);
        tmp.setPrev(before.getPrev());
        before.getPrev().setNext(tmp);
        before.setPrev(tmp);
        this.size += 1;
    }

    public void clear() {
        this.size = 0;
        this.head = new ListNode();
        this.tail = new ListNode();
        this.head.setNext(tail);
        this.tail.setPrev(head);
    }

    public class ListNode {
        //public Integer for now to skip getters/setters/compare
        private Integer data;
        private ListNode next;
        private ListNode prev;
        
        Integer getData() {return this.data;}
        ListNode getNext() {return this.next;}
        ListNode getPrev() {return this.prev;}
        void setData(Integer data) {this.data = data;}
        void setNext(ListNode next) {this.next = next;}
        void setPrev(ListNode prev) {this.prev = prev;}

        public ListNode() {
            this.data = null;
            this.next = null;
            this.prev = null;
        }

        public ListNode(Integer data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public String toString() {
            return (String.format("%d", data));
        }
    }
}
