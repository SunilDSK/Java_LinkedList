
public class LinkedListDemo {

	/*
	 * Add
	 * Delete
	 * Find
	 * 
	 */
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(1);
		myLinkedList.add(2);
		myLinkedList.add(3);
		myLinkedList.add(4);
		myLinkedList.display();
		
		System.out.println();
		
		
		System.out.println("Find 7");
		Node found = myLinkedList.find(7);
		if(found == null)
			System.out.println("Node not found");
		else
			System.out.println("Node found");
		
		System.out.println("Delete 3");
		Node deleted = myLinkedList.delete(1);
		if(deleted == null)
			System.out.println("Node not found");
		else
			System.out.println("Node deleted = "+deleted);
		
		myLinkedList.display();
		System.out.println();
		myLinkedList.addAtPos(4, 5);
		myLinkedList.display();
	}
}
