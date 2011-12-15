package com.example.pilecki1.jsfdemo.domain;

public class Main {

public static void main(String[] args) {

Zoo z= new Zoo("Zoo in Gdansk");

z.AddAnimal(new Animals(KindOfAnimals.Mammals,"Zebra", 10));
z.AddAnimal(new Animals(KindOfAnimals.Mammals,"Giraffe", -2));
z.AddAnimal(new Animals(KindOfAnimals.Insects,"Spider", 4));
z.AddAnimal(new Animals(KindOfAnimals.Reptile,"Crocodile", 5 ));

Animals zw=new Animals(KindOfAnimals.Fish,"GoldFish", 10);

z.printAnimals();


try {
	zw.SetAge(-1.0);
} 
catch (AgeException e) 
{

}

System.out.println(z);
}

}
