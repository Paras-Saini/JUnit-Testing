package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class StringHelperParametrizedTest2 {
	
	StringHelper helper=new StringHelper();
	
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParametrizedTest2(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}


	@Parameters
	public static Collection<String[]>  testConditions() {
		String expectedOutputs[][]={{"AACD","CD"}, {"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
		//expected, actual
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
	}
	
	
	
	

}

//expected:<ABC[]> but was:<ABC[D]>


