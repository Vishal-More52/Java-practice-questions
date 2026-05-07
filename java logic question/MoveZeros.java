public class MoveZeros {
    public static void moveZerosToEnd(int[] arr){
        int insertPos = 0;

        //Shift non - zero elemnts to the front
        for (int num: arr){
            if(num != 0){
                arr[insertPos++] = num;

            }
        }
        //fill remaining positions with zeros
        while (insertPos < arr.length){
            arr[insertPos++] = 0;

        }
    }

    public static void main(String[] args) {
        int[] data = {0,1,0,3,12};
        moveZerosToEnd(data);

        for (int i : data) System.out.print(i + " ");
    }
}
