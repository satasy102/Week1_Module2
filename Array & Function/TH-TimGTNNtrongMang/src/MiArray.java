public class MiArray {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, -9, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array){
        int min=array[0];
        byte index=0;
        for(byte i=1;i<array.length;i++){
            if(min>array[i]) {
                min=array[i];
                index= i;
            }
        }
        return index;
    }
}
