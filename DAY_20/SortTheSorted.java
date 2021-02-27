import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int k=0,l=0;
        int b[]=new int [n];
        int c[]=new int [n];
        for(int i=0;i<n;i++)
            if(a[i]<0)
            b[k++]=a[i];
            else
            c[l++]=a[i];
        int i=0;
        for(int y=k-1;y>=0;y--)
            a[i++]=b[y];
        for(int y=0;y<l;y++)
            a[i++]=c[y];
        for(int y=0;y<n;y++)
            System.out.print(a[y]+" ");
            
        }
}