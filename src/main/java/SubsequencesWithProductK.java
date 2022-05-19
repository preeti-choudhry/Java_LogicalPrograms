package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequencesWithProductK {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int param=8;
        System.out.println("Input: "+ Arrays.toString(arr));
        System.out.println("Output: List of ALL the subsequences with product less than "+ param +" "+ subseqWithProductK(arr,param));
    }

    public static List subseqWithProductK(int[] arr, int k){
        List all_subseq_list= new ArrayList();
        int len=arr.length-1;
        for(int i=0;i<=len;i++) {
            List subseq_list= new ArrayList();
            int subseq_product=1;
            subseq_product = subseq_product * arr[i];
            subseq_list.add(arr[i]);
            for(int j=i+1;j<=len;j++) {
                if(subseq_product * arr[j]<k)
                    subseq_product = subseq_product * arr[j];
                else break;

                subseq_list.add(arr[j]);
            }
            System.out.println("Subsequence found with product less than "+ k + ": " +subseq_list);
            all_subseq_list.add(subseq_list);
        }

        for(int x=0;x<=len;x++) {
            List eachElement_list = new ArrayList();
            eachElement_list.add(arr[x]);
            if (arr[x] < 8 && !all_subseq_list.contains(eachElement_list)) {
                all_subseq_list.add(eachElement_list);
                System.out.println("Subsequence found with product less than " + k + ": " + eachElement_list);
            }
        }

        return all_subseq_list;
        }
    }

