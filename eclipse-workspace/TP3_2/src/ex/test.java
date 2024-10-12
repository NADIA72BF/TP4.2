package ex;

public class test {
	public static void main(String[] args) {
	personne P1=new personne("nadia","ben fadhel","menzel temime");
	personne P2=new personne ("Chantal","aa","France");
	personne P3=new personne ("Mohamed","bb","nabeul");
	compte[] comptes = new compte[3];
	comptes[0] =new compte(P1,50000,3000);
	comptes[1]=new compte (P2,6000,2000);
	comptes[2]=new compte (P3,7000,2000);
	System.out.println("Detail des comptes : ");
	for(int i=0;i<3;i++) {
		System.out.println(comptes[i].toString());
	}
	comptes[0].crediter(5000);
	comptes[1].crediter(5000);
	comptes[2].crediter(5000);
	for(int i=0;i<3;i++) {
		System.out.println(comptes[i].toString());
	}
	comptes[2].Virement(2000, comptes[0]);
	for(int i=0;i<3;i++) {
		System.out.println(comptes[i].toString());
	}
	compte.infoP(comptes);
	
	}

	

} 
