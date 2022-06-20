import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ведите два цыфра: римские или арабские: от 1 до 10 или от I до X");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = calc(line);
        System.out.println(result);
    }

    static String calc(String line) throws Exception {
        String[] rom = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
                "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV",
                "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
                "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
                "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII",
                "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
                "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
                "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"};
        String[] x = line.split(" ");
        String num1 = x[0];   //наша первая римская или арабская цыфра
        String op = x[1];    //операция (+, -, *, /)
        String num2 = x[2];  //наша вторая римская или арабская цыфра
        int a = x.length;
        String result = null;
        if (a > 3) {
            throw new Exception();
        }
        //проверим введенные строки (num1, num2) римские?
        List<String> romList = new ArrayList<>(Arrays.asList(rom));

        if (romList.contains(num1) &&
                romList.contains(num2)) {
            //получим индекс
            int n1 = romList.indexOf(num1) + 1;
            int n2 = romList.indexOf(num2) + 1;
            if (n1 < 1 || n1 > 10 || n2 < 1 || n2 > 10) {
                throw new Exception();
            }
            switch (op) {
                case "+":
                    int c = n1 + n2;
                    result = rom[c - 1];
                    break;
                case "-":
                    c = n1 - n2;
                    result = rom[c - 1];
                    break;
                case "/":
                    c = n1 / n2;
                    result = rom[c - 1];
                    break;
                case "*":
                    c = n1 + n2;
                    result = rom[c - 1];
                    break;
            }

        } else {
            int n1 = Integer.parseInt(num1.trim());
            int n2 = Integer.parseInt(num2.trim());
            if (n1 < 1 || n1 > 10 || n2 < 1 || n2 > 10) {
                throw new Exception();
            }
            switch (op) {
                case "+":
                    int c = n1 + n2;
                    result = String.valueOf(c);
                    break;
                case "-":
                    c = n1 - n2;
                    result = String.valueOf(c);
                    break;
                case "/":
                    c = n1 / n2;
                    result = String.valueOf(c);
                    break;
                case "*":
                    c = n1 + n2;
                    result = String.valueOf(c);
                    break;

            }


        }

        return result;
    }
}