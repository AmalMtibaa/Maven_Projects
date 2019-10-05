package tn.insat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ExemplesAssertJ_Simple_Test {
   
		
	@Test
	public final void demoAssertJ_entiers_Test() {
		int expected = 5;
		int actual = 5;
		
		assertThat(actual).as("Shoud 5 equal to %s",expected).isEqualTo(expected);
	}
	
	@Test
	public final void demoAssertJ_Strings_Test() {

		String message = "Bonjour";
		
		assertThat(message).
		          startsWith("B").
		          contains("jour").
		          hasSize(7);


	}
	
	
}
