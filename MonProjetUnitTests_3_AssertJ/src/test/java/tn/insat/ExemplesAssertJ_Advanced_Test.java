package tn.insat;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import tn.insat.domain.domain.Client;
import tn.insat.domain.domain.Employe;




public class ExemplesAssertJ_Advanced_Test {

	@Test
	public final void  Test_Collections() {
		
		List<Integer> data = Arrays.asList(2,5,6);
		
		assertThat(data).as("La taille de data doit être égale à %s", data.size()).hasSize(3);
		
		assertThat(data).as("data doit contenir 5 et 2").contains(5,2);
		
		assertThat(data).as("data contient exactement 2,5,6").containsExactlyElementsOf(Arrays.asList(2,5,6));
		
	   assertThat(data).as ("Tous les élements doivent être supérieurs à 1").
	             allSatisfy(x -> assertThat(x).isGreaterThan(1));
		
	}
	
	@Test 
	public final void test_Objets_Classes() {
		
		Employe e1 = new Employe("E1000", "Monsieur Toto", 100.5);
		Employe e2 = new Employe("E1000", "Monsieur Toto", 100.5);
		
		Client c1 = new Client("E1000", "Monsieur Toto");
		
	//	assertThat(e2).isEqualTo(e1);  // Nous comparons ici des références
		
//		assertThat(e2).isEqualToComparingFieldByFieldRecursively(e1);
		assertThat(e2).
		  isEqualToComparingOnlyGivenFields(c1, "matricule", "nom");
			
	}
	@Test 
	public final void test_Collections_d_objets() {
		
		List<Employe> dataSet1 =
				Arrays.asList(new Employe("E1000", "EMPLOYE 1", 100.5),
					         new Employe("E2000", "EMPLOYE 2", 200.5),
					         new Employe("E3000", "EMPLOYE 3", 300.5));
		
		List<Employe> dataSet2 =
				Arrays.asList(new Employe("E1000", "EMPLOYE 1", 100.5),
					         new Employe("E2000", "EMPLOYE 2", 200.5),
					         new Employe("E3000", "EMPLOYE 3", 300.5));
						
	     assertThat(dataSet2).containsExactly(new Employe("E1000", "EMPLOYE 1", 100.5),
		         new Employe("E2000", "EMPLOYE 2", 200.5),
		         new Employe("E3000", "EMPLOYE 3", 300.5));
	
	     
	     assertThat(dataSet2).containsExactlyElementsOf(dataSet1);
	
	     
//	     assertThat(dataSet2).
//			     usingRecursiveFieldByFieldElementComparator().
//			     isEqualTo(dataSet1);

	     
	     
	     
	}
	
	
}
