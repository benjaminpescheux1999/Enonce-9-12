package Ex9;

public class program {
	public static void main(String arg[]) {
		Personne personne1=new Personne("Benjamin","Pescheux");
		Personne personne2=new Personne("Benjamin","Pescheux",20);
		Personne personne3=new Personne("Pescheux",null);
		Personne personne4=new Personne("Mathis","Beruere",20);
		Chanteur C=new Chanteur("Benjamin","Pescheux",20);
		Personne P=new Personne("Guizz","Celestin",42);
		personne4.marier(personne2);
		
		P=C;
		Auteur A=new Auteur("Rick","Riordan",50);
		A.setTitres("La Terre Rouge ");
		A.setTitres("Piercy Jackson ");
		System.out.println(A.getTitres()+ " , il y a :" + A.getNbTitres()+" Livre(s)");
		
		System.out.println(personne1.sePresenter());
		System.out.println(personne2.sePresenter());
		System.out.println(personne3.getNom());
		System.out.println(C.sePresenter());
		System.out.println(P.sePresenter());
		System.out.println(C.getNom());
		System.out.println(C.getMaisonEdition());
		System.out.println(personne4.EstMarier());
		
		
		
		
	}

}
