public class Display20Primes {
    public static void main(String[] args) {
        int count=0;
        int num;
        boolean check=true;

            for (num = 2; num < 1000; num++) {

                for (int i = 2; i < num; i++) {
                    if (num%i==0) {
                        check=false;
                        break;
                    }
                    check=true;
                }

                if (check) {
                    System.out.printf("%d ",num);
                    count++;
                }

                if(count>20){
                    break;
                }
            }
        }
    }
