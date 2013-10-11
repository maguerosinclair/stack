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

    int[] peekAll() {
	int[] peekAll = new int[stack.length];
	for(int i=0; i<top; i++) {
	    peekAll[i] = stack[i];
        }
	return peekAll;
    }
    
    int peekAt(int position) {
	if(position>=top) return 0;
	return stack[position];

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

}
