package metier;

public class Professeur extends Personne {

	private String numeroProfesseur;

	public Professeur(String numeroProfesseur, String prenom, String nom) {
		super(prenom, nom);
		this.setNumeroProfesseur(numeroProfesseur);
	}

	public String getNumeroProfesseur() {
		return numeroProfesseur;
	}

	public void setNumeroProfesseur(String numeroProfesseur) {
		this.numeroProfesseur = numeroProfesseur;
	}
}
