package tn.insat.domain;

/**
 * Employé del'INSAT.
 *
 * @author Mohamed Romdhani
 * @version 1.0
 */

public class Employe {

    /**
     * Matricule de l'employé
     */
    private String matricule;

    /**
     * Nom et prénom de l'employé
     */
    private String nom;
    /**
     * Grade administratif
     */

    private char grade;


    /**
     * Constructeur
     * @param matricule  Le matricule
     * @param nom le nom
     * @param grade Le grade
     */
    public Employe(String matricule, String nom, char grade) {
        super();
        this.matricule = matricule;
        this.nom = nom;
        this.grade = grade;
    }

}

