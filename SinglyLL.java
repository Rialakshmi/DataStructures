public class SinglyLL {
public SinglyLL next;
public int data;

public  SinglyLL(int data) {
this.data=data;
this.next=null;
}

public SinglyLL search(int data, SinglyLL node) {
SinglyLL prevNode=null; int i=1;
while(node!=null) {	
		if(data!=node.data) {
		prevNode=node;
		node=node.next;	i++;	
		} else if(data==node.data) {
			System.out.println("Found at "+i +" location, data="+node.data);
			break;
		}
	}
	return prevNode;
}
public SinglyLL searchByIndex(int index, SinglyLL node) {
SinglyLL prevNode=null; int i=1;
while(node!=null) {	
		if(data!=node.data) {
		prevNode=node;
		node=node.next;	i++;	
		} else if(data==node.data) {
			System.out.println("Found at "+i +" location, data="+node.data);
			break;
		}
	}
	return prevNode;
}
public SinglyLL insert(int data, SinglyLL headNode) {
SinglyLL node=new SinglyLL(data);
node.next=headNode;
return node;
}

public SinglyLL delete(int data, SinglyLL headNode) {
if(headNode.data==data) {
	headNode=headNode.next;
	System.out.println("Succesfully Deleted the node which has Data="+ data);
	return headNode;
} else {
SinglyLL prevNode=search(data,headNode);

	if(prevNode!=null) {
	prevNode.next=prevNode.next.next;
	System.out.println("Succesfully Deleted the node which has Data="+ data);
	} else {
	System.out.println("Node is not present which has Data="+ data);
	}
	return headNode;
	}
}

public void parse(SinglyLL node) {
while(node!=null) {
	System.out.println(node.data + "=>");
	node=node.next;
}

}

public static void main(String args[]) {
SinglyLL singlyLL=new SinglyLL(1);
singlyLL=singlyLL.insert(2,singlyLL);
singlyLL=singlyLL.insert(3,singlyLL);
singlyLL=singlyLL.insert(4,singlyLL);
singlyLL=singlyLL.insert(5,singlyLL);
singlyLL=singlyLL.insert(6,singlyLL);
singlyLL=singlyLL.insert(7,singlyLL);
singlyLL.parse(singlyLL);
singlyLL=singlyLL.delete(4,singlyLL);
singlyLL.parse(singlyLL);
System.out.println("---------------------------------");
singlyLL=singlyLL.insert(8,singlyLL);
singlyLL=singlyLL.insert(9,singlyLL);
singlyLL=singlyLL.insert(10,singlyLL);
singlyLL=singlyLL.insert(11,singlyLL);
singlyLL.parse(singlyLL);
singlyLL=singlyLL.delete(11,singlyLL);
singlyLL=singlyLL.delete(6,singlyLL);
singlyLL=singlyLL.delete(1,singlyLL);
singlyLL.parse(singlyLL);

}
}
