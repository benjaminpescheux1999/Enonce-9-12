package Ex9;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	public String profession;
	private Personne conjoint;
	
	public Personne(String nom,String prenom) 
	{
		this.nom=nom;
		this.prenom=prenom;
		this.age=-1;
		this.profession="";
	}
	public Personne(String nom,String prenom,int age) 
	{
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.profession="";
	}
	
	public Personne(String nom,String prenom,int age,String profession) 
	{
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.profession=profession;
	}
	
	public String sePresenter()
	{
		String message="";
		message=message+"Je m'appelle "+this.prenom+" "+this.nom;
		
		
		if (age!=-1)
			{
				message=message+" j'ai " +this.age +" ans";
				
			}
				
		return message;
	}
	public String getNom()
	{
		String message= "Mon nom est "+this.nom;
		return message;
	}
	public String getNomPrenom()
	{
		String message= this.nom + " "+this.prenom;
		return message;
	}
	
	public void marier(Personne a)
	{
		this.conjoint=a;
	}
	public String EstMarier() 
	{
		String message=this.sePresenter();
		message=message+", je suis marier avec " +this.conjoint.getNomPrenom();
		return message;
	}

	
	

}
