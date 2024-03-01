import java.util.Arrays;
class day5{
	public static void main(String[] args){
	/* for (int i = 1; i <= 5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
       	  }

Output->1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/


	/*  for (int i = 5; i >= 1;i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); 
	    }

output->
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5 */


	/* for (int i = 1; i <= 5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( " "+i);
            }
            System.out.println(); 
       	  } */
	
	
    /*  int[] nums={1, 2, 3, 4, 5};
	int sum=0;
	for (int i = 0; i < nums.length;i++){
	sum+=nums[i];  
	}
	 System.out.println("sum of given elements in nums is = "+sum);
	*/
	
/* 2nd largest element */
/*	int[] nums={5, 3, 9, 7, 1};
	int large=Integer.MIN_VALUE;
	int second=Integer.MIN_VALUE;
	for (int i = 0; i < nums.length;i++){
		if(nums[i]>large){
		second=large;
		large=nums[i];
		} 
		else if(nums[i]>second && nums[i]!=large) second=nums[i];	
	}
	System.out.println("2nd largest element in nums is = "+second);
Output->2nd largest element in nums is = 7 */


/*Question->Write a Java program to reverse an array of integers without using additional arrays or
collections */

/*	int[] nums={1, 2, 3, 4, 5};
	int s=0,e=nums.length-1;
	while(s<e){
	int temp=nums[s];
	nums[s]=nums[e];
	nums[e]=temp;
	s++;
	e--;
	}
	  System.out.println("Reversed array: " + Arrays.toString(nums));
    	 }
Output->Reversed array: [5, 4, 3, 2, 1]*/

/*Question->Write a Java program to find the common elements between two arrays of integers*/

	int[] n = {1, 2, 3, 4, 5};
	int[] m = {3, 4, 5, 6, 7};
	int[] ans = new int[Math.min(n.length, m.length)];
	int i = 0, j = 0, k = 0; 
	int s1 = n.length, s2 = m.length;

	while (i < s1 && j < s2) { 
    	if (n[i] == m[j]) {
        	ans[k++] = n[i]; 
        	i++; 
       		j++;
   	 } else if (n[i] < m[j]) {
       		 i++;
   	 } else {
       		 j++;
    }
}
	
	System.out.println("common elements: " + Arrays.toString(ans));
}
}