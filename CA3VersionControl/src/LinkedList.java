
public class LinkedList {
	private Node head;
  	private int numItems;  // number of items in list


  	public LinkedList()
  	// creates an empty list
  	{
		head = null;
		numItems = 0;

  	}  // end default constructor

  	public boolean isEmpty()
  	// Determines whether a list is empty
  	{
		return (numItems == 0);

  	} // end isEmpty

  	public int size()
  	// Returns the number of items that are in a list
  	{
  		return numItems;
  	}  // end size
  	
  	
	    public void add(int index, Object item)
	            throws ListIndexOutOfBoundsException {
	if (index >= 0 && index <= numItems) {
	if (index == 0) {
	  // insert the new node containing item at
	  // beginning of list
		Node newNode = new Node(item, head);
		head = newNode;
	}
	else {
	  Node prev = find(index-1);
	  // insert the new node containing item after
	  // the node that prev references
		Node newNode = new Node(item, prev.getNext());
		prev.setNext(newNode);
	} // end if
	numItems++;
	}
	else {
	throw new ListIndexOutOfBoundsException(
	          "List index out of bounds on add");
	} // end if
	}  // end add
}
