package Game;

public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player) {
		super(player,"G�venli Ev");
		// TODO Auto-generated constructor stub
	}
	public boolean getLocation()
	{
		player.setHealthy(player.getrHealthy());
		System.out.println("Can�n�z doldu.");
		System.out.println("�uan g�venli evdesiniz");
		return true;
		
	}
	

}
