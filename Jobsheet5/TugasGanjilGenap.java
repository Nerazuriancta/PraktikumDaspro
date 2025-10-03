import java.util.Scanner;
public class TugasGanjilGenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan angka: ");
        int number = sc.nextInt();

        if (number %2 == 0) { //modulus (sisa bagi)
            System.out.println(number + " adalah bilangan genap");
        } else {
            System.out.println(number + " adalah bilangan ganjil");
        }

    }
} 
