package packH;

public class Employe extends Salarie {
	private double Hsupp;
	private double PHsupp;
	
	Employe(int M, String n, int r , double Hs, double PHs) {
		super(M, n, r);
		this.Hsupp=Hs;
		this.PHsupp=PHs;
	}

	public double getHsupp() {
		return Hsupp;
	}

	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}

	public double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	void Affiche(){
		System.out.println(" c'est un employe : \n ");
		super.Affiche();
		System.out.println(" Heures supp : "+ Hsupp +
				"\n prix Heures supp : " + PHsupp  + "\n \n ***********\n ") ; 
		
		}
	double Salaire() {
		double prime;
		double S=super.Salaire(); 
		prime=PHsupp*Hsupp;
		return S+prime;
	}	
}

