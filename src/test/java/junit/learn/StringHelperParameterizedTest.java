package junit.learn;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junit.learn.StringHelper;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

	StringHelper helper = new StringHelper();;
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
		
	}


	@Parameters
	public static Collection<String[]> inputParameters(){
		
		String [][] inputsArray = {{"CD","AACD"},
				{"AA","AAAA"}};
		return Arrays.asList(inputsArray);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals(input, helper.truncateAInFirst2Positions(expectedOutput));
	}
	
	

	
}