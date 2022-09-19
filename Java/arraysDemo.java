public class arraysDemo {
    public static void main(String [] args)
    {
        String[] ogrenciler=new String[5];
        ogrenciler[0]="ASUMAN";
        ogrenciler[1]="Engin";
        ogrenciler[2]="Derin";
        ogrenciler[3]="Salih";
        ogrenciler[4]="Ahmet";
        
        for(int i=0; i<ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler)  //for dongusunu boyle de yazabiliriz.
        {
            System.out.println(ogrenci);

        }

    }
}
