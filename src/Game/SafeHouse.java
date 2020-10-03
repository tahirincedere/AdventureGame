package Game;

public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player) {
		super(player,"Güvenli Ev");
		// TODO Auto-generated constructor stub
	}
	public boolean getLocation()
	{
		player.setHealthy(player.getrHealthy());
		System.out.println("Canýnýz doldu.");
		System.out.println("Þuan güvenli evdesiniz");
		return true;
		
	}
	

}
