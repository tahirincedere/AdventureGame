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
		System.out.println("Macera Oyununa Ho�geldiniz..");
		System.out.print("Oyuna ba�lamadan �nce isminizi giriniz..");
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
		System.out.println("L�tfen bir B�lge se�iniz.");
		System.out.println("1-G�venli Ev -->Size ait g�venli bir mekan");
		System.out.println("2-Ma�ara-->Zombie ��kabilir");
		System.out.println("3.Orman -->Vampir ��kabilir");
		System.out.println("4.Nehir -->Ay� ��kabilir");
		System.out.println("5-Ma�aza -->Silah veya Z�rh Alabilirsiniz");
		System.out.println("Gitmek istedi�iniz yer :");
	
  
		int selLoc=scan.nextInt();
		while(selLoc>5||selLoc<1)
		{	System.out.println("L�tfen ge�erli bir yer se�iniz.");
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
				System.out.println("Hatal�");
	
	}
		
		  

		
		}	
	}
	
}
