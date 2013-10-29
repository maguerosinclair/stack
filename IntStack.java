import java.util.*;

public class IntStack {
    int[] stack;
    int top;

    public IntStack(int size) {
	top=0;
	stack = new int[size];
    }

    public void print() {
	for(int i=0; i<top; i++){
	    System.out.println(stack[(top-1)-i]);
	}    
    }

    boolean isEmpty() {
	//top==0 returns true or false
	return top==0;
    }
    void push(int num) {
	//++ happens after (does at the end of the line) 
	stack[top++]=num;       
    }

<<<<<<< HEAD
    int pop(){
	//--happens before and changes top only if there is something left to pop
	if(isEmpty()==false){
	   return stack[--top]; 
	}
	return -1; 
=======
    //Alia
    int depth(){
	//returns the depth, same as top
	int depth = top;
	return depth;
    }

    //Alia
    int[] popfrompoint(int popoint){
	// pop all from point that is input
	int i = 0;
	int[] popped = new int[top- popoint];
	while (top > popoint){
	    popped[i++] = stack[top--];
	}
	// print the array
	for (int b  = 1; b < popped.length; b++){
	    System.out.print(popped[b] + " ");
}
	System.out.println();
	return popped;	
    }

      int pop() {
	//--happens before and changes top
	return stack[--top];
>>>>>>> 04bd9b04d8de6b24f272ac6f1ece971e70e484fd
    }
    int peek() {
	return stack[top-1];
    }
<<<<<<< HEAD


    IntStack reverseStack(){
	//make a newStack thats empty
	IntStack newStack = new IntStack(stack.length);	
	while (! isEmpty()){  //repeat until isEmpty()
	    int p = pop();  //pop the top item and push that onto the newStack
 	    newStack.push(p); 
        }  
	return newStack; //return newStack
    }

    IntStack  sort() {
	//create two new empty stacks
      	IntStack newStack1 = new IntStack(stack.length);
	IntStack newStack2 = new IntStack(stack.length);
	while (! isEmpty()){ //repeat until isEmpty()
	    int p = peek(); 	//peek top number of original stack
	    if(p<5){ //if its less than five, pop it and push it onto the first new stack
		newStack1.push(p);
	    }
	    else {  //if its greater than or equal to five, pop it and push it onto the second new stack
		newStack2.push(p); 
	    }
	}
        newStack1.push(newStack2.pop()); //pop the top number of the second new stack and push it onto the first new stack
	return newStack1; 
=======
    
    int[] popAll() {
	//make array of size top, fill that with all items in stack, and then return the array
	int[] popAll = new int[top]; 
	for(int i = 0; !isEmpty(); i++)
	    {
		popAll[i]= pop();
		System.out.println(popAll[i]);
	    }
	return popAll;
	
      }
    int[] ascend() {
	int[] ascend = new int[top];
	ascend = popAll();
        
	Arrays.sort(ascend);
	return ascend;
    }
     int[] descend() {
	int[] descend = new int[top];
	descend = popAll();
        
	Arrays.sort(descend);
	reverse(descend);
	return descend;
    }

    //peak all the values in the stack
    int[] peekAll() {
	//fill new int array peakAll with length stack.length
	int[] peekAll = new int[stack.length];
	//fill peakAll with values of stack[], stopping before "top" of stack
	for(int i=0; i<top; i++) {
	    peekAll[i] = stack[i];
        }
	//return created stack
	return peekAll;
    }
    
    //peek certain value in stack
    int peekAt(int position) {
	//returns zero if you peek value that is at or above top
	if(position>=top) return 0;
	//return the position
	return stack[position];

    }


    //taken from stackoverflow
    public static void reverse(int[] data) {
	for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	    // swap the values at the left and right indices
	    int temp = data[left];
	    data[left]  = data[right];
	    data[right] = temp;
	}
>>>>>>> 04bd9b04d8de6b24f272ac6f1ece971e70e484fd
    }

    public static void main(String[] args) {
	IntStack is = new IntStack(10);
<<<<<<< HEAD
=======
	//push things in stack
>>>>>>> 04bd9b04d8de6b24f272ac6f1ece971e70e484fd
	is.push(4);
	is.push(5);
	is.push(8);
	is.push(7);
	is.push(8);
	is.push(3);
	is.push(4);
	int k = is.pop();
	System.out.println(k);

<<<<<<< HEAD
	//reverse stack
	IntStack is_rev = is.reverseStack();
	int bottom = is_rev.pop();
	System.out.println(bottom);

	//sort
       IntStack is_sort = is.sort();  
	is_sort.print(); 

    }
}
=======
	//testing peek all method
	int[] mm = is.peekAll();
	System.out.println(Arrays.toString(mm));
	//testing peek at position 2
	int p = is.peekAt(2);
	System.out.println(p);

	// tests for depth:
	int d = is.depth();
	System.out.println(d);
	
	//tests for pop from point: this pops all of them out of the array until there are only the number you choose left 
	is.popfrompoint(5);
	//peek all
       	int[] mmm = is.peekAll();
	System.out.println(Arrays.toString(mmm));
	//restoring stack
	is.push(7);
	is.push(5);
	is.push(3);
	is.push(2);
	//peek all
	int[] mmmm = is.peekAll();
	System.out.println(Arrays.toString(mmmm));
	//tests for popall:
    
	is.push(4);
	is.push(5);
	is.push(6);
       
	int[] j = is.popAll(); //i expect an array of size 3 with 6,5,4
	System.out.println(Arrays.toString(j));
	// test for ascend
	is.push(4);
	is.push(5);
	is.push(6);
	
	int[] l = is.ascend(); // i expect an array of size 3 with 4,5,6
	System.out.println(Arrays.toString(l));
	//test for descend 
	is.push(4);
	is.push(5);
	is.push(6);
    	int[] m = is.descend(); // i expect an array of size 3 with 6,5,4
     System.out.println(Arrays.toString(m));
	
	
    }



    }
>>>>>>> 04bd9b04d8de6b24f272ac6f1ece971e70e484fd
