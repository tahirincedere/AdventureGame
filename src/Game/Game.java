package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	
	Player player;
	Location location;
	Obstacle obstacle;
	Scanner scan=new Scanner(System.in);

	public void login()
	{
		System.out.println("Macera Oyununa Hoþgeldiniz..");
		System.out.print("Oyuna baþlamadan önce isminizi giriniz..");
		Scanner scan=new Scanner(System.in);
		String playerName=scan.nextLine();
		player=new Player(playerName);
		player.selectCha();
		
		start();
	}
	public void start() 
	{
	
		while(true) {
			  try {
		System.out.println();
		System.out.println("===========");
		System.out.println("Lütfen bir Bölge seçiniz.");
		System.out.println("1-Güvenli Ev -->Size ait güvenli bir mekan");
		System.out.println("2-Maðara-->Zombie Çýkabilir");
		System.out.println("3.Orman -->Vampir çýkabilir");
		System.out.println("4.Nehir -->Ayý çýkabilir");
		System.out.println("5-Maðaza -->Silah veya Zýrh Alabilirsiniz");
		System.out.println("Gitmek istediðiniz yer :");
	
  
		int selLoc=scan.nextInt();
		while(selLoc>5||selLoc<1)
		{	System.out.println("Lütfen geçerli bir yer seçiniz.");
			selLoc=scan.nextInt();
			
		
		}
		
		switch (selLoc) {
		case 1: {
			location=new SafeHouse(player);
			break;
			
		}
		case 2:{
			location=new Cave(player);
			break;
		}
		case 3:{
		
			location=new Forest(player);
			
			break;
			
		}
		case 5:{
			location=new ToolStore(player);
			break;
		}
		default:
			location=new SafeHouse(player);
		}
	
		
		
		if(!location.getLocation())
		{
			break;
		}

			  }
		   catch (Exception e) {
				System.out.println("Hatalý");
	
	}
		
		  

		
		}	
	}
	
}
