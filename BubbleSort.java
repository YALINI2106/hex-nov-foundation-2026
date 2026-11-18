import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        System.out.println("Give input to the array to be sorted (enter -1 to stop) : ");

        while(true){
            int num = sc.nextInt();
            if(num == -1){
                break;
            }

            arr.add(num);
        }


        for(int i = 1 ; i < arr.size() ; i++){
            for(int j = 0 ; j < arr.size() - 1; j ++){
                if(arr.get(j) > arr.get(j+1)){
                    Collections.swap(arr, j , j+1);
                }

            }
            System.out.println(arr);
        }
        System.out.println("Sorted Array :");
        System.out.println(arr);


    }
}
