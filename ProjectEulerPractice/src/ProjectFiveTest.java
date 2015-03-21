import static org.junit.Assert.*;

import org.junit.Test;

//Developed test practicing TDD

public class ProjectFiveTest {

	@Test
	public void ensureNumberisDivisbleByTwoAndThree() {
		boolean actual = true;
		boolean expected = ProjectFive.checkNumberTwoAndThree(6);

		assertEquals(expected, actual);

	}

	@Test
	public void ensureNumberisDivisbleByFourAndFive() {
		boolean actual = true;
		boolean expected = ProjectFive.checkNumberFourAndFive(20);

		assertEquals(expected, actual);
	}

	@Test
	public void ensureNumberisDivisbleBySixThroughTwenty() {
		boolean actual = true;
		boolean expected = ProjectFive.checkNumberSixThroughTwenty(232792560);

		assertEquals(expected, actual);
	}

}
