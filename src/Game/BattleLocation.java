package Game;

import java.util.Scanner;

public abstract class BattleLocation extends Location{
	protected Obstacle obstacle;
	protected String award;

	public BattleLocation(Player player,String name,Obstacle obstacle,String award) {
		super(player);
		this.name=name;
		this.obstacle=obstacle;
		this.award=award;
	}
	public boolean getLocation()
	{
		
		int obsCount=obstacle.obstacleCount();
		System.out.println("�u anda  "+this.getName()+"'desiniz.");
		System.out.println("Dikkatli ol Burada "+obsCount+" tane "+obstacle.getName()+" Ya��yor");
		System.out.println("<S>ava� veya <K>a�");
		
		String selCase=scan.next();
		selCase=selCase.toUpperCase();
		if(selCase.equals("S"))
		{ 
			if(combat(obsCount))
			{
				System.out.println(this.getName()+" B�lgesindeki t�m d��manlar� temizlediniz..");
				if(player.getInv().isFood()==false&&this.award.equals("Food"))
				{
					player.getInv().setFood(true);
				}
				if(player.getInv().isFirewood()==false&&this.award.equals("Firewood"))
				{
					player.getInv().setFood(true);
				}
				if(player.getInv().isWater()==false&&this.award.equals("Water"))
				{
					player.getInv().setFood(true);
				}
				System.out.println(this.award +"Kazand�n�z");
				return true;
			}
			else
				System.out.println("D��mandan Ka�t�n�z.");
			return true;
			
		}
		else 
		{
			System.out.println("Sava�tan Ka�t�n�z.");
			return true;
			
		}
		
		
		
	
	}
	public boolean combat(int obsCount)
	{
	
		for (int i = 0; i <obsCount; i++) {
			
			int defObsHealt=obstacle.getHealthy();
			playerStat();
			System.out.println("-----------");
			obstacleStat();
			
		
			
			while(player.getHealthy()>0 && obstacle.getHealthy()>0)
			{
				System.out.println("<V>ur veya <K>a� :");
				Scanner scan=new Scanner(System.in);
				String selCase=scan.nextLine();
				selCase=selCase.toLowerCase();
				if(selCase.equals("v"))
				{
					System.out.println("Siz vurdunuz.");
					obstacle.setHealthy(obstacle.getHealthy()-player.getTotalDamage());
				 
					System.out.println(obstacle.toString());
				
					if(obstacle.getHealthy()>0)
					{
					System.out.println("Canavar vurdu");
					player.setHealthy(player.getHealthy()-(obstacle.getDamage()-player.getInv().getArmor()));
					System.out.println(player.toString());
					}
				
				}
				else if(selCase.equals("k"))
				{
					return false;
				}
				else
					System.out.println("Hatal� tu�lama");
			}
			if(obstacle.getHealthy()<=0&&player.getHealthy()>0)
			{
				System.out.println(i+1+"Tane"+obstacle.getName()+"�ld�rd�n�z");
				
				System.out.println("D��man� yendiniz");
				player.setMoney(player.getMoney()+obstacle.getAward());
				System.out.println("G�ncel paran�z:"+player.getMoney());
				obstacle.setHealthy(defObsHealt);
			}
			else
				return false;
			
			
		}
		
		return true;
	}
	public void playerStat()
	{
		System.out.println("Oyuncu De�erleri=");
		System.out.println("Can :"+player.getHealthy());
		System.out.println("Damaage :"+player.getDamage());
		System.out.println("Para :"+player.getMoney());
		if(player.getInv().getDamage()>0)
		{
			System.out.println("Weapon Name  :"+player.getInv().getwName());
			System.out.println(player.getInv().getDamage());
		}
		if(player.getInv().getArmor()>0)
		{
			System.out.println("Armor Name :"+player.getInv().getaName());
			System.out.println("Engellenen Hasar :"+player.getInv().getArmor());
			
		}
	}
	public void obstacleStat()
	{
		System.out.println(obstacle.getName()+"'nin De�erleri=");
		System.out.println("Hasar� :"+obstacle.getDamage());
		System.out.println("Sa�l��� :"+obstacle.getHealthy());
		System.out.println("Max Say�s� :"+obstacle.getMaxNumber());
		System.out.println("Engellenen Hasar� :"+obstacle.getAward());
	}
	
	

}
