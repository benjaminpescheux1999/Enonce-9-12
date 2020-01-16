package Ex9;

import java.util.ArrayList;

public class Maisonedition 
{
	private String nom;
	ArrayList<Chanteur>Lesmaisons=new ArrayList<Chanteur>();
	
	public Maisonedition() 
	{
		
	}
	public void ajouterchanteur(Chanteur c) 
	{
		Lesmaisons.add(c);
	}
	public String afficherchanteurs() 
	{
		String message="";
		message=message+"voici les chanteur";
		
		for (Chanteur c: Lesmaisons)
		{
			message=message +c.sePresenter();
			
		}
		return message;
	}
	
}