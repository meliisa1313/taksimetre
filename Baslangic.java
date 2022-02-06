package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int acilisUcreti=10;
       double kmFiyati=2.20;
       double km;
       double ucret;
       Scanner input=new Scanner(System.in);
        System.out.println("kac km gittiniz ");
        km=input.nextDouble();
        ucret=(km*kmFiyati)+acilisUcreti;
        if (ucret<=20){
            ucret=20;
            System.out.println(ucret);
        }
        else{
            System.out.println(ucret);
        }



        }






    }

