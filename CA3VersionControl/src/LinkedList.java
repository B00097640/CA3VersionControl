
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
  	public void remove(int index)
            throws ListIndexOutOfBoundsException {

if(index < 0 || index >= count)
 throw(new ArrayIndexOutOfBoundsException("Bad delete (bad index(" + index + "), max(" + (count-1) + "))!"));


if(index == 0) {
 head = head.getNext();
 count--;
 return;
}


Node previousNode = find(index);
previousNode.setNext(previousNode.getNext().getNext());
count--;
}

}   // end remove
}
