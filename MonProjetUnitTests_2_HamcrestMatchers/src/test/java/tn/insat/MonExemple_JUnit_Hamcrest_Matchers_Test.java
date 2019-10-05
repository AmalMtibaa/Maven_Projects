package tn.insat;

import static org.hamcrest.Matchers.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MonExemple_JUnit_Hamcrest_Matchers_Test {

	@Test
	public final void test_Comparing_Objects() {

		int a = 5;
		int b = 5;

		// JUnit sans Hamcrest
		assertEquals(a, b);

		// JUnit avec AssertThat de Hamcrest
		assertThat(a, equalTo(b));
	}

	@Test
	public final void test_Comparing_Collections() {

		List<Integer> data = Arrays.asList(2, 5, 6);

		
		assertThat(data, hasSize(3));

		assertThat(data, contains(2, 5, 6));

		assertThat(data, containsInAnyOrder(2, 6, 5));

		assertThat(data, everyItem(greaterThan(1)));
	}

}
