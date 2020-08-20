public class PrintPrimesSmaller100 {
    public static void main(String[] args) {
        boolean check=true;

        for(int i=2;i<100;i++){
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    check=false;
                    break;
                }
                check = true;
            }
            if(check) System.out.printf("%d ",i);
        }
    }
}
