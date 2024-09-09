

class Main{
	public static void main(String[] args){
		linkedList list = new linkedList();
	list.addToTail(1);
	list.addToTail(2);
	list.addToTail(3);
	list.addToTail(4);
	
	System.out.println("Intial list:");
	list.display();
	
	list.count();
	
	list.deleteFromHead();
        System.out.println("After deleting from head:");
        list.display();
        
        // Inserting after a specific node
        list.insertAfter(2, 5);
        System.out.println("After inserting 5 after 2:");
        list.display();
        
        // Deleting from the tail
        list.deleteFromTail();
        System.out.println("After deleting from tail:");
        list.display();
        
        // Final count
        list.count();
	
	}
	
}

