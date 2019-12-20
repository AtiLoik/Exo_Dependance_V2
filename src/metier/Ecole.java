package metier;

import java.util.List;
import java.sql.*;

public class Ecole {
	private String nomEcole;
	private String adresseEcole;
	static String url = "jdbc:mysql://localhost/uml_java2";
	static String login = "root";
	static String passwd = "";
	
	// Constructeur
	public Ecole(String nomEcole, String adresse) {
		super();
		this.nomEcole = nomEcole;
		this.adresseEcole = adresse;
	}

	public String getNomEcole() {
		return nomEcole;
	}

	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	public String getAdresse() {
		return adresseEcole;
	}

	public void setAdresse(String adresse) {
		this.adresseEcole = adresse;
	}
	
	public static void afficherEtudiants(int id_ecole) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "SELECT * FROM etudiant WHERE id_ecole = '"+id_ecole+"'";
			System.out.println(sql);
			rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("prenom"));
			}
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
	}
	

	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresse=" + adresseEcole + "]";
	}
}
