import java.util.Scanner;

public class WordUplow
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int totupp=0;
		int totlow=0;
		for(int i=0;i<s.length();i++)
		{
		    if(Character.isUpperCase(s.charAt(i)))
		    {
		        totupp++;
		    }
		}
		totlow=s.length()-totupp;

		if(totlow>=totupp)
		    System.out.println(s.toLowerCase());
		else
		    System.out.println(s.toUpperCase());


	}
}