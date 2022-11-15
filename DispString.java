import java.util.*;
public class DispString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str=sc.nextLine();
		System.out.println("Enter letter:");
		char let =sc.next().charAt(0);
		String result=GetString(str,let);
		System.out.println(result);
	}

	private static String GetString(String str, char let)
	{
		char ch[]=str.toCharArray();
		String st="";
		if(str.indexOf(let)>=0)
		{	
			for (int i = 0; i < ch.length; i++)
			{
				if(ch[i]==let)
				{
					for (int j = i+1; j < ch.length; j++) 
					{
						st=st+ch[j];
					}
				break;
				}	
			}
			return "Result: "+st;
		}
		else
		{
			return "Result: This character is not present in the sentence";
		}
		
	}
}
