//assignment1 
//ques 1
// import java.util.Scanner;
// public class assignment1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//         if(i%2==0){
//             System.out.println(i + "-> Even");
//         }
//         else {
//             System.out.println(i +"-> Odd");
//         }
//        }
//        sc.close();
//     }
// }
//=========================================================================//
//ques 2
// import java.util.Scanner;
// public class assignment1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i = 1; i <= n; i++) {

//             System.out.println("Table of " + i);

//             for (int j = 1; j <= 10; j++) {
//                 System.out.println(i + " x " + j + " = " + (i * j));
//             }

//             System.out.println();
//         }

//         sc.close();
//     }}
//========================================================================================//
//ques3
// import java.util.Scanner;
// public class assignment1 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int start = sc.nextInt();
//         int end = sc.nextInt();

//         for (int i = start; i <= end; i++) {

//             int count = 0;

//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) {
//                     count++;
//                 }
//             }

//             if (count == 2) {
//                 System.out.println(i);
//             }
//         }

//         sc.close();
//     }
// }
//============================================================================//
//ques4
// import java.util.Scanner;
// public class assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int secret = 27;
//         boolean guessed = false;
//         for (int i = 1; i <= 5; i++) {
//             int guess = sc.nextInt();
//             if (guess < secret) {
//                 System.out.println("Too Low");
//             }
//             else if (guess > secret) {
//                 System.out.println("Too High");
//             }
//             else {
//                 System.out.println("Congratulations! You guessed it.");
//                 guessed = true;
//                 break;
//             }
//         }
//         if (!guessed) {
//             System.out.println("Better Luck Next Time!");
//         }
//         sc.close();
//     }
// }
//==========================================================================================//
//ques 5
// import java.util.Scanner;
// public class assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int start = sc.nextInt();
//         int end = sc.nextInt();
//         for (int i = start; i <= end; i++) {
//             int num = i;
//             int sum = 0;
//             while (num > 0) {
//                 int digit = num % 10;
//                 int fact = 1;
//                 for (int j = 1; j <= digit; j++) {
//                     fact = fact * j;
//                 }
//                 sum = sum + fact;
//                 num = num / 10;
//             }

//             if (sum == i) {
//                 System.out.println(i);
//             }
//         }
//         sc.close();
//     }
// }
