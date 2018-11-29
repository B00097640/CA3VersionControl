
	
      private Node Search(int index) {
  	int i;
  	Node currentNode;

  	currentNode = head;
  	for(i = 0; i < count; i++) {

  	    if(i == index-1)
  		return(currentNode);

  	    // Oops, bad index
  	    if(currentNode == null)
  		return(null);

  	    currentNode = currentNode.getNext();
  	}

  	
  	
  	

