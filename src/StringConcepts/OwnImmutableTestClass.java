package StringConcepts;

public final class OwnImmutableTestClass {
	 // we create class final because it is constant and we cannot change
	
	private int i;
	OwnImmutableTestClass(int i)
	{
		this.i = i;
	}
	
	// because of below code class is immutable
	// All string class follow the same logic
	public OwnImmutableTestClass modify(int i)     // if value of i defined in constructor and defined in modify()is same then no new object formed
	{
		if(this.i==i)
		{
			return this;
		}else
		{
			
			return new OwnImmutableTestClass(i);   // new object will be formed
		}
	}

	public static void main(String[] args) {
		
		OwnImmutableTestClass test1 = new OwnImmutableTestClass(10);  // we create object with value 10
		OwnImmutableTestClass test2 = test1.modify(100);     // we now modify value to 100 new object will be created
		OwnImmutableTestClass test3 = test1.modify(10); // we now modify value to 10 but object of value 10 is already created, no new object is created
		System.out.println(test1==test2);
		System.out.println(test1==test3);

	}

}
