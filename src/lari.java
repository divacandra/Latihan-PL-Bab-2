package pemlan.tugas2;
public class lari { //class
    String Nama, NIM ;
    double tercepat, Waktu, Jarak, Jumlah ;
    public lari(String Nama, String Nim, double Jumlah, double Waktu){//objek
        this.Nama = Nama ;//atribut
        this.NIM = Nim ;//atribut
        this.Jumlah = Jumlah ;//atribut
        this.Waktu = Waktu ; //atribut
}
    public void display(){//method
        System.out.println("Nama            : "+ Nama);
        System.out.println("NIM             : "+ NIM);
        System.out.println("Jumlah Putaran  : "+ Jumlah);
        System.out.println("Waktu           : "+ Waktu);
        System.out.println("Jarak           : "+ Jarak);
    }
    public double hitunglari(){//method
        Jarak = Jumlah * 240 ;
        tercepat = Jarak/Waktu ;
        return tercepat;
    }
}

