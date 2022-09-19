public class miniProjeAsalSayi {
    public static void main(String [] args)
    {
        int sayi=-2;
        boolean asal=true;
        if(sayi==1){
        System.out.println("Sayı asal değil");
            return;
        }
        if(sayi<1)
        {
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }
        for(int i=2;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                asal=false;
            }
            else{
                asal=true;
            }
        }
        if(asal)
        {System.out.println("Asal");}
        else{
            System.out.println("Asal değil");
        }
      
    }

    }
    

