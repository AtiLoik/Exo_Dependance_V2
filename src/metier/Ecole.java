package metier;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.List;

public class Ecole {
	private String nomEcole;
	private String adresseEcole;
	
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
	
	public void afficherEtudiants(List<Etudiant> listeEtudiants)
	{
		System.out.println("Liste des étudiants :");
		
		for(Etudiant etudiant : listeEtudiants)
		{
			System.out.println(etudiant);
		}
	}

	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresse=" + adresseEcole + "]";
	}
	
	public static void sauverEcole(int nomEcole, String adresseEcole)
	{
		String url = "jdbc:mysql://localhost/formation";	// Changer nom formation
		String login = "root";
		String passwd = "";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "Insert into Ecole values ("+nomEcole+", '"+ adresseEcole +"')";
			st.executeUpdate(sql);
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
				st.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void listeEcole()
	{
		String url = "jdbc:mysql://localhost/formation";	// Changer nom formation
		String login = "root";
		String passwd = "";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "Select * from Ecole";
			rs = st.executeQuery(sql);
			while(rs.next()) {
				String res = rs.getString("nomEcole")+ " " + rs.getString("adresseEcole") ;
				System.out.println(res);
			}
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
				st.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void supprimerEcole(String nomEcole)
	{
		String url = "jdbc:mysql://localhost/formation";
		String login = "root";
		String passwd = "";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "delete from Ecole where nomEcole ='"+ nomEcole +"'";
			st.executeUpdate(sql);
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
				st.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void updateEcole(String nomEcole)
	{
		String url = "jdbc:mysql://localhost/formation";
		String login = "root";
		String passwd = "";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "update Ecole set nomEcole ='"+ nomEcole +"' where nomEcole = 'Paris'";
			st.executeUpdate(sql);
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
				st.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
