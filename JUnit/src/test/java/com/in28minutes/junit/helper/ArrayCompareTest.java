package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class ArrayCompareTest {

	//Arrays.sort
	
	@Test
	public void testArraysSort_RandomArray() {
		int [] num= {1,2,4,3};
		int [] expected= {1,2,3,4};
		Arrays.sort(num);
		assertArrayEquals(expected,num);
	}
	
	@Test(expected=NullPointerException.class)
	//method should throw an exception otherwise it will failure
	public void testArraysSort_NullArray() {
		int [] num= null;
		//int [] expected= {1,2,5,4};
			Arrays.sort(num);
		//assertArrayEquals(num);
	}
	
	@Test(timeout = 10)
	public void testSort_Performance() {
		int arr[]= {12,23,4};
		for(int i=1;i<=1000000;i++) {
			arr[0]=i;
			Arrays.sort(arr);
		}
	}
}
