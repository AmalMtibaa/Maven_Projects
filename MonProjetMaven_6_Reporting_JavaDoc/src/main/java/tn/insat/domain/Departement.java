package tn.insat.domain;

import java.util.Collection;

/**
 * Département de l'INSAT.
 * 
 * @author Mohamed Romdhani
 * 
 * @version 1.0
 *
 */
public class Departement {
	
	/**
	 * Le staf ie les membres du département
	 */
	private Collection<Employe> staf;

	/**
	 * 
	 * @param staf Les membres du département.
	 */
	public Departement(Collection<Employe> staf) {
		super();
		this.staf = staf;
	}
	
	

}
