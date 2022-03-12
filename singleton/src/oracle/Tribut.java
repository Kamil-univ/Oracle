package oracle;

public abstract class Tribut {
	private String nom;
	private String nomOracle;
	private String nomTotem;
	
	public Tribut(String nom) {
		this.nom = nom; 
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNomOracle() {
		return nomOracle;
	}
	public void setNomOracle(String nomOracle) {
		this.nomOracle = nomOracle;
	}

}
