public class sayiBulma {
    public static void main(String [] args){
        int [] sayilar=new int [] {1,2,5,7,9,0};
        int aranacak =4;
        boolean durum=false;
        for(int sayi:sayilar)
        {
            if(sayi==aranacak)
            {
                durum=true;
                break;
            }
        }
        if(durum==true){
            System.out.println("Bulundu");
    }
    else{
        System.out.println("Bulunamadı");
    }
}
}