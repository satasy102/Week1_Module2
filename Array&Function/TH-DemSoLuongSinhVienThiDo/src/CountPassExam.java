import java.util.Scanner;

public class CountPassExam {
    public static void main(String[] args) {
        int i = 0;
        byte size= checksize();

        int[] mark=inputMark(size,i);

        display(mark);
        int count= countPass(mark);

        System.out.print("\nThe number of students passing the exam is " + count);

    }

    public  static byte checksize(){
        Scanner scanner = new Scanner(System.in);
        byte size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextByte();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        return size;
    }

    public  static int[] inputMark(int size, int i){

        int[] ar=new int[size];

        Scanner scanner = new Scanner(System.in);

        while (i < size) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            ar[i] = scanner.nextInt();
            while (ar[i]>10 || ar[i]<0){
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                ar[i] = scanner.nextInt();
            }
            i++;
        }

        return ar;
    }

    public  static void display(int[] ar){

        System.out.print("List of mark: ");
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }

    public  static int countPass(int[] ar){
        int count = 0;

        for (int i : ar) {
            if (i >= 5 && i <= 10)
                count++;
        }
        return count;
    }
}
