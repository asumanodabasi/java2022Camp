public class java2022 {
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
String ortaMetin="İlginizi Çekebilir";
String altMetin="Vade Farkı";
System.out.println(ortaMetin);
System.out.println(altMetin);
 double dolarBugun=18.5;
double dolarDun=18.72;
String okYonu="";
if(dolarBugun<dolarDun){
    okYonu="down.svg";
    System.out.println(okYonu);
}
else if(dolarBugun>dolarDun)
{
    okYonu="up.svg";
    System.out.println(okYonu);
}
else{
    okYonu="equal.svg";
    System.out.println(okYonu);
}

String[] krediler={"Ev Kredisi","Emekli Kredisi","İhtiyaç Kredisi","Araba Kredisi","Tüketici Kredisi"};
for(int i=0; i<krediler.length;i++)
{
    System.out.println(krediler[i]);
}
    }
    
}
