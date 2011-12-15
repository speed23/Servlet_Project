package com.example.pilecki1.jsfdemo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zoo {

private List<Animals> animal = new ArrayList<Animals>();

private String name;

private Collection<?> z;
private ArrayList<Animals> Animals;

public Zoo(String name) 
{

	super();
	this.Animals=new ArrayList<Animals>();
	this.name=name;

}


public void printAnimals()
{
	for (Animals z : animal)
	{
		z.PrintAnimal();
	}
}


public void AddAnimal(Animals z)
{
	Animals.add(z);
	String zw;
}

public void RemoveAnimal(Animals z)
{
	Animals.remove(z);
}

public int AnimalsExist(Animals z)
{
	return Animals.indexOf(z);
}

public void RemoveAllAnimals()
{
	Animals.removeAll(z);	

}

public  void AddMoreAnimals()
{
	Animals.addAll(Animals);
}

public List<Animals> ReturnAnimals() 
{
	return Animals;
}


public Animals FindByKind(KindOfAnimals kind){

for (Animals z : animal)
{	
	if (z.kind().equals(kind))
{		
	return z;
}
}
	return null;
}

  
public void SwitchAnimals(Animals z, String newAnimals, String newKind)
{
	this.name= newAnimals;	
}


}