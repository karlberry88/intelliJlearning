import junit.framework.*;

import org.junit.Test;

public class Demo {
	
	@Test
	public void Addition(){
		float a = 22.0F;
		float b = 11.0F;
		float c = 1.0F;
		
		Assert.assertEquals(34.0F, a+b+c);
		
	}
		@Test
		public void Subtraction() {
		int a = 10;
		int b = 5;
		int c = 1;
		Assert.assertEquals(4,a-b-c);
		
		}
		@Test
		public void Multiplication() {
		int a = 10;
		int b = 5;
				Assert.assertEquals(50,a*b);
		}
		@Test
		public void Modulus() {
		int a = 10;
		int b = 5;
		Assert.assertEquals(2,a/b);
	}
}
