import java.util.Scanner;

public class SelectionSort {
		    public static void main(String[] args) {
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("Enter the length of an array:");
		        int[] arr = new int[sc.nextInt()];
		        System.out.println("Enter array elements:");
		        for(int i =0;i<arr.length;i++) {
		        arr[i]=sc.nextInt();	
		        }
		        System.out.println("Before Sorting:");
		        for (int i=0;i<arr.length;i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		        selectionSort(arr);
		        System.out.println("Sorted array:");
		        for (int i=0;i<arr.length;i++) {
		            System.out.print(arr[i] + " ");
		        }
		        sc.close();
		    }
		    public static void selectionSort(int[] arr) {
		        int n = arr.length;
                    for (int i=0; i<n-1; i++) {
		            int min = i;
		            for (int j=i+1; j<n; j++) {
		                if (arr[j] < arr[min]) {
		                    min = j;
		                }
		            }
		            // Swap the found minimum element with the first element
		            int temp = arr[min];
		            arr[min] = arr[i];
		            arr[i] = temp;
		        }
		    }
		}


