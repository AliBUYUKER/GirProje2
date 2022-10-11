package Gun01;

public class Merhaba {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Merhaba();
            System.out.print(i);
            System.out.println();
        }int sayac=0;
        do {

            Merhaba();
            System.out.print(sayac);
            sayac++;
        }while (sayac<5);

    }

    public static void Merhaba(){
        System.out.print(" Merhaba ");
    }
}
