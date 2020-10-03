package Game;

import java.util.Random;

public class Obstacle {
	
	private String name;
	private int damage;
	private int healthy;
	private int maxNumber;
	@Override
	public String toString() {
		return "Obstacle [name=" + name + ", damage=" + damage + ", healthy=" + healthy + ", maxNumber=" + maxNumber
				+ ", award=" + award + "]";
	}
	private int  award;
	
	
	
	
	public Obstacle(String name, int damage, int healthy,int award ,int maxNumber) {
		super();
		this.name = name;
		this.damage = damage;
		this.healthy = healthy;
		this.maxNumber = maxNumber;
		this.award = award;
	}
	
	public int obstacleCount()
	{ 

		Random rnd=new Random();
	    return  rnd.nextInt(this.maxNumber)+1;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public int getAward() {
		return award;
	}
	public void setAward(int award) {
		this.award = award;
	}
	

}
