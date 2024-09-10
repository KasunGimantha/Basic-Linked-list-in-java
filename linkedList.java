
public class linkedList{
	Node head;
	Node tail;
	
	 // Delete node from the head of the list
	public void deleteFromHead(){
		if(head == null){
			System.out.println("Underflow");
		}else{
			Node temp = head;
			head = head.next;
			System.out.println("Deleted Node: " + temp.val);
		}
	}
	
	 //Display the list

	
	public void display(){
		if(head == null){
			System.out.println("Underflow");
		}else{
			
			for(Node temp = head;temp != null;temp=temp.next){
				System.out.println(temp.val);
			}
		}
	}
	
	  // Search for a node by value

	public Node search(int loc){
		for(Node temp= head;temp!=null;temp=temp.next){
			if(temp.val == loc){
				return temp;
			}
		}
	return null;
	}
	 // Insert a node after a given value
	
	public void insertAfter(int loc,int ele){
		Node prevnode=search(loc);
		Node newnode = new Node(ele);
		
		newnode.next = prevnode.next;
		prevnode.next = newnode;
		}
		
	    public void addToTail(int ele){
			Node newtail = new Node(ele);
			if(head == null){
				head = newtail;
				tail = newtail;
			}else{
				tail.next=newtail;
				tail = newtail;
			}
		}
		// Delete node from the tail of the list
		
	public void deleteFromTail(){
		if(head == null){
			System.out.println("Underlow");
		}
		else{
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			Node prevtail = temp;
			prevtail.next= null ;
			tail = prevtail;
		}
	}
    // Count the number of nodes in the list

    public void count(){
		int count = 0;
		if(head == null){
			System.out.println("list is empty");
		}else{
			for(Node temp = head;temp != null ; temp = temp.next){
				count++;
			}
			System.out.println("Count is "+count);
		}
	}	
}
