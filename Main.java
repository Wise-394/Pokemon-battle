package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Pokemon p1 = new Pokemon();
		p1.name ="pikachu";
		p1.hp = 100;
		p1.dmg = 20;
		
		Pokemon p2 = new Pokemon();
		p2.name = "charizard";
		p2.hp = 100;
		p2.dmg = 20;
		
		System.out.println(p1.name + " vs " + p2.name);
		System.out.println("What do u want to do?");
		System.out.println("1.Attack \n2.Run");
		Scanner scn = new Scanner(System.in);
		int action = scn.nextInt();
		
		if (action == 2)
		{
			System.out.println("You succesfully escaped");
			return;
		}
		else if (action == 1) 
		{
			p2.hp -= p1.dmg;
			System.out.println(p1.name + " attacked " + p2.name + " and dealt " + p1.dmg + " damage" );
			System.out.println(p2.name + " has only " + p2.hp + " hp remaining");
		}
	}

}
