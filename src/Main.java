import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*\
    */
   double taksimetre=2.20;
   Scanner scanner=new Scanner(System.in);
   System.out.println("Kilometre yi yazınız:");
   double kilometre= scanner.nextDouble();
   double artımiktar=kilometre*taksimetre;
   double tutar=10+artımiktar;
   boolean gecer=artımiktar>10;
   double miktar = gecer ? tutar:20;
   System.out.println("Taksi tutarı:"+miktar+"TL");

             }
}