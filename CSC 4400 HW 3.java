/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
		String words = "swaus";
		boolean bool = IsAllUnique(words);
		if(bool == true)
		{
		    System.out.println("The string has no repeating characters");
		}
		else
		{
		    System.out.println("The string has at least one repeat character");
		}
	}
	
	public static boolean IsAllUnique(String s)
	{
	    char[] list = new char[s.length()];
	    for(int i = 0; i < s.length(); i++)
	    {
	        list[i] = s.charAt(i);
	        for(int j = 0; j < i; j++)
	        {
	            if(list[i] == list[j])
	            {
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
