package Ex9;

public class Chanteur extends Personne
{	
	private String maisonEdition;
	
	public Chanteur(String nom,String prenom,int age) 
	{
		super(nom,prenom,age);
		this.profession="Chanteur";
		this.maisonEdition="Jul";
	}
	
	public String sePresenter()
	{
		String message="";
		message=message+super.sePresenter()+" et je suis "+this.profession;
		return message;
	}
	public String getMaisonEdition()
	{
		String message= "Ma maison d'edition est "+this.maisonEdition;
		return message;
	}
}
