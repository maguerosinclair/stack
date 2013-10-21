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

    int pop(){
	//--happens before and changes top only if there is something left to pop
	if(isEmpty()==false){
	   return stack[--top]; 
	}
	return -1; 
    }
    int peek() {
	return stack[top-1];
    }


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
    }

    public static void main(String[] args) {
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	int k = is.pop();
	System.out.println(k);

	//reverse stack
	IntStack is_rev = is.reverseStack();
	int bottom = is_rev.pop();
	System.out.println(bottom);

	//sort
       IntStack is_sort = is.sort();  
	is_sort.print(); 

    }
}
