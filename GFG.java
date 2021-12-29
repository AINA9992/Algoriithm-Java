// AINA SYARAFINA ROSLAN 148450
//ASSIGNMENT 1 CPT212

import java.io.*;
import java.util.Random;

public class GFG {

	public static int counter = 0;
	
	static int NUM_LINE = 2;
  
     
    // Utility function to find minimum of two numbers
    static int min(int a, int b)
    {
        return a < b ? a : b;
         
    }
     
    static int carAssembly(int a[][], int t[][], int e[], int x[], int NUM_STATION)
    {
        int T1[]= new int [NUM_STATION];
        counter = counter + 3;
        
        int T2[] =new int[NUM_STATION] ;
        counter = counter + 3;
        
        int i;
     
        // time taken to leave first station in line 1
        T1[0] = e[0] + a[0][0];
        
        counter = counter + 3; //array 
        counter = counter + 2; //assign & addition
         
        // time taken to leave first station in line 2
        T2[0] = e[1] + a[1][0];
        
        counter = counter + 3; //array 
        counter = counter + 2; //assign & addition
        
        // Fill tables T1[] and T2[] using
        // the above given recursive relations
        for (i = 1; i < NUM_STATION; ++i)
        {
        	counter = counter + 4;
        	
            T1[i] = min(T1[i - 1] + a[0][i],
                    T2[i - 1] + t[1][i] + a[0][i]);
            counter = counter + 13 ;
            
            T2[i] = min(T2[i - 1] + a[1][i],
                    T1[i - 1] + t[0][i] + a[1][i]);
            counter = counter + 13 ;
        }
     
        // Consider exit times and return minimum
        counter = counter + 10;
        return min(T1[NUM_STATION-1] + x[0],
                    T2[NUM_STATION-1] + x[1]);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{4, 5, 3, 2, 8, 9, 10, 11, 2, 1, 6, 7},
                {2, 10, 1, 4, 7, 8, 1, 9, 11, 10, 4, 6}}; //how much time spend at station
		
		counter = counter + 2; //array & assign
		
    int t[][] = {{0, 7, 4, 5, 6, 8, 1, 9, 10, 5, 7, 4},
                {0, 9, 2, 8, 9, 10, 4, 3, 8, 5, 7, 9}}; // time taken to transfer to other line

    	counter = counter + 2; //array & assign
    	
    int e[] = {10, 12}, x[] = {18, 7}; //entry time
    	
    	counter = counter + 4; //array(2) & assign (2)
    
    Random rand = new Random(); //instance of random class
    
    	counter = counter + 1;
    	
    int upperbound = 13;
    
    	counter = counter + 1;
    
      //generate random values from 0-24
    int int_random = rand.nextInt(upperbound);  
    
    	counter = counter + 3;
    
    System.out.println("Random total station of " + (upperbound-1) + " station" + " : "+ int_random);
 
    System.out.println("Minimum Entry and Exit time " + " : " + carAssembly(a, t, e, x, int_random));  
    
    System.out.println("Primitive operation " + " : " + counter);
	}

}
