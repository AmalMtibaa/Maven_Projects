package tn.insat.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static tn.insat.domain.CalculUtilities.additionner;

public class CalculTest {

	// private CalculUtilities underTest;

	// @Before
	// public void setUp() throws Exception {
	// //underTest = new CalculUtilities();
	// }
	//
	// @After
	// public void tearDown() throws Exception {
	// //underTest = null;
	// }

	@Test
	public final void testAdditionner() {

		// Given (ARRANGE)
		int a = 5;
		int b = 5;
		int expected = 10;

		// When (ACT)
		int actual = additionner(a, b);

		// Then (ASSERT)
		assertEquals(expected, actual);

	}

	@Test
	public final void testDiviser_Nominal() {

		// Given
		int a = 20;
		int b = 3;
		int expected = 6;

		// When
		int actual = CalculUtilities.diviser(a, b);

		// Then
		assertEquals(expected, actual);

	}
	@Test(expected=ArithmeticException.class)
	public final void testDiviser_Degradé() {

		// Given
		int a = 20;
		int b = 0;
		//int expected = 6;

		// When
	     CalculUtilities.diviser(a, b);

		// Then
		

	}

}
