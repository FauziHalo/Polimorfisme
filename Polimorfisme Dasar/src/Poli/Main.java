package Poli;

public class Main {
    public static void main(String[] argv) {
        Pegawai p = new Pegawai();
        p = new Programmer(); 
        p = new Manajer();
        //Manajer m = new Programmer(); tdk bisa krn programmer bkn subklas manager
    }
}