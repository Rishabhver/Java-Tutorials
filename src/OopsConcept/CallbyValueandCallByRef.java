package OopsConcept;

public class CallbyValueandCallByRef {
	
	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallbyValueandCallByRef obj = new CallbyValueandCallByRef();
		int  x = 10;
		int y = 20;
		
		obj.test(x, y); // call by value or pass by value - we are giving value to test(int a, int b)
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		// After swap
		
		System.out.println(obj.p);  // 60
		System.out.println(obj.q);   // 50 ---- because of swap
		
		
	
	}
	
	
	public int test(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	// call by reference - We are giving reference
	// ** is it possible to do call by reference in java - Yes, by using object reference
	public void swap(CallbyValueandCallByRef t) 
	{
		
		int temp = t.p; // temp = 50
		t.p = t.q;       // t.p = 60
		t.q = temp;     // t.q = 50
	}

}
