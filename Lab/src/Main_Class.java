import java.util.Scanner;

public class Main_Class {
  public static void main (String args[]) {
	  int a, b, s, d, p, min, max, dist;
	  float average;
	  System.out.print("Introduceti numarul =");
	  Scanner scanner = new Scanner(System.in);
	  a= scanner.nextInt();
	  System.out.print("Introduceti numarul=");
	  b=scanner.nextInt();
	  s=0;
	  s=a+b;
	  System.out.println("suma este:");
	  System.out.println(s);
	  d=0;
	  d=a-b;
	  System.out.println("diferenta este:");
	  System.out.println(d);
	  p=1;
	  p=a*b;
	  System.out.println("produsul este:");
	  System.out.println(p);
	  min=0;
	  max=0;
	    if(a>b) max=a;
	        else max=b;
	   if(a<b) min=a;
	       else min=b;
	   System.out.println("Maximul este:");
       System.out.println(max);
       System.out.println("Minumul este:");
       System.out.println(min);
       
       average=(a+b)/2;
       System.out.println("Average");
       System.out.println(average);
       
       if(a>b)
    	   dist= a-b;
    	   else dist= b-a;

       System.out.println("Distanta este:");
       System.out.println(dist);
  }
  
}
