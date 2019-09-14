public class DoublyLL {
DoublyLL prev;
DoublyLL next;
int data;

public DoublyLL(int data) {
this.data=data;
this.prev=null;
this.next=null;
}

public DoublyLL insert(int data,DoublyLL headNode){
	DoublyLL node=new DoublyLL(data);
	node.prev=null;
	node.next=headNode;
	headNode.prev=node;
	return node;
}
public DoublyLL search(int data,DoublyLL node) {
DoublyLL prevNode=null;int i=1;
while(node!=null) {
	if(node.data==data) {
	System.out.println("Found data at position=" + i +" Data=" + node.data);		
	break;
	} else {
	prevNode=node;
	node=node.next;
	} i++;
	}
	return prevNode;
}
public void parse(DoublyLL node) {
while(node!=null)
	{
	System.out.print("=>"+ node.data);
	node=node.next;
	}
	System.out.println("\n--------------------\n");
}
public DoublyLL delete(int data,DoublyLL headNode) {
if(headNode.data==data) {
	headNode.next.prev=null;
	return headNode.next;
}
DoublyLL prevNode=search(data,headNode);
if(prevNode!=null&&data==prevNode.next.data) {
	prevNode.next.prev=prevNode;
	prevNode.next=prevNode.next.next;
	}
else {
	 System.out.println("Data Not found");
	}
	return headNode;
}
public static void main(String args[]) {

DoublyLL headNode=new DoublyLL(10);
headNode=headNode.insert(9,headNode);
headNode=headNode.insert(8,headNode);
headNode=headNode.insert(7,headNode);
headNode=headNode.insert(6,headNode);
headNode.parse(headNode);
headNode=headNode.delete(7,headNode);
headNode.parse(headNode);
headNode=headNode.delete(10,headNode);
headNode.parse(headNode);
headNode=headNode.delete(6,headNode);
headNode.parse(headNode);
headNode=headNode.insert(5,headNode);
headNode=headNode.insert(4,headNode);
headNode=headNode.insert(3,headNode);
headNode=headNode.insert(2,headNode);
headNode.parse(headNode);
}
}