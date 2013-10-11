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
	is.push(4);
	is.push(5);
	is.push(6);
	int k = is.pop();
	System.out.println(k);
	int[] m = is.peekAll();
	int p = is.peekAt(2);
	System.out.println(Arrays.toString(m));
	System.out.println(p);
    }

	//tests for popall:
	is.push(6);
	/*
	int[] j = is.popAll(); //i expect an array of size 3 with 6,5,4
	System.out.println(Arrays.toString(j));
	
	int[] l = is.ascend(); // i expect an array of size 3 with 4,5,6
	System.out.println(Arrays.toString(l)); */
	int[] m = is.descend(); // i expect an array of size 3 with 6,5,4
	System.out.println(Arrays.toString(m));



    }
}
