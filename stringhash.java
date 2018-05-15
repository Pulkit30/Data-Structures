import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
public class stringhash
{
public static void main(String[] args)
{
 String stringhash="Virat Kohli is the best Player all over the World";
 String []s2=stringhash.split("[ ]+");
 HashMap<Integer,ArrayList<String>>h1;
 h1=new HashMap<>();
 //Integer hd=1;
 for (String g:s2)
 {
 Integer hd=g.length();
  if(h1.get(hd)==null){
  	ArrayList<String> a = new ArrayList<String>();
  	a.add(g);
      h1.put(hd,a);}
  else
  	h1.get(hd).add(g);
 }
 System.out.println( h1.size());
 System.out.println( h1.entrySet());
   for(Map.Entry<Integer,ArrayList<String>>  entry:h1.entrySet()){
	
		Integer key=entry.getKey();
		//System.out.print("key :"+key+" \nvalue :");
		ArrayList<String> values=entry.getValue();
		for(String word:values){
			System.out.print(word+" ");
		}
	}
	int[] a=new int[10];
	for(int i=0;i<10;i++)
		a[i]=1;
 for(int i: a)
 {
 	if(i==0)
 	System.out.println(i);
 }
 //h1.containsKey()
}
}