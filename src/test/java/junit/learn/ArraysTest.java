package junit.learn;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {
	@Test(timeout=50)
	public void testPerformance() {
		for(int  i=0;i<1000000;i++){
			Arrays.sort(new int[]{i,i-1,i+1});
		}
	}
}