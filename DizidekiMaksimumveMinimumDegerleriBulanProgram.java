import java.util.Scanner;

public class DizidekiMaksimumveMinimumDegerleriBulanProgram {
    public static void main(String[] args) {
        /*
        int[] arr = {56, 34, 1, 8, 101, -2, -33};

        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Dizide ki mininumum deger : " + min);
        System.out.println("Dizide ki maximum deger : " + max);
         */


        /*
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        */


        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int number = input.nextInt();

        int min = dizi[0];
        int max = dizi[0];
        for (int i : dizi) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for(int j : dizi){
            if(j>number){
                if(j<=max){
                    max=j;
                }
            }
            if(j<number){
                if(j>=min){
                    min=j;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);


    }
}
