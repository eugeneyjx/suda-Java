package experiment2;


class Node{
	int data;
	Node next;
	Node()
	{
		
	}
	Node(int n)
	{
		data=n;
		next=null;
	}
}

class Linked_list {
	private Node head=new Node();
	private int count=0;
	
	Linked_list()
	{
		head=new Node();
		head.next=null;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean empty()
	{
		if(size()==0) return true;
		else return false;
	}
	
	public void add_on_tail(int d)
	{
		Node node=new Node(d);
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=node;
		current=current.next;
		count++;
		System.out.println("在链表末尾添加了一个数据为"+d+"的结点");
	}
	
	public void print()
	{
		System.out.println("链表元素为:");
		Node current=head.next;
		for(int i=0;i<size();i++)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void add_on_head(int d)
	{
		Node node=new Node(d);
		node.next=head.next;
		head.next=node;
		count++;
		System.out.println("在链表开头添加了一个数据为"+d+"的结点");
	}
}
public class Q4 {
	
	public static void main(String[] args) {
		Linked_list a=new Linked_list();
		for(int i=0;i<10;i++)
		{
			a.add_on_tail((int)(Math.random()*100));
		}
		a.print();
		a.add_on_tail(100);
		a.add_on_head(100);
		a.print();
	}

}
