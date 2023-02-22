package com.pair25.minStackImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinStackTests {
	
	
	
	
	@Test
	public void testStackPushPositiveCase1() {
		MinStack minStack = new MinStack(2);
		minStack.push(4);
		int arr[] =   minStack.getStk();
		Assertions.assertEquals(arr[0], 4);
	}
	
	@Test
	public void testStackPopPositiveCase1() {
		MinStack minStack = new MinStack(2);
		minStack.push(4);
		minStack.push(5);
		int minValue = minStack.pop();
		Assertions.assertEquals(minValue, 4);
	}
	
	@Test
	public void testStackTopPositiveCase1() {
		MinStack minStack  = new MinStack(2);
		minStack.push(4);
		minStack.push(5);
		int topValue = minStack.top();
		Assertions.assertEquals(topValue, 5);
	}
	
	S
	

}
