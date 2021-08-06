public class Memory {
    public static void main(String[] args) { 	// Line 1
        int i=1; 	// Line 2
        Object obj = new Object(); 	// Line 3
        Memory mem = new Memory(); 	// Line 4
        mem.foo(obj); 	// Line 5
    } 	// Line 9
    private void foo(Object param) { 	// Line 6
        String str = param.toString(); 	// Line 7
        System.out.println(str); } 	// Line 8
}

//In line 1 Java Runtime creates stack memory to be used by main() method thread.
//In line 2 Variables are stored in the stack memory of main() method.
//In line 3 creating an Object "obj" is created in heap memory and stack memory contains the reference
//In line 4 creating an Object "mem" for the Memory class is created in heap memory and stack memory contains the reference
//In line 5 call the foo() method, a block in the top of the stack is created to be used by the foo() method
//In line 6 a new reference to Object is created in the foo() stack block.
//In line 7 string is created, it goes in the String Pool in the heap space and
//          a reference is created in the foo() stack space for it
//In line 8 foo() method is terminated, at this time memory block allocated for foo() in stack becomes free
//In line 9 main() method terminates and the stack memory created for main() method is destroyed
//Finally, the program ends at this line, hence Java Runtime frees all the memory and ends the execution of the program

