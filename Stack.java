class Stack {
int size;
int index;
int[] stackArray;
public Stack(int size) {
stackArray = new int[size];
this.size=size;
}
void push(int element) throws Exception{
if(size>0 && index<size) {
stackArray[index]=element;
index++;
} else {
throw new Exception("StackOverflow" +size + "\t" + index);
}
}
int pop() throws Exception {
if(index > 0) {
index = index -1;
return stackArray[index];
} else {
throw new Exception("Stack Underflow");
}
}
public static void main(String args[]) {
Stack stack=new Stack(5);
try {
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println(stack.pop() + "\t" +stack.pop() + "\t" + stack.pop() );
} catch(Exception e) {
System.out.println(e.getMessage());
}
}
}