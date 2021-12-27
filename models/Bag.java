import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;    
    private int n;               

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }
    
    public Bag(Iterable<Item> items) {
    	this();
    	for (Item item : items) {
    		add(item);
    	}
    }
    
    public Bag(Bag<Item> items) {
    	this();
    	for (Item item : items) {
    		add(item);
    	}
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    @Override
    public String toString() {
    	LinkedList<Item> linkedList = new LinkedList<Item>();
    	for (Item item : this) {
    		linkedList.add(item);
    	}
    	return linkedList.toString();
    }
    
    public Iterator<Item> iterator()  {
        return new LinkedIterator(first);  
    }

    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }
}
