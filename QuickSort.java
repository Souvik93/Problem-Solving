

import java.util.*;
public class Solution {
	    
          static int counter = 0;
          static void quickSort(int[] ar) {

             printArray(QS(ar, 0, ar.length-1));
            
	    		    	
	    }

        static int[] QS(int[] ar, int first, int last) {
            
            if(first<last) {
            counter++;
            int pivot = doQuickSort(ar,first,last);
            // System.out.println("Hola !!"+ counter);
            printArray(ar);
             QS(ar,first,pivot-1);
             QS(ar,pivot+1,last);
            }

        return ar;
        }
        
        static int doQuickSort(int[] arr, int start, int last) {

            int pivot = arr[start];
            
            int finish = last;
            int first = start; 
            start++;
            for(int i=last;i>start;i--) {

                if(pivot <arr[last]) {
                    last--;
                } else {
                    if(arr[start]<pivot) {
                        start++;
                    } else {
                        int temp = arr[last];
                        arr[last] = arr[start];
                        arr[start] = temp;
                        start++;
                        last--; 
                    }
                }
                
            }

            // System.out.println("Tola !!"+first);
            // System.out.println("Ola !!"+last);
            
            if(arr[first]>=arr[last]) {
                // System.out.println("Vola Inside If !! :) :)");
                arr[first] = arr[last];
                arr[last] = pivot;
            }

            return last;

        }

 
 static void printArray(int[] ar) {
			for(int n: ar){
				System.out.print(n+" ");
			}
	        System.out.println("");
		}
	    
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int i=0;i<n;i++){
	           ar[i]=in.nextInt(); 
	        }
	        quickSort(ar);
	    }    
	}
