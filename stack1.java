import java.util.*;
import java.util.ArrayList;
public class stack1
{
	public static void main(String[] args)
	{
	  Stack<String> s1=new Stack<String>();
	    s1.push("Pulkit");
	    s1.push("linux");
	    s1.push("os");
	    s1.push("data structure");
	   System.out.println(s1.peek());
	    System.out.println(s1.search("Pulkit"));
       
     ArrayList<String> al = new ArrayList<String>(s1);
     String [] c1 = al.toArray(new String[al.size()]);
     for(int i=0;i<al.size();i++)
     	System.out.println(c1[i]);
      for(i=0;i<2;i++)
     	System.out.println(al[i]);
	}
}