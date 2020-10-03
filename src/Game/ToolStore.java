package Game;

import java.util.Scanner;

public class ToolStore extends NormalLocation {

	public ToolStore(Player player) {
		super(player, "Ma�aza");
		// TODO Auto-generated constructor stub
	}

	public boolean getLocation() {
		System.out.println("Para :" + player.getMoney());
		System.out.println("1-Silahlar");
		System.out.println("2-Z�rhlar");
		System.out.println("3-��k��");
		int selTool = scan.nextInt();
		int selItemId;
		switch (selTool) {
		case 1: {

			selItemId = weaponMenu();
			buyWeapon(selItemId);
			break;
		
		}
		case 2:{
			
		selItemId=armorMenu();
		buyArmorMenu(selItemId);
			
		}
		default:
		break;
		}
        return true;
	}
	public int armorMenu()
	{     
		System.out.println("1-Hafif <Engelleme :1 Para :15>");
		System.out.println("2- Orta <Engelleme :3 Para :25>");
		System.out.println("3-A��r <Engelleme :5 Para :50>");
		System.out.println("4-��k��");
		System.out.println("Bir z�rh se�iniz");
		return scan.nextInt();
		
	}
	public void buyArmorMenu(int selItemId)
	{
		String aName=null;
		int price=0;
		int avoid=0;
		switch (selItemId) {
		case 1: {
			aName="Hafif";
			price=15;
			avoid=1;
			break;
			
		}
		case 2: {
			aName="Orta";
			price=25;
			avoid=3;
			break;
			
		}
		case 3: {
			aName="A��r";
			price=50;
			avoid=5;
			break;
			
		}
		case 4:{
			System.out.println("��k�� Yap�l�yor");
			break;
		}
		
		default:
			System.out.println("Ge�ersiz �slem");
		}
		
		if(price>0)
		{
			if(player.getMoney()>=price) {
			player.setMoney(player.getMoney()-price);
			player.getInv().setArmor(avoid);
			player.getInv().setaName(aName);
			
			System.out.println(aName+"  Sat�n Ald�n�z.");
			System.out.println("Engellenen Hasar  :"+player.getInv().getArmor());
			System.out.println("Kalan Para : "+player.getMoney());
			}
			else
				System.out.println("Yetersiz Bakiye");
		}
		
	}
	public int weaponMenu() {
		System.out.println("1-Tabanca <Para :5 Hasar :2>");
		System.out.println("2-K�l�� <Para :35 Hasar :3>");
		System.out.println("3-T�fek <Para :45 Hasar :7>");
		System.out.println("4-��k��");
		System.out.println("Silah se�iniz");
		int selWeapon = scan.nextInt();

		return selWeapon;

	}

	public void buyWeapon(int itemId) {
		int damage = 0;
		int price = 0;
		String wName = null;

	
		switch (itemId) {
		case 1: {

			damage = 2;
			price = 5;
			wName = "Tabanca";
			break;
		}
		case 2: {

			damage = 3;
			price = 35;
			wName = "K�l��";
			break;
		}
		case 3: {

			damage = 7;
			price = 45;
			wName = "T�fek";
			break;
		}
		case 4:{
			System.out.println("��k�� yap�l�yor");
			break;
		}
		default:
			System.out.println("Ge�ersiz �slem");
			break;

		
		}
		if(price>0)
		{
			if(player.getMoney()>price) {
			player.getInv().setwName(wName);
			player.getInv().setDamage(damage);
			player.setMoney(player.getMoney()-price);
			System.out.println(wName+" Sat�n Ald�n�z");
			System.out.print("Toplam Hasar :");
			player.getTotalDamage();
			System.out.println("Kalan para :"+player.getMoney());
			}
		}
		if(player.getMoney()<price)
		{
			System.out.println("Yetersiz bakiye..");
		}
		
	
		

		

	}

}
