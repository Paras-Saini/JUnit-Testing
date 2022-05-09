package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	
	@Before
	public void before() {
		helper=new StringHelper(); 
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		//expected, actual
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_testWithoutA() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Last2A() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	
	//ABCD=>false, ABAB=>true, AB=>true, A=>false
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenerio() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenerio() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}

//expected:<ABC[]> but was:<ABC[D]>


