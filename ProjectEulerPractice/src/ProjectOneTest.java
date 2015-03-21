import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectOneTest {

	@Test
	public void ensureThreeIsAMultipleTest() {
		int expected = 3;

		int actual = ProjectOne.sumOfMultliplesOfThreeAndFive(4);
		assertEquals(expected, actual);
	}

	@Test
	public void ensureThreeAndFiveIsAMultipleTest() {
		int expected = 8;

		int actual = ProjectOne.sumOfMultliplesOfThreeAndFive(6);
		assertEquals(expected, actual);
	}
	
	@Test
	public void ensureTwentyThreeForSumBelowTen() {
		int expected = 23;

		int actual = ProjectOne.sumOfMultliplesOfThreeAndFive(10);
		assertEquals(expected, actual);
	}
	

}
