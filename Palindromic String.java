/* IMPORTANT: Multiple classes and nested static classes are supported 
Palindromic String.java
problem:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
Problem

You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints

Note
String S consists of lowercase English Alphabets only.
Sample Input

aba

Sample Output

YES

Time Limit: 1
Memory Limit: 256
Source Limit: 
*/

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        char[] chr=inp.toCharArray();
        int i=0,n=chr.length,j=n-1,flag=1;
        while(i<j){
            if(chr[i]!=chr[j]){
                flag=0;
                break;
            }
            i++;
            j--;
        }
        if(flag==1) System.out.println("YES");
        else System.out.println("NO");


    }
}
