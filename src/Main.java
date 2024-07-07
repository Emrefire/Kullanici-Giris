import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           String userName,password,sorgu,password2;
           Scanner input = new Scanner(System.in);
           System.out.print("Kullanıcı Adınız: ");
           userName = input.nextLine();
           System.out.print("Şifreniz: ");
           password = input.nextLine();

           if(userName.equals("Emre") && password.equals("Emre123")){
               System.out.println("Hoşgeldiniz!");
           }
           else{
               System.out.println("Yanlış Giriş Yaptınız");
               if(userName.equals("Emre") != password.equals("Emre123")) {
                   System.out.println("Şifrenizi sıfırlamak istiyor musunuz? Evet mi Hayır mı?");
                   sorgu= input.nextLine();
                   if(sorgu.equals("Evet")) {
                       System.out.print("Yeni Şifrenizi giriniz:");
                       password2 = input.nextLine();
                       if(password2.equals("Emre123")){
                           System.out.println("Şifre Oluşturulamadı, lütfen başka şifre giriniz: ");
                       }
                       else{
                           System.out.println("Şifre Oluşturuldu");
                           System.out.print("Kullanıcı Adınız: ");
                           userName = input.nextLine();
                           System.out.print("Şifreniz: ");
                           password2 = input.nextLine();
                           System.out.println("Hoşgeldiniz!");
                       }
                   }
                   else if(sorgu.equals("Hayır")){
                       System.out.print("Tekrar Şifrenizi Giriniz: ");
                       password2 = input.nextLine();
                       if(password2.equals("Emre123")){
                           System.out.println("Tebrikler Şifreniz Doğrudur. Hoşgeldiniz!");
                       }
                       else{
                           System.out.print("Şifreniz Yanlış Tekrar Şifrenizi Giriniz: ");
                           password2 = input.nextLine();
                           if(password2.equals("Emre123")){
                               System.out.println("Tebrikler Şifreniz Doğrudur. Hoşgeldiniz!");
                           }
                       }
                   }
               }
           }


    }
}