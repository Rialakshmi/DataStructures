public class QueueDS {
int head;
int tail;
int size;
int currentSize;
String [] queue;
public QueueDS(int size) {
this.size=size;
queue=new String[size];
}
public void enqueue(String name) throws Exception{
System.out.println("tail value"+tail);
if(currentSize==size) {
	throw new Exception("Queue is full");
}


if(tail==size) {
	tail=0;
} 
queue[tail]=name;
System.out.println("Enqueued queue["+tail+"]===>"+queue[tail]);
 if(tail<size) {
	tail=tail+1;
} 
currentSize++;

System.out.println("Current Size after Enqueue="+currentSize);
}

public String dequeue() throws Exception {
if(currentSize==0) {
	throw new Exception("Queue is Empty");
}


if(head==size) {
	head =0;
}
String dequeued=queue[head];
System.out.println("Dequeued queue["+head+"]===>"+queue[head]);
queue[head]=null;
if (head<size) {
	head=head+1;
}

currentSize--;

System.out.println("Current Size after dequeue="+currentSize);
return dequeued;
}

public static void main(String args[]) {
int size=5;
QueueDS queue=new QueueDS(size);
try {
queue.enqueue("Lakshmi"); 
queue.enqueue("Ria"); 
queue.enqueue("Lakshman"); 
queue.enqueue("Riakutty"); 
queue.enqueue("AmmuKutty"); 
queue.dequeue();
queue.enqueue("ChellaKutty");
queue.dequeue();
for(int i=0;i<queue.currentSize;i++) {
queue.dequeue();
}
queue.dequeue();
} catch(Exception e) {
System.out.println(e);
}
}

}