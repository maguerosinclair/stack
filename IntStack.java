public class IntStack {
    int[] stack;
    int top;

    public Int Stack(int size) {
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
	return stack[--top]
    }
    int peek() {
	return stack[top-1}
    }

    public static void main(String[] args) {
	IntStack is = new Int Stack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	int k = is.pop();
	System.out.println(k);

}
