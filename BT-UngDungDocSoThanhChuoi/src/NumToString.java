import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();


        System.out.printf("%-20s%s","NUMBER","STRING\n");
        if (num < 10 && num >= 0) {
            String string = switch (num) {
                case 0 -> "zero";
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "";
            };
            System.out.printf("%-20d%s", num, string);
        } else if (num < 20) {
            String string = "";
            int ones = num % 10;
            switch (ones) {
                case 0 -> string = "ten";
                case 1 -> string = "eleven";
                case 2 -> string = "twelve";
                case 3 -> string = "thirteen";
                case 4 -> string = "fourteen";
                case 5 -> string = "fifteen";
                case 6 -> string = "sixteen";
                case 7 -> string = "seventeen";
                case 8 -> string = "eighteen";
                case 9 -> string = "nineteen";
            }
            System.out.printf("%-20d%s", num, string);
        } else if (num < 100) {
            String string_ones = "";
            String string_tens = "";
            int ones = num % 10;
            int tens= num / 10;
            switch (ones) {
                case 0 -> string_ones = "";
                case 1 -> string_ones = "-one";
                case 2 -> string_ones = "-two";
                case 3 -> string_ones = "-three";
                case 4 -> string_ones = "-four";
                case 5 -> string_ones = "-five";
                case 6 -> string_ones = "-six";
                case 7 -> string_ones = "-seven";
                case 8 -> string_ones = "-eight";
                case 9 -> string_ones = "-nine";
            }
            switch (tens) {
                case 2 -> string_tens = "twenty";
                case 3 -> string_tens = "thirty";
                case 4 -> string_tens = "forty";
                case 5 -> string_tens = "fifty";
                case 6 -> string_tens = "sixty";
                case 7 -> string_tens = "seventy";
                case 8 -> string_tens = "eighty";
                case 9 -> string_tens = "ninety";
            }
            String string=string_tens+string_ones;
            System.out.printf("%-20d%s", num, string);
        } else if(num<1000){
            String string_ones = "";
            String string_tens = "";
            String string_hundres="";
            int hundres=num/100;
            int surplus=num%100;
            int tens=surplus/10;
            int ones=surplus%10;
            if (surplus<10||surplus>=20) {
                switch (ones) {
                    case 0 -> string_ones = "";
                    case 1 -> string_ones = " one";
                    case 2 -> string_ones = " two";
                    case 3 -> string_ones = " three";
                    case 4 -> string_ones = " four";
                    case 5 -> string_ones = " five";
                    case 6 -> string_ones = " six";
                    case 7 -> string_ones = " seven";
                    case 8 -> string_ones = " eight";
                    case 9 -> string_ones = " nine";
                }
            } else {
                string_ones = switch (ones) {
                    case 0 -> " ten";
                    case 1 -> " eleven";
                    case 2 -> " twelve";
                    case 3 -> " thirteen";
                    case 4 -> " fourteen";
                    case 5 -> " fifteen";
                    case 6 -> " sixteen";
                    case 7 -> " seventeen";
                    case 8 -> " eighteen";
                    case 9 -> " nineteen";
                    default -> string_ones;
                };
            }
            switch (tens) {
                case 0 -> string_tens = "and";
                case 2 -> string_tens = "and twenty";
                case 3 -> string_tens = "and thirty";
                case 4 -> string_tens = "and forty";
                case 5 -> string_tens = "and fifty";
                case 6 -> string_tens = "and sixty";
                case 7 -> string_tens = "and seventy";
                case 8 -> string_tens = "and eighty";
                case 9 -> string_tens = "and ninety";
            }
            switch (hundres) {
                case 1 -> string_hundres = "one hundres ";
                case 2 -> string_hundres = "two hundres ";
                case 3 -> string_hundres = "three hundres ";
                case 4 -> string_hundres = "four hundres ";
                case 5 -> string_hundres = "five hundres ";
                case 6 -> string_hundres = "six hundres ";
                case 7 -> string_hundres = "seven hundres ";
                case 8 -> string_hundres = "eight hundres ";
                case 9 -> string_hundres = "nine hundres ";
            }

            if (tens==0 && ones==0){
                string_tens="";
            }
            String string=string_hundres+string_tens+string_ones;
            System.out.printf("%-20d%s", num, string);
        }
    }
}
