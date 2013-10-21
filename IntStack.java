import java.util.*;

public class IntStack {
    int[] stack;
    int top;

    public IntStack(int size) {
	top=0;
	stack = new int[size];
    }

    boolean isEmpty() {
	//top==0 returns true or false
	return top==0;
    }
    void push(int num) {
	//++ happens after (does at the end of the line) 
	stack[top++]=num;       
    }

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
    }
    int peek() {
	return stack[top-1];
    }
    
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
    }

    public static void main(String[] args) {
	IntStack is = new IntStack(10);
	//push things in stack
	is.push(4);
	is.push(5);
	is.push(8);
	is.push(7);
	is.push(8);
	is.push(3);
	is.push(4);
	int k = is.pop();
	System.out.println(k);

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
