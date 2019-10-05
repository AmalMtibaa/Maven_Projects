package tn.insat;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThatCode;


public class ExemplesAssertJ_Exceptions_Test {

	private int diviser (int a, int b){
		return a/b;
	}
	
	
	@Test
	public final void test_Exemple_Exceptions() {
		
		assertThatThrownBy(() -> {
			   diviser(10,0);
			   }).isInstanceOf(ArithmeticException.class)
				 .hasMessageContaining("zero");
		
		
		assertThatCode(() -> {
			diviser(10,2);
			}).doesNotThrowAnyException();
	}
	
	
	

}
