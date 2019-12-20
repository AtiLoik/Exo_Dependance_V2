package metier;
import java.util.List;
import java.sql.*;

public class Etudiant extends Personne implements Travail {
	private String numEtudiant;
	static String url = "jdbc:mysql://localhost/uml_java2";
	static String login = "root";
	static String passwd = "";
	
	// Constructeur
	public Etudiant(String numEtudiant, String prenom, String nom) {
		super(prenom, nom);
		this.numEtudiant = numEtudiant;
	}
	
	public String faireExamen() {
		return prenom + " " + nom + " a fait l'examen.";
	}
	
	public static boolean inscrire(String prenom, String nom, String numeroEtudiant, String id_ecole) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "INSERT into etudiant (id_ecole, prenom, nom, numeroEtudiant) VALUES "
					+ "('"+id_ecole+"'"
					+ ",'"+prenom+"'"
					+ ",'"+nom+"'"
					+ ", '"+numeroEtudiant+"'"
					+")";
			System.out.println(sql);
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public static boolean faireExamen(String numeroEtudiant) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "UPDATE etudiant SET examenFait = 1 WHERE numeroEtudiant = '"+numeroEtudiant+"'";
			System.out.println(sql);
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
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

	@Override
	public void faireLesDevoirs() {
		System.out.println(prenom + " " + nom + " a fait ses devoirs.");
		
	}
}
