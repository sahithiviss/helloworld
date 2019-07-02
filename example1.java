import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		String s[] = new String[2];
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> sl = new ArrayList<String>();
		while(scan.hasNext())
		{
		    s= scan.nextLine().split(" ");
		    sl.add(s[0]);
		    a.add(Integer.parseInt(s[1]));
		}
		//System.out.println(a.get(1)+" "+sl.get(0));
		Iterator i = a.iterator();
		int j=0;
		int min=a.get(0);
		int minIndex=0;
		while(i.hasNext()){
		    int small = (Integer) i.next();
		    if(small<min){
		    min = small;
		    minIndex=j;
		    }
		    j++;
		}
		System.out.print(a.get(minIndex)+" "+sl.get(minIndex));
	    scan.close();
	}
}
