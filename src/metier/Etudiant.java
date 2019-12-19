package metier;

public class Etudiant extends Personne {
	private String numEtudiant;
	
	// Constructeur
	public Etudiant(String numEtudiant, String prenom, String nom) {
		super(prenom, nom);
		this.numEtudiant = numEtudiant;
	}
	
	public String faireExamen() {
		return prenom + " " + nom + " a fait l'examen.";
	}
	
	public boolean inscrire() {
		return true;
	}

	public String getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
}
