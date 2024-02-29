import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

/*1st question-> find avg */
       int[] nums = {5, 4, 3, 9, 1, 7, 9};
        /* float sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        float result = sum / nums.length;
        System.out.println("Average of given numbers is: " + result);

Output->Average of given numbers is: 5.428571
*/

/*2nd question-> find max min */
     /* int min=nums[0];
	int max=nums[0];
	 for (int i = 1; i < nums.length; i++) {
		if(nums[i]>max) max=nums[i];
		if(nums[i]<min) min=nums[i];
	}
 System.out.println("min:"+min+"  max:"+max);

Output->min:1  max:9
 */


/*3rd question-> sum of multiples of 3 in given sequence*/
     /* Scanner scanner=new Scanner(System.in);
	System.out.print("Enter number :");
	int n=scanner.nextInt();
	int sum=0;
	 for (int i = 1; i < n; i++){
		int temp=2*(i-1);
		if(temp%3==0){
		sum+=temp;
		}
	
	System.out.println(temp);
	}
	System.out.println("sum of multiple of 3 is:"+sum);

Output-> Enter number :20;
	sum of multiple of 3 is:126; */

/*4th question-> add two matrices of same size*/

      /*int[][] m1={
	{1,2,3},
	{4,5,6},
	{7,8,9}
	};

	int[][] m2={
	{9,8,7},
	{6,5,4},
	{3,2,1}
	};
	int[][] ans=new int[3][3];
	for(int i=0;i<3;i++){
	   for(int j=0;j<3;j++){
	     ans[i][j]=m1[i][j]+m2[i][j];
	   }
	}
	for(int i=0;i<3;i++){
	   for(int j=0;j<3;j++){
	     System.out.print(" "+ans[i][j]);
	   }
	   System.out.println();
	}
Output-> 10 10 10
 	 10 10 10
 	 10 10 10 */

/*5th question-> check if given matrices are eaual or not*/
     /* int[][] m1={
	{1,2,3},
	{4,5,6},
	{7,8,1}
	};

	int[][] m2={
	{1,2,3},
	{4,5,6},
	{7,8,9}
	};
	boolean isEqual=true;
	for(int i=0;i<3;i++){
	   for(int j=0;j<3;j++){
	     if(m1[i][j]!=m2[i][j]){
		isEqual=false;
		break;
		}
	   }
	}
	if(isEqual) {
	System.out.println("The matrices are equal.");
	}
	else System.out.println("The matrices are not equal.");

Output->The matrices are not equal. */
    }
}