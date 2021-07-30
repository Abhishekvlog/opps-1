import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = {{11,22,33},{10,20,30},{40,50,60}};

        for(int i=2 ; i>=0;i--){
            for(int j =2;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int sum =0;
        int[] arr2 = {1,2,3,4,5};
        for(int i=0;i<arr2.length;i++){
            sum = sum+arr2[i];
            i++;
        }
        System.out.println("Sum = " +sum);

        int n = s.nextInt();
        int[][] arr3 = new int[n][n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr3[i][j]=s.nextInt();
                arrayList.add(arr3[i][j]);
            }
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arrayList.size();i++){
            int key = arrayList.get(i);
            if(hashMap.containsKey(key)){
                int freq = arrayList.get(i);
                freq++;
                hashMap.put(key,freq);
            }else {
                hashMap.put(key,1);
            }
        }
        for(Map.Entry<Integer, Integer> val : hashMap.entrySet()){
            if(val.getValue() > 1){
                System.out.print(val.getKey()+"");
            }
        }
    }
}
