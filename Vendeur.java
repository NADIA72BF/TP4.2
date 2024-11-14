package packH;

public class Vendeur extends Salarie {
	
	private double Vente;
	private double pourcentage;
	
	Vendeur(int M, String n, int r , double V, double p) {
		super(M, n, r);
		this.Vente=V;
		this.pourcentage=p;
	}
	
	public double getVente() {
		return Vente;
	}
	
	public void setVente(double vente) {
		Vente = vente;
	}
	
	public double getPourcentage() {
		return pourcentage;
	}
	
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	void Affiche() {
		System.out.println(" c'est un vendeur : \n ");
		super.Affiche();
		System.out.println(" Vente : "+ Vente +
				"\n pourcentage : " + pourcentage  + "\n \n ***********\n ") ; 	
	}
	
	double Salaire() {
		double S=super.Salaire();
		S+=pourcentage*Vente;
		return S;
	}
	
}
