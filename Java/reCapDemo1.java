public class reCapDemo1 {
    public static void main(String [] args)
    {
        int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        int enBuyuk=sayi1;
        if(enBuyuk<sayi2)
        {
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3)
        {
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayi : " + enBuyuk);

        /*burası benim yaptığım algoritma
        int sonuc;
        if(sayi1>sayi2 && sayi1>sayi3)
        {
            sonuc=sayi1;
            System.out.println("en büyük sayi : "+sonuc);
        }
        else if(sayi2>sayi1 && sayi2>sayi3)
        {
            sonuc=sayi2;
            System.out.println("en büyük sayi : "+sonuc);
        }
        else{
            
            System.out.println("sayılar eşit ");
        }*/
    }
}
