package presentation;
import java.util.ArrayList;
import java.util.List;

import metier.*;

public class Lanceur {

	public static void main(String[] args) {
		
		Etudiant etudiant1 = new Etudiant("1", "Morgan", "Franca");
		Etudiant etudiant2 = new Etudiant("2", "Loik", "Breton");
		
		Ecole ecole = new Ecole("ENSUP", "1 bis Avenue du 8 mai 1945");
		
		List<Etudiant> etudiantsInscrits = new ArrayList<Etudiant>();
		
		if(etudiant1.inscrire())
			System.out.println(etudiant1.faireExamen());
		
		if(etudiant2.inscrire())
			System.out.println(etudiant2.faireExamen());
		
		etudiantsInscrits.add(etudiant1);
		etudiantsInscrits.add(etudiant2);

		ecole.afficherEtudiants(etudiantsInscrits);
		
		System.out.println(ecole.toString());
	}

}
