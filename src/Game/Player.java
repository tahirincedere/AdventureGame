package Game;

import java.util.Scanner;

public class Player {
	private int damage;
	private int healthy;
	private int money;
	private String name;
	private String cName;
	private Inventory inv;
	private int rHealthy;
	
	public Player(String name) {
		this.name = name;
		this.inv=new Inventory();
	}
	
	
	Scanner scan = new Scanner(System.in);

	

	public void selectCha() {
		switch (chaMenu()) {
		case 1: {
			initPlayer("Samuray", 5, 21, 15);
			break;
		}
		case 2:{
			initPlayer("Ok�u", 7, 18, 20);
			break;
		}
		case 3:{
			initPlayer("�ovalye", 8, 24, 5);
			break;
		}
		default:	setcName("Samuray");
		setDamage(5);
		setHealthy(21);
		setMoney(15);
		
		}
		System.out.println("Karakter olu�tu."+toString());
		

	
	}
	public int getTotalDamage()
	{
		return this.getDamage()+this.getInv().getDamage();
	}
	public void initPlayer(String cName,int damage,int healthy,int money)
	{
		setcName(cName);
		setDamage(damage);
		setHealthy(healthy);
		setMoney(money);
		setrHealthy(healthy);
	}

	public int chaMenu() {
		System.out.println("L�tfen bir karakter se�iniz.");
		System.out.println("1-Samuray, Hasar:5,Sa�l�k:21, Para:15");
		System.out.println("2-Ok�u , Hasar:7, Sa�l�k:18, Para:20");
		System.out.println("3-�ovalye , Hasar:8,Sa�l�k:24, Para:5");
		System.out.println("Karakter se�iniz..");
		int chaId=0;
	int i=0;
		do {
			 
			if(i!=0)
				System.out.println("Yanl�s karakter se�imi..");
           chaId=scan.nextInt();
          
         i++;
           
		}while(chaId<1||chaId>3);
		return chaId;
	}
	
	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}


	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	@Override
	public String toString() {
		return "Player [cName=" + cName + ", damage=" + damage + ", healthy=" + healthy + ", money="
				+ money + "]";
	}
	
	

}
