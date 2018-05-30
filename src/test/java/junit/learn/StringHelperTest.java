package junit.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.junit.learn.StringHelper;

public class StringHelperTest {

	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

	StringHelper helper;
	
	@Before
	public void Initialize(){
		helper = new StringHelper();
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testJustForKnowing(){
		assertEquals("AA", helper.truncateAInFirst2Positions("AAAA"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("A"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("AA"));
	}


	
}