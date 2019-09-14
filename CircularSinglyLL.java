public class CircularSinglyLL {
CircularSinglyLL next;
int data;

public CircularSinglyLL(int data) {
this.data=data;
this.next=null;
}

public CircularSinglyLL insert(int data,CircularSinglyLL headNode,CircularSinglyLL tailNode) {
CircularSinglyLL node=new CircularSinglyLL(data);
this.next=headNode;
return node;
}

public void parse(CircularSinglyLL node) {

while(node!=null) {
System.out.print("=>"node.data);
node=node.next;
}

}
}