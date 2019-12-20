package presentation;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import metier.*;

public class Lanceur {

	public static void main(String[] args) {
		
		
		
		//Etudiant.inscrire(etudiant1.getPrenom(), etudiant1.getNom(), etudiant1.getNumEtudiant(), 1);
		//Etudiant.faireExamen("2");
		
		
		//Ecole.afficherEtudiants(1);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Merci d'entrer les informations étudiant.");
			System.out.print("Prénom : ");
			String prenom = br.readLine();
			System.out.print("");
			System.out.print("Nom : ");
			String nom = br.readLine();
			System.out.print("");
			System.out.print("Numéro étudiant : ");
			String numero = br.readLine();
			System.out.print("");
			System.out.print("Code école : ");
			String id_ecole = br.readLine();
			System.out.print("");
			Etudiant etudiant1 = new Etudiant(numero, prenom, nom);
			Etudiant.inscrire(etudiant1.getPrenom(), etudiant1.getNom(), etudiant1.getNumEtudiant(), id_ecole);
			
			Ecole.afficherEtudiants(1);
           
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}

}
