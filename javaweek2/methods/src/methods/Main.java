package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulamaca();
	}

	public static void sayiBulamaca()
	{
		int [] sayilar= {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		for (int sayi : sayilar) {
			if(sayi==aranacak)
			{
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if(varMi==true)
		{
			mesaj="Sayı Bulundu:" +aranacak;
			mesajVer(mesaj);
		}
		else 
		{
			mesajVer("Sayı Bulunamadı:" +aranacak);
		}
	}
	
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);	
	}
	
}
