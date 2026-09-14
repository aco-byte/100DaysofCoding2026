import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca 9 variabel dengan tipe data berbeda
        String varString = input.next();
        byte varByte = input.nextByte();
        short varShort = input.nextShort();
        int varInt = input.nextInt();
        long varLong = input.nextLong();
        float varFloat = input.nextFloat();
        double varDouble = input.nextDouble();
        char varChar = input.next().charAt(0);
        boolean varBoolean = input.nextBoolean();

        // Output mengaplikasikan format desimal lokal (koma)
        String strFloat = String.format("%.2f", varFloat);
        String strDouble = String.format("%.3f", varDouble);

        // Output dengan println()
        System.out.println("=== PRINTLN ===");
        System.out.println(varString);
        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(strFloat);
        System.out.println(strDouble);
        System.out.println(varChar);
        System.out.println(varBoolean);
        System.out.println();

        // Output dengan print()
        System.out.println("=== PRINT ===");
        System.print(varString + "\n");
        System.print(varByte + "\n");
        System.print(varShort + "\n");
        System.print(varInt + "\n");
        System.print(varLong + "\n");
        System.print(strFloat + "\n");
        System.print(strDouble + "\n");
        System.print(varChar + "\n");
        System.print(varBoolean + "\n");
        System.out.println();

        // Output dengan printf()
        System.out.printf("=== PRINTF ===\n");
        System.out.printf("%s\n", varString);
        System.out.printf("%d\n", varByte);
        System.out.printf("%d\n", varShort);
        System.out.printf("%d\n", varInt);
        System.out.printf("%d\n", varLong);
        System.out.printf("%.2f\n", varFloat);
        System.out.printf("%.3f\n", varDouble);
        System.out.printf("%c\n", varChar);
        System.out.printf("%b\n", varBoolean);

        input.close();
    }
}
