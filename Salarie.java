package packH;

public class Salarie {
	protected int Matricule ;
	protected String nom;
	protected int Recrutement;
	Salarie(int M,String n,int r){
		this.Matricule=M;
		this.nom=n;
		this.Recrutement=r;
	}
	public int getMatricule() {
		return Matricule;
	}
	public void setMatricule(int matricule) {
		Matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getRecrutement() {
		return Recrutement;
	}
	public void setRecrutement(int recrutement) {
		Recrutement = recrutement;
	}
	void Affiche () {
		System.out.println(" Matricule " + Matricule + 
				"\n son nom est : " + nom + "\n son annee de recrutement est : " + 
				Recrutement);
	}
	double Salaire() {
		double S;
		if(Recrutement<2005) {
			S=400 ;
		}
		else {
			S=280;
		}
		return S;
	}

}
