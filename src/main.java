import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        //Switch-case yapisi kullanilmadan yapilmasi istenmektedir.

        int ay, gun;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kacinci ayda dogdunuz ? (sayi olarak girinizi) =  ");

        ay = inp.nextInt();

        if(ay<=0 || ay>12){
            System.out.println("Gecersiz ay girdiniz");
        }

        System.out.println("Ayin kacinda dogdunuz ? = ");

        gun = inp.nextInt();

        if(gun<=0 || gun>31){
            System.out.println("Gecersiz gun girdiniz");
        }


        if(ay == 1){
            if(gun>=1 && gun<=21){
                System.out.println("Oglak burcu 22 Aralik - 21 Ocak");
            }else{
                System.out.println("Kova burcu 22 Ocak - 19 Subat");
            }

        }else if(ay == 2 ){
            if(gun>=1 && gun<=19){
                System.out.println("Kova burcu 22 Ocak - 19 Subat");
            }else{
                System.out.println("Balik burcu 20 Subat - 20 Mart");
            }
        }else if(ay == 3 ){
            if(gun>=1 && gun<=20){
                System.out.println("Balik burcu 20 Subat - 20 Mart");
            }else{
                System.out.println("Koc burcu 21 Mart - 20 Nisan");
            }
        }else if(ay == 4 ){
            if(gun>=1 && gun<=20){
                System.out.println("Koc burcu 21 Mart - 20 Nisan");
            }else{
                System.out.println("Boga burcu 21 Nisan - 21 Mayis");
            }
        }else if(ay == 5 ){
            if(gun>=1 && gun<=21){
                System.out.println("Boga burcu 21 Nisan - 21 Mayis");
            }else{
                System.out.println("Ikizler burcu 22 Mayis - 22 Haziran");
            }
        }else if(ay == 6 ){
            if(gun>=1 && gun<=22){
                System.out.println("Ikizler burcu 22 Mayis - 22 Haziran");
            }else{
                System.out.println("Yengec burcu 23 Haziran - 22 Temmuz");
            }
        }else if(ay == 7 ){
            if(gun>=1 && gun<=22){
                System.out.println("Yengec burcu 23 Haziran - 22 Temmuz");
            }else{
                System.out.println("Aslan burcu 23 Temmuz - 22 Agustos");
            }
        }else if(ay == 8 ){
            if(gun>=1 && gun<=22){
                System.out.println("Aslan burcu 23 Temmuz - 22 Agustos");
            }else{
                System.out.println("Basak burcu 23 Agustos - 22 Eylul");
            }
        }else if(ay == 9 ){
            if(gun>=1 && gun<=22){
                System.out.println("Basak burcu 23 Agustos - 22 Eylul");
            }else{
                System.out.println("Terazi burcu 23 Eylul - 22 Ekim");
            }
        }else if(ay == 10 ){
            if(gun>=1 && gun<=22){
                System.out.println("Terazi burcu 23 Eylul - 22 Ekim");
            }else{
                System.out.println("Akrep burcu 23 Ekim - 21 Kasim");
            }
        }else if(ay == 11 ){
            if(gun>=1 && gun<=21){
                System.out.println("Akrep burcu 23 Ekim - 21 Kasim");
            }else{
                System.out.println("Yay burcu 22 Kasim - 21 Aralik");
            }
        }else if(ay == 12 ){
            if(gun>=1 && gun<=21){
                System.out.println("Yay burcu 22 Kasim - 21 Aralik");
            }else{
                System.out.println("Oglak burcu 22 Aralik - 21 Ocak");
            }
        }



    }
}
