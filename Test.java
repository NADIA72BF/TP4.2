package packH;

public class Test {

	public static void main(String[] args) {
		Salarie T[]= new Salarie[5];
	    T[0] =new Employe(12345,"Walid",2002,15,4);
		T[1] =new Vendeur(23445,"Yessine",2007,1000,0.1);
		T[2] =new Vendeur(65478,"Nassime",2000,700,0.1);
		T[3] =new Employe(87698,"Aymen ",2003,19,5);
	    T[4] =new Employe(12345,"Khaled",2008,7,4); 
	    System.out.println("liste des employes : \n ");
		for(int i=0;i<5;i++) {
			if (T[i] instanceof Employe) {
				T[i].Affiche();
			}
		}
		 System.out.println("liste des vendeurs : \n ");
		for(int i=0;i<5;i++) {
			if (T[i] instanceof Vendeur) {
				T[i].Affiche();
			}
		}
		int salAn=T[0].Recrutement;
		String n=T[0].nom;
		for(int i=1;i<5;i++) {
			if(T[i].Recrutement<salAn) {
				salAn=T[i].Recrutement;
				n=T[i].nom;
			}
		}
		System.out.println("********* Nom du salarie le plus ancien dans l'entreprise *********\n"
				+ "             ****** nom : "+n+" recrute en l'an " +salAn+" ************");

		
		Salarie MaxV=null;
		for(Salarie e:T) {
			if (e instanceof Vendeur) {
				if(MaxV==null) {
					MaxV=e;
				}
			
			else if(e.Salaire()>MaxV.Salaire()) {
				MaxV=e;
			}
			}
			
		}
		double S=MaxV.Salaire();
		System.out.println("********* Matricule du vendeur disposant du plus grand salaire *********\n"
				+ "             ****** Matricule : "+MaxV.Matricule+" de salaire " + S+" ************");
		
		
			
	}
}


