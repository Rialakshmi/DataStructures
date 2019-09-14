public class Queue {
int size;
String [] queue;
int index;
int head;
public Queue(int size) {
this.size=size;
queue= new String[size];
index=0;
}
public void enqueue(String name) throws Exception{
if(index<size) {	
	if(index==0) {
	head=index;
	}
	queue[index]=name;
	index++;
}
else if(index==size && queue[0]==null) {
	queue[0]=name;
	index=1;
}
else {
	throw new Exception("Queue is full");
}
}
public String dequeue() throws Exception  {
if(queue[head]!=null) {
	System.out.println("entered if" + queue[head]);
	String dequeued=queue[head];
	queue[head]=null;
	head=head+1;
	return dequeued;
} else if(head==size&&queue[0]!=null) {
	System.out.println("entered else" + queue[head]);
	String dequeued=queue[0];
	head=1;
	return dequeued;
}
else {
	throw new Exception("Queue is Empty");
}
}

public static void main(String args[]) {
Queue queue=new Queue(5);
try {
queue.enqueue("Lakshmi");
queue.enqueue("Ria");
queue.enqueue("Lakshman");
queue.enqueue("Ria kutty");
queue.enqueue("Ammu Kutty");
queue.dequeue();
queue.enqueue("Lakshmi");
System.out.println("Number of Elements" + queue.index + queue.queue[0]);
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
System.out.println(queue.dequeue());
} catch(Exception e) {
System.out.println(e.getMessage());
}
}
}