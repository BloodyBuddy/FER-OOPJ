package hr.fer.oop.introduction;

public class CSLinkedList {
	static Node add(Node root, String name) {
		if (root == null) {
			root = new Node();
			root.value = name;
			root.next = null;
		}
		else{
			Node temp = root;
			while (temp.next != null) temp = temp.next;
			temp.next = new Node();
			temp.next.value = name;
			temp.next.next = null;
		}
		return root;
	}
	
	public static void main(String[] args) {
		Node root = null;
		root = add(root,"Alen");
		root = add(root,"Lana");
		root = add(root,"Marija");
		printList(root);
		
		while(root != null) {
			Node temp = root;
			root = root.next;
			System.out.println("Removed element: "+temp.value);
		}
	}
	
	public static void printList(Node root){
		int pos = 1;
		while (root != null) { System.out.format("%d. %s%n", pos++, root.value); root = root.next; }
	}
}