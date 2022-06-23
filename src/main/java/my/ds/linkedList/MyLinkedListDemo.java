package my.ds.linkedList;

public class MyLinkedListDemo {

	public static void main(String[] args) {
		var list = new MyLinkedList();
		list.addLast(5);
		list.addLast(10);
		list.addLast(15);
		System.out.println(list.toString());
		System.out.println(list.indexOf(10));
		System.out.println(list.contains(150));
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		System.out.println(list.toString());
		list.removeFirst();
		list.removeFirst();
		System.out.println(list.toString());
		list.removeLast();
		System.out.println(list.toString());
	}
}
