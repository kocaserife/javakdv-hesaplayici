import java.util.Scanner;

public class uygulama {
    public static void main(String[] args) {
      double a,oran;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        System.out.println("girdiğiniz sayı: "+a);
        oran = 0.18;

        double kdvlitutar= a*oran ;
        double sonuc = kdvlitutar+a;
        System.out.println("kdvli tutarınız : "+ sonuc);

    }
}
