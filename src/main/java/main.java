public class main {

    public static void main(String[] args) {
        StopTime ElapsedTime = new StopTime();
        int[] array = new int[100];

        //Tao phan tu cho array
        System.out.println("Creat a random array: ");
        creatRandomArray(array);

        //
        ElapsedTime.start();
        selectionSort(array);
        ElapsedTime.stop();
        System.out.println("\n Elapsed Time for sorting a 100 elements array is: " + ElapsedTime.getElapsedTime() + " nano seconds");


        //
        System.out.println("Array after sorting: ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + "\t");
        }



    }


    public static void creatRandomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  (int) (Math.random()*100);
            System.out.print(arr[i]+"\t");
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
