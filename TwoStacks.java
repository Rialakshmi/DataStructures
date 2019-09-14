public class TwoStacks {
int size;
int sizeFirstStack;
int sizeSecondStack;
int index;
int[] array;

public  TwoStacks(int size) {
array=new int[size];
this.size=size;sizeFirstStack=0;sizeSecondStack=0;index=0;
}

public void push(int element,String flag)  throws Exception {
if(!(flag.equals("first") || flag.equals("second"))) {
 throw new Exception("You didnt specify either first or second Array");
}


if(flag.equals("first") && index<(size-sizeSecondStack)) {
array[index] = element;
index ++; sizeFirstStack ++;
} else {
throw new Exception("Stack Overflow First Array");
}

if(flag.equals("second") && index<(size-sizeFirstStack)) {
array[index] = element;
index ++; sizeSecondStack ++;
} else {
throw new Exception("Stack Overflow Second Array");
}


}

public int pop(String flag) throws Exception{
if(!(flag.equals("first") || flag.equals("second"))) {
throw new Exception("You didnt specify either first or second Array");
}
if(flag.equals("first") && sizeFirstStack > 0) {
index = index -1;
sizeFirstStack = sizeFirstStack -1;
return array[sizeFirstStack+1];
} else {
throw new Exception("Stack Underflow First Array");
}

if(flag.equals("first") && sizeFirstStack > 0)  {
index = index -1;
sizeFirstStack = sizeFirstStack -1;
return array[sizeFirstStack+1];
} else {
throw new Exception("Stack Underflow Second Array");
} 

}

public static void main(String args[]) {
TwoStacks twoStacks=new TwoStacks(10);
try {
twoStacks.push(10,"first");
twoStacks.push(9,"first");
twoStacks.push(8,"first");
twoStacks.push(7,"first");
twoStacks.push(6,"first");
twoStacks.push(5,"second");
twoStacks.push(4,"second");
twoStacks.push(3,"second");
twoStacks.push(2,"second");
twoStacks.push(1,"second");
System.out.println(twoStacks.pop("first"));
System.out.println(twoStacks.pop("first"));
System.out.println(twoStacks.pop("first"));
System.out.println(twoStacks.pop("first"));
System.out.println(twoStacks.pop("first"));
System.out.println(twoStacks.pop("second"));
System.out.println(twoStacks.pop("second"));
System.out.println(twoStacks.pop("second"));
System.out.println(twoStacks.pop("second"));
System.out.println(twoStacks.pop("second"));
}
catch(Exception e) {
System.out.println(e.getMessage());
}
}
}
