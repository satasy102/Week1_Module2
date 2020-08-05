public class SelectionSort {
    public static void main(String[] args) {
        
        StopWatch stopWatch=new StopWatch();

        int[] arr=new int[100000];

        for(int i=0; i< arr.length; i++) arr[i] = (int) Math.round(Math.random() * 1000);
//        System.out.println("Array dau: "+Arrays.toString(arr)+" ");

        int indexMin, i, j;

        stopWatch.start();

        System.out.println("Thuat toan dang duoc thuc thi...");
        for (i = 0; i < arr.length - 1; i++) {
            indexMin = i;

            for (j = i + 1; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }

        }
//        System.out.println("Array sau: "+Arrays.toString(arr)+" ");

        stopWatch.stop();

        stopWatch.getElapsedTime();

    }
}

