import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah = nilai;
            }

            if (nilai >= 60 && nilai <= 100) {
                lulus++;
            }
            
            if(nilai < 60 && nilai > 0){
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Total mahasiswa yang lulus: " + lulus);
        System.out.println("Total mahasiswa yang tidak lulus: " + tidakLulus);
    }
}