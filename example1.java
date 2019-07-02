import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
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
