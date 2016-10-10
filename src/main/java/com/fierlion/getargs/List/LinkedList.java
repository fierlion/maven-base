package com.fierlion.getargs;

public class LinkedList {
    public int size;
    public ListNode head;
    public ListNode tail;

    public LinkedList() {
        clear();
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public ListNode getNode(int index) {
        ListNode iter = head.getNext();
        System.out.println(iter.toString());
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
        size += 1;
    }

    public void clear() {
        size = 0;
        head = new ListNode();
        tail = new ListNode();
        head.setNext(tail);
        tail.setPrev(head);
    }

    private class ListNode {
        //public Integer for now to skip getters/setters/compare
        private Integer data;
        private ListNode next;
        private ListNode prev;
        
        Integer getData() {return data;}
        ListNode getNext() {return next;}
        ListNode getPrev() {return prev;}
        void setData(Integer data) {data = data;}
        void setNext(ListNode next) {next = next;}
        void setPrev(ListNode prev) {prev = prev;}

        public ListNode() {
            data = null;
            next = null;
            prev = null;
        }

        public ListNode(Integer data) {
            data = data;
            next = null;
            prev = null;
        }
    }
}
