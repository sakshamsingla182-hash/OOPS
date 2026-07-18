
//===========================================================================//
//assignment 3 
//ques 1
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         //LC 1920 — Build Array from Permutation
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int[] nums=new int[n];
//     for(int i=0;i<n;i++){
//         nums[i]=sc.nextInt();
//     }
//     for(int i=0;i<n;i++){
//         System.out.print(nums[nums[i]]);
//     }   }
// }
//=======================================================================================//
//ques2
// LeetCode 1929 - Concatenation of Array
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int [] nums=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         int[] ans=new int[2*n];
//         for(int i=0;i<n;i++){
//             ans[i]=nums[i];
//         }
//         for(int i=0;i<n;i++){
//             ans[i+n]=nums[i];
//         }
//         for(int i=0;i<2*n;i++){
//             System.out.print(ans[i]);
//         }
//     }
// }
//=================================================================================================//
//ques3
//LeetCode 1480 - Running Sum of 1D Array
// import java.util.Scanner;
// public class homework {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int[]nums=new int[n];
//     int[]running=new int[n];
//     for(int i=0;i<n;i++){
//         nums[i]=sc.nextInt();
//     }
//     running[0]=nums[0];
//     for(int i=1;i<n;i++){
//         running[i]=running[i-1]+nums[i];
//     }
//     for(int i=0;i<n;i++){
//         System.out.print(running[i]+" ");
//     }
// }
// }
//=====================================================================================//
//ques4
//LeetCode 1672 - Richest Customer Wealth
// import java.util.Scanner;
// public class homework {
// public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int rows=sc.nextInt();
//    int cols=sc.nextInt();
//    int[][]accounts=new int[rows][cols];
//    for(int i=0;i<rows;i++){
//     for(int j=0;j<cols;j++){
//         accounts[i][j]=sc.nextInt();
//     }
//    }
//    int max=0;
//    for(int i=0;i<rows;i++){
//     int sum=0;
//     for(int j=0;j<cols;j++){
//         sum+=accounts[i][j];
//     }
//    if(sum>max){
//     max=sum;
//    }}
//    System.out.println(max);
// }
// }
//============================================================================//
//ques 5
// LeetCode 1470 - Shuffle the Array         //doubt tough
// import java.util.Scanner;
// public class homework {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int[] nums=new int[2*n];
//     for(int i=0;i<2*n;i++){
//         nums[i]=sc.nextInt();
//     }
//     int[] ans=new int[2*n];
//     int j=0;
//     for(int i=0;i<n;i++){
//         ans[j]=nums[i];
//         ans[j+1]=nums[i+n];
//         j=j+2;
//     }
//     for(int i=0;i<2*n;i++){
//         System.out.print(ans[i]+" ");
//     }
// }
// }
//==========================================================================================//
//ques 6
//1431 kids with greatest number of candies
// import java.util.Scanner;
// public class homework {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

// int[] candies=new int[n];
// for(int i=0;i<n;i++){
//     candies[i]=sc.nextInt();
// }
// int extraCandies=sc.nextInt();
// int max=candies[0];
// for(int i=1;i<n;i++){
//     if(candies[i]>max){
//         max=candies[i];
//     }}
//     for(int i=0;i<n;i++){
//         if(extraCandies+candies[i]>=max){
//             System.out.print("true"+" ");
//         }
//         else{
//             System.out.print("false"+" ");
//         }
//     }
// }
// }
//===================================================================================//
//ques 7
//LeetCode 1732 - Find the Highest Altitude
// import java.util.Scanner;
// public class homework {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int[] gain=new int[n];
//     for(int i=0;i<n;i++){
//         gain[i]=sc.nextInt();
//     }
//     int ca=0;
//     int ha=0;
//     for(int i=0;i<n;i++){
//         ca=ca+gain[i];
//         if(ca>ha){
//             ha=ca;
//         }}
//         System.out.print(ha);
    
// }
// }
//========================================================================================//
//ques 8
// LeetCode 1295 - Find Numbers with Even Number of Digits
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             int num = nums[i];
//             int digits = 0;
//             // Handle the case when the number is 0
//             if (num == 0) {
//                 digits = 1;
//             } else {
//                 while (num != 0) {
//                     digits++;
//                     num = num / 10;
//                 }
//             }
//             if (digits % 2 == 0) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
//====================================================================================================//
// ques 9
// LeetCode 1512 - Number of Good Pairs
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             nums[i] = sc.nextInt();
//         }
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i + 1; j < n; j++)
//             {
//                 if(nums[i] == nums[j])
//                 {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }
//==============================================================================================//
//ques 10                  doubt
// LeetCode 2011 - Final Value of Variable After Performing Operations
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of operations: ");
//         int n = sc.nextInt();
//         String[] operations = new String[n];
//         System.out.println("Enter operations:");
//         for(int i = 0; i < n; i++)
//         {
//             operations[i] = sc.next();
//         }
//         int x = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(operations[i].contains("++"))
//             {
//                 x++; }
//             else
//             {
//                 x--;
//             }}
//         System.out.println("Final Value = " + x);
//     }
// }
//==========================================================================================================//
//ques 11
//  LeetCode 2652 - Sum Multiples
// import java.util.Scanner;
// public class homework {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1;i<=n;i++)
//         {
//             if(i%3==0 || i%5==0 || i%7==0)
//             {
//                 sum = sum + i; }
//         }
//         System.out.println(sum);
//     }
// }
//===============================================================================================//
// ques12
// LeetCode 2469 - Convert the Temperature
// import java.util.Scanner;
// public class homework {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double celsius = sc.nextDouble();
//         double kelvin = celsius + 273.15;
//         double fahrenheit = celsius * 1.80 + 32;
//         System.out.println("Kelvin:" + kelvin);
//         System.out.println("Fahrenheit: "+ fahrenheit);
//     }
// }
//================================================================================================//
//ques13
// LeetCode 2235 - Add Two Integers
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         System.out.println(num1 + num2);
//     }
// }
//==============================================================================================//
//ques 14
// LeetCode 2824 - Count Pairs Whose Sum is Less than Target
// import java.util.Scanner;
// public class homework {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             nums[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         int count = 0;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(nums[i] + nums[j] < target)
//                 {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }
//================================================================================================//
//ques15             //doubt tough
// LeetCode 2114 - Maximum Number of Words Found in Sentences
// import java.util.Scanner;
// public class homework{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         String[] sentence = new String[n];
//         int max = 0;
//         for(int i=0;i<n;i++)
//         {
//             sentence[i] = sc.nextLine();
//             int words = 1;
//             for(int j=0;j<sentence[i].length();j++)
//             {
//                 if(sentence[i].charAt(j)==' ')
//                 {
//                     words++;
//                 }
//             }
//             if(words>max)
//             {
//                 max = words;
//             }
//         }
//         System.out.println(max);
//     }
// }