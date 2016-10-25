import java.util.*;

/**
 * LinkedList class to setup and modify a linked list.
 *
 * @author Ernest Carter
 * @revised 25 October 2016
 */
public class LinkedList<T>  {


    Node<T> itsFirstNode;
    Node<T> itsLastNode;
    private int size;


    public LinkedList() {

        itsFirstNode = null;
        itsLastNode = null;
        size = 0;
    } // end LinkedList constructor

    /**
	 * Creates a new iterator that has this linked list.
	 */
    public Iterator<T> getIterator() {
        return new Iterator(this);
    } // end method getIterator

    /**
	 * Adds an element to the linked list.
	 */
    public void add(T element) {

        Node<T> node = new Node(element);

        if (itsFirstNode == null) {
            itsFirstNode = node;
            itsLastNode = node;
        }
        else {
            itsLastNode.setNextNode(node);
			node.setPriorNode(itsLastNode);
            itsLastNode = node;
        }
        size++;
    } // end method add

    /**
	 * Adds an element to a specified index in the linked list.
	 * @throws NoSuchElementException
	 */
    public void add(T element, int index) {
        int counter = 0;
        Node<T> newNode = new Node(element);
        Node<T> current = itsFirstNode;
		if (current == null) {
			throw new NoSuchElementException("Beyond size of list or list empty");
		}
		while (current.getNextNode() != null ) {
			if ((counter == index - 1) || (index == 0)) {
				break;
			}	
			current = current.getNextNode();
			counter++;
		}
		try {
			if (index == 0) {
				addAsFirst(newNode);
			}
			else {
				newNode.setNextNode(current.getNextNode());
				(newNode.getNextNode()).setPriorNode(newNode);
				current.setNextNode(newNode);
				newNode.setPriorNode(current);
			}
		}
		catch (NullPointerException e) {
			// NullPointer is fine
		}
        size++;
    } // end method add
	
	/**
	 * Adds node to first index
	 */
	private void addAsFirst(LinkedList<T>.Node<T> elementZero) {
		elementZero.setPriorNode(itsFirstNode.getPriorNode());
		elementZero.setNextNode(itsFirstNode);
		itsFirstNode.setPriorNode(elementZero);
		itsFirstNode = elementZero;
	} // end method addAsFirst

	/**
	 * @return Gets the from the specified index
	 */	
    public T get(int index) {

        int counter = 0;
        Node<T> current = itsFirstNode;
        while (current.getNextNode() != null ) {
            if (counter == index)
                break;
            current = current.getNextNode();
            counter++;
        }
        return current.getData();
    } // end method get

    /**
	 * @returns true if element is in the list, false if not
	 */
    public boolean contains(T element) {
		Node<T> current = itsFirstNode;
		int counter = 0;
		boolean answer = true;
		try {
			while (counter <= size) {
				if (element == current.getData()) {
					break;
				}	
				current = current.getNextNode();
				counter++;
			}
		}
		catch (NullPointerException e) {
			// NullPointerException is okay
		}
		if (current == null) {
			return false;
		}
		else{
		return answer;
		}
    } // end method contains

    /**
	 * @returns the index of the element if it is in the list, -1 if not found
	 */
    public int indexOf(T element) {
		Node<T> current = itsFirstNode;
		int counter = 0;
		try {
        while (counter <= size) {
			if (element == current.getData()) {
				break;
			}
            current = current.getNextNode();
            counter++;
        }
		}
		catch (NullPointerException e) {
			return -1;
		}
		return counter;

    } // end method indexOf

    /** 
	 * @returns an Iterator at the location of the element if it is in the list
     * @returns the null reference if the element is not found
	 */
    public Iterator<T> iteratorAt(T element) {
		Node<T> current = itsFirstNode;
		Iterator<T> iterator = getIterator();
        while (current != null) {
            if (element == current.getData()) {
				break;
			}	
            current = current.getNextNode();
        }
		if (current == null) {
			return null;
		}
		iterator.setCurrent(current);
		return iterator;
    } // end method iteratorAt

	/**
	 * @returns a String
	 */
    public String toString() {
        String returnVal = "";
        Node<T> current = itsFirstNode;
        if (size != 0 ) {
            while (current.getNextNode() != null ) {
                returnVal += current.toString();
                returnVal += "\n";
                current = current.getNextNode();
            }
            returnVal += current.toString();
        }
        return returnVal;
    }  // end method toString
	
	/**
	 * Inner class of LinkedList.
	 * Sets up a node.
	 */
    class Node<T> {
    
        private T data;
        private Node<T> itsNext;
        private Node<T> itsPrior;
    
        public Node(T data) {
            itsNext = null;
            itsPrior = null;
            this.data = data;
        } // end Node constructor
    
		/**
		 * @returns the data of the node
		 */
        public T getData() {
			return this.data;
        } // end getData
    
		/**
		 * @returns the next node
		 */
        public Node<T> getNextNode() {
            return itsNext;
        } // end method getNextNode

        /**
		 * @returns the prior node
		 */
        public Node<T> getPriorNode() {
			return itsPrior;
        } // end method getPriorNode
    
		/**
		 * sets the node's next node
		 */
        public void setNextNode(Node<T> next) {
            itsNext = next;
        } // end method setNextNode

        /**
		 * sets the node's prior node
		 */
        public void setPriorNode(Node<T> prior) {
			itsPrior = prior;
        } // end method setPriorNode
		
		/**
		 * @returns the data as a String
		 */
        public String toString() {
            return data.toString();
        } // end method toString
    
    }  // end of Node<T>
} // end class LinkedList<T>
