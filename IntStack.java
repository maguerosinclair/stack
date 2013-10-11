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
	//pop all until top is at a certain pointt
	// make int array of things popped that will be returned
	// make int for position in popped that the thing that is popped out will be placed in
	int i = 0;
	int[] popped = new int[top- popoint];
	    // if top is greater than popoint, place the point that is popped out of the stack into a new array, called popped 
	while (top > popoint){
	    popped[i++] = stack[top--];
	}
	// print the array
	for (int b  = 0; b < popped.length; b++){
	    System.out.print(popped[b] + " ");
}
	return popped;	
    }

      int pop() {
	//--happens before and changes top
   	return stack[--top];
     }

    int peek() {
	return stack[top-1];
    }

    public static void main(String[] args) {
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	int k = is.pop();
	System.out.println(k);
    }
}
