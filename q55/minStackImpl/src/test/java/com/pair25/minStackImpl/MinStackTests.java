package com.pair25.minStackImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinStackTests {
	
	
	@Test
	public void testStackPushPositiveCase1() throws Exception {
		MinStack minStack = new MinStack(2);
		minStack.push(4);
		int arr[] =   minStack.getStk();
		Assertions.assertEquals(arr[0], 4);
	}
	
	@Test
	public void testStackPopPositiveCase1() throws Exception {
		MinStack minStack = new MinStack(2);
		minStack.push(4);
		minStack.push(5);
		int minValue = minStack.pop();
		Assertions.assertEquals(minValue, 4);
	}
	
	@Test
	public void testStackTopPositiveCase1() throws Exception {
		MinStack minStack  = new MinStack(2);
		minStack.push(4);
		minStack.push(5);
		int topValue = minStack.top();
		Assertions.assertEquals(topValue, 5);
	}
	
	@Test
	public void testStackOverflowCase1() throws Exception {
		MinStack minStack = new MinStack(2);
		minStack.push(4);
		minStack.push(5);
		Assertions.assertThrows(Exception.class, () -> {minStack.push(1);});
		
		
	}
	
	@Test
	public void testStackUnderflowCase1() throws Exception {
		MinStack minStack = new MinStack(2);
		Assertions.assertThrows(Exception.class, () -> {minStack.pop();});
	}
	
	@Test
	public void testStackSameInputCase1() throws Exception {
		MinStack minStack = new MinStack(2);
		minStack.push(0);
		minStack.push(0);
		minStack.pop();
		int minValue = minStack.pop();
		Assertions.assertEquals(minValue, 0);
	}
	
	@Test
	public void testStackTopInEmptyStack() {
		MinStack minStack = new MinStack(2);
		Assertions.assertThrows(Exception.class, ()->{minStack.top();});
	}
	
	@Test
	public void testStackWithZeroSize() {
		MinStack minStack = new MinStack(0);
		
		Assertions.assertThrows(Exception.class, () -> {minStack.push(4);});
	}
	
	@Test
	public void testStackWithNegativeSize() {
		MinStack minStack = new MinStack(-7);
		
		Assertions.assertThrows(Exception.class, () -> {minStack.push(4);});
	}
	
	

}
