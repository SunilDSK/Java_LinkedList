
public class MyLinkedList {
	
	Node head;
	Node tail;
	
	//Add an element to the end of the list
	public void add(int data){
		Node newNode = new Node(data);
		//Check if the linked list is empty
		if(tail == null){
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	//Add an element to the end of the list
		public void addAtPos(int pos,int data){
			if(pos<1){
				System.out.println("INPROPER POSITION");
				return;
			}
			Node newNode = new Node(data);
			
			if(pos == 1){
				newNode.next = head;
				head = newNode;
				return;
			}
			
			Node temp = head;
			int locPosition = 2;
			while(temp!=null){
				if(locPosition == pos){
					newNode.next = temp.next;
					temp.next = newNode;
					if(temp == tail)
						tail = newNode;
					break;
				}
				temp = temp.next;
				locPosition++;
			}
			System.out.println("Tail = "+tail);
		}
	
	//Deleting a node from the list
	public Node delete(int data){
		
		Node temp =  head;
		Node prev = temp;
		
		//Check if there is any element in the list
		if(head == null)
			return head;
		else if(head.data == data){
			prev = head;
			head = head.next;
			return prev;
		}
		
		//If there are elements
		while(temp != null){
			if(temp.data == data){
				prev.next = temp.next;
				//If the node to be deleted is the last element then
				//point the tail to last element
				if(temp == tail)
					tail = prev;
				System.out.println("Found = "+temp);
				return temp;
			}
			prev = temp;
			temp = temp.next;
		}
		
		return null;
	}
	
	//Find the node containing data item
	public Node find(int data) {
		if(head == null)
			return head;
		else if(head.data == data){
			return head;
		}
		else if(tail.data == data){
			return tail;
		}
		
		Node temp = head;
		while(temp.next!= null ){
			temp=temp.next;
			if(temp.data == data){
				return temp; 
			}
		}
		return null;
	}
	
	//Display the list content
	public void display() {
		if(head==null)
			return;
		Node temp = head;
		while(temp != null){
			System.out.print("->"+temp);
			temp = temp.next;
		}
	}
}
