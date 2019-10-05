package tn.insat;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import tn.insat.domain.domain.Employe;


public class ExemplesAssertJ_SoftAssertions_Test {

	
	
	@Test
	public final void test_Soft_Assertions() {
		
		Employe undeTest = new Employe("E1000", "Monsieur XYZ", 1000.5);
		
		
        SoftAssertions softly = new SoftAssertions();
        
        softly.assertThat(undeTest).isNull();
		
        softly.assertThat(undeTest.getNom()).startsWith("A");
		
        softly.assertThat(undeTest.getSalaire()).isGreaterThanOrEqualTo(777777);
		
        softly.assertAll();
		
		
	}
	
	
	

}
