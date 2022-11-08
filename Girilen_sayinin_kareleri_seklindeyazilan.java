// Girilen pozitif bir tamsayının , iki sayının kareleri toplamı şeklinde yazdırılıp yazdırılamayacağını hesaplayan program
package girilen_sayinin_kareleri_seklindeyazilan;
import java.util.Scanner;
/*
Adım 1: Başla 
Adım 2: Kullanıcıdan bir n değeri al
Adım 3: i 0 'dan girilen sayıya kadar dön 
Adım 4: j 0'dan girilen sayıya kadar dön
Adım 5: Eğer i*i+j*j == girilen sayıya ekrana yazdır 
Adım 6: Bitir.
*/
public class Girilen_sayinin_kareleri_seklindeyazilan {


    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Bir tam sayı giriniz :");
        int girilen = input.nextInt();
        
        for (int i = 0; i<=girilen;i++) {
            
            for (int j=0; j<=girilen;j++) {
                
                if (i*i+j*j == girilen) {
                    System.out.println(i+"-"+j);
                    
                }
                
            }
        }
    }
    
}
