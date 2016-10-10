package com.fierlion.getargs;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for List implementations
 */
public class ListTest extends TestCase {

    public void testLinkedListCreate() {
        LinkedList testList = new LinkedList();
        assertTrue(null != testList);
    }

    public void testLinkedListIsEmpty() {
        LinkedList testList = new LinkedList();
        assertTrue(testList.isEmpty());
    }

    public void testLinkedListSize() {
        LinkedList testList = new LinkedList();
        assertEquals(testList.size(), 0);
    }

    public void testLinkedListInsert() {
        LinkedList testList = new LinkedList();
        testList.insert(0, 0);
    }

    public void testLinkedListClear() {
        LinkedList testList = new LinkedList();
        testList.clear();
        assertEquals(testList.size(), 0);
    }
}
