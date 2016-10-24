import java.util.*;

/**
 * Iterator class that iterates backwards and forwards
 * through a LinkedList.
 *
 * @author Ernest Carter
 */
public class Iterator<T> {

    private LinkedList<T> myList;
    private LinkedList<T>.Node<T> myCurrentNode;

    public Iterator(LinkedList<T> list) {
        myList = list;
        myCurrentNode =  myList.itsFirstNode;
    } // end constructor

    /**
	 * @return true if there is a "next" element, otherwise returns false
	 */
    public boolean hasNext() {
		
        if (myCurrentNode == null) {
		    return true;
		}
		else {
			return false;
		}
    } // end method hasNext
 
    /** 
	 * @return true if there is a "prior" element, otherwise returns false
	 */
    public boolean hasPrior() {
		if (myCurrentNode != null) {
			return true;
		}
		return false;
    } // end method hasPrior

    /**
	 * @returns the "next" node (really the current one) and
     * moves the Iterator forward by one node
	 */
    public T next() {
		T data;
		if (myCurrentNode == null) {
			throw new NoSuchElementException("No element");
		}
		data = myCurrentNode.getData();
		if (data == null) {
			throw new NoSuchElementException("No element");
		}
        myCurrentNode = myCurrentNode.getNextNode();
        return data;
    } // end method next

    /** 
	 * @returns the "prior" node (really the current one) and
     * moves the Iterator backward by one node
	 */
    public T prior() {
		T data = myCurrentNode.getData();
		myCurrentNode = myCurrentNode.getPriorNode();
		return data;
    } // end method prior

    /**
	 * Sets this iterator to point to the last Node in the list
	 */
    public void setToEnd() {
		myCurrentNode = myList.itsLastNode;
    } // end method setToEnd
	
	/** 
	 * set Iterator to point to specified node
	 */
	public void setCurrent(LinkedList<T>.Node<T> node) {
		myCurrentNode = node;
	}
} // end class Iterator<T>

