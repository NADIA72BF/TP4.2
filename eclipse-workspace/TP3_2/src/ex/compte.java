package ex;

public class compte {
	
	public static int C=1;
	private double solde;
	private personne titulaire;
	private double debitMax;
	private double decouvertMax;
	private int numC;
	
	public double getDebitMax() {
		return debitMax;
	}
	public void setDebitMax(double debitMax) {
		this.debitMax = debitMax;
	}
	public double getDecouvertMax() {
		return decouvertMax;
	}
	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public personne getTitulaire() {
		return titulaire;
	}
	public void setTitulaire(personne titulaire) {
		this.titulaire = titulaire;
	}
	
	public compte( personne titulaire) {
		this.titulaire = titulaire;
		this.debitMax = 1000;
		this.decouvertMax = 800;
		this.numC = C;
		C++;
	}
	public compte(personne titulaire ,double debitMax,double decouvertMax) {
		this.titulaire = titulaire;
		this.debitMax = debitMax;
		this.decouvertMax = decouvertMax;
		this.numC = C;
		C++;
		
	}
	public String toString() {
		return "***** \n compte "+ numC +  "[ solde=" + solde + "\n, titulaire=" + titulaire.getNom() + "\n, debitMax=" + debitMax + "\n, decouvertMax=" + decouvertMax + "\n, numC=" + numC + "\n]******\n";
	}
	
	void crediter (double sol) {
		if(sol>0) {
			solde=solde+sol;
		}
	}
	
	boolean debiter(double mon) {
		boolean ok = false;
		if((mon>0)&&(mon<=debitMax)&&(solde-mon)>=decouvertMax) {
			solde=solde-mon;
			ok=true;
		}
		return ok;
	}
	
	boolean estaDecouvert(compte C) {
		if(solde<0) {
			return true;
		}
		return false;
		
	}
	
	void MontantDecouvert(compte C) {
		if(estaDecouvert(C)) {
			System.out.println (solde) ;
		}
		else {
			System.out.println("votre solde n'est pas a decouvert");
		
		}
	}
		
	void Virement (double montant,compte C1) {
		if(this.debiter(montant)) {
			C1.crediter(montant);
		}
	}
	
	public static void Virement (double montant,compte C1,compte C2) {
		if(C1.debiter(montant)) {
			C2.crediter(montant);
		}
	}
	public static void infoP(compte[] comptes) {
		compte compteMax = comptes[0];
		for (int i = 1; i < comptes.length; i++) {
            if (comptes[i].getSolde() > compteMax.getSolde()) {
                compteMax = comptes[i];
            }
		}
		System.out.println("\nLe proprietaire du compte avec le solde le plus élevé est :");
		System.out.println("Nom : " + compteMax.getTitulaire().getNom());
	    System.out.println("Prénom : " + compteMax.getTitulaire().getPrenom());
	    System.out.println("Adresse : " + compteMax.getTitulaire().getAdresse());
	    System.out.println("Solde : " + compteMax.getSolde());
		
	}
}
