package pemlan.tugas2;
public class MAINlari {
    public static void main(String[] args) {
     lari m1 = new lari ("Aan" , "155150" , 3 , 5 );
     lari m2 = new lari ("Tristiaratri" , "155151" , 7 , 6 );
     lari m3 = new lari ("Anandhi" , "155153" , 5 , 4 );
     m1.hitunglari();
     m2.hitunglari();
     m3.hitunglari();
        double terbesar=m1.hitunglari();
        String namat = m1.Nama;
        if(m2.hitunglari()>terbesar){
            terbesar=m2.hitunglari();
        namat=m2.Nama;
        }
        else if(m3.hitunglari()>terbesar){
            terbesar=m3.hitunglari();
            namat=m3.Nama;
        }
        m1.display();
        m2.display();
        m3.display();
        System.out.println("Tercepat "+namat);
        System.out.println(terbesar + "m/s");
        
    }
}
