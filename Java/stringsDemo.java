public class stringsDemo {
    public static void main(String[] args) 
    {
        String mesaj="Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı : "+mesaj.length());
        System.out.println("5.eleman : "+ mesaj.charAt(4)); 
        System.out.println(mesaj.concat(" Yaşasın !")); //birleştirmek için kullanılır
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5)); //2. elemandan başlayıp 5.elemana kadar alıyor
        for(String kelime:mesaj.split(" ")){
        System.out.println(kelime);
         }
         System.out.println(mesaj.toLowerCase());
         System.out.println(mesaj.toUpperCase());
         System.out.println(mesaj.trim()); //trim() kelimenin başındaki ve sonundaki boşlukları atar.

    }
    
}
