public class mukemmelSayi {
    
    public static void main(String [] args)
    {
        //kendisi haric ,kendi bolenlerinin toplamına bölünen sayiya denir
        //Hocanın yapyıgı cozum
        int number =28;
        int total= 0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                total=total+i;
            }
        }
        if(total==number)
        {
            System.out.println("Mükemmel sayıdır");
        }
        else{
            System.out.println("Mükemmel sayı değildir");
        }
                //benim yaptıgım
                // int sayi=27;
                // int toplam=0;
                // boolean perfect=false;
                // for(int i=1;i<sayi;i++)
                // {
                //     if(sayi%i==0)
                //     {
                //          toplam=toplam+i;
                //         if(toplam%sayi==0)
                //         {
                //             perfect=true;
                //         }
                //     }
                    
                // }
                // if(perfect==true){
                // System.out.println("Mükemmel sayıdır");}
                // else{
                //     System.out.println("Mükemmel sayı değildir");
                // }        

    }
    
}

