import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password, newPassword;
        String select;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if ((userName.equals("yazılımdili")) && (password.equals("java1234"))) {
            System.out.println("Giriş başarılı");
        }else if ((userName.equals("yazılımdili")) && (!password.equals("java1234"))) {
            System.out.println("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz?");

            System.out.println("1-Evet\n2-Hayır");
            select = (input.nextLine());

            switch (select) {
                case "1":
                    System.out.println("Şifrenizin eski şifreniz ile aynı olmaması gerekir..");
                    System.out.print("Yeni şifreniz: ");
                    newPassword = input.nextLine();

                    if(newPassword.equals(password)){
                        System.out.println("Şifreniz eski şifreniz ile aynı. Tekrar yeni şifre oluşturun.");

                    }else{
                        System.out.println("Şifreniz güncellendi. Yeni şifre ile giriş yapıldı.");
                    }
                    break;
                case "2":
                    System.out.println("Sistemden çıkış sağlandı.");
                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız.");
            }

        }

        else{
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }


    }
}










