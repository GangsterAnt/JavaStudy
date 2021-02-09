package baekJoon;

import java.util.Scanner;

public class P1978 {


    public static void primechecker(boolean[] arr){
       arr[0] = arr[1] = false;
       for(int i = 2; i< 1001; ++i)
           arr[i] = true;

       for(int i=2; i< 1001;++i) {
           if( arr[i]){
               int j = 2;
               while( i* j <=1000){
                   arr[i*j] = false;
                    j++;
               }
           }
       }
    }

    public static void main(String[] args) {

        boolean[] arr = new boolean[1001];
        primechecker(arr);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        int tmp;

        for(int i=0; i<n;++i){
            tmp = sc.nextInt();
            if( arr[tmp])
                ans++;
        }
        System.out.println(ans);
    }
}
