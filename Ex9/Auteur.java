package Ex9;

import java.util.ArrayList;

public class Auteur extends Personne {

	private ArrayList<String> titre =new ArrayList<>();
	private int nbtitre;
	Personne p2;
	
	public Auteur(String nom, String prenom, int age) 
	{
		super(nom,prenom,age);
		profession="auteur";
		p2=new Personne(nom,prenom,age,profession);
	}
	public String sePresenter() 
	{
		String message= "";
		message= message + p2.sePresenter();
		return message;
	}
	public void setTitres(String a)
	{
		titre.add(a);
		nbtitre ++;
	}
	public String getTitres()
	{
		String message ="Liste des titres de cet auteur : ";
		for(String a:titre)
			message=message + a;
		return message;
	}
	public int getNbTitres()
	{
		return nbtitre;
	}

}
