import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
public class verticalorder
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    HashMap<Integer,ArrayList<Integer>> h1;
    
    verticalorder()
    {
   	  root=null;
      h1=new HashMap<>();
    }
    node insert1(node root,int b)
    {
    	if(root==null)
    	{
    		node n=new node();
    		n.d=b;
    		n.left=null;
    		n.right=null;
    		return n;
    	}
    	if(b<root.d)
    		root.left=insert1(root.left,b);
    	else if(b>root.d)
    		root.right=insert1(root.right,b);
    	return root;
    }
    void in1(node r1)
    {
    	if(r1==null)
    	{
    		return;
    	}
    	in1(r1.left);
    	System.out.println(r1.d);
    	in1(r1.right);

    }
    void inorder()
    {
    	in1(root);
    }
	void insert(int a)
	{
		root=insert1(root,a);
	}
    void vert(node a,int l)
    {
     if(a==null)
        return;
      if(h1.get(l)==null)
      {
        ArrayList<Integer>a1=new ArrayList();
        a1.add(a.d);
        h1.put(l,a1);
      }
      else
      {
        h1.get(l).add(a.d);
      }
      vert(a.left,l-1);
      vert(a.right,l+1);
    }
   void print()
   {
   for(Map.Entry<Integer,ArrayList<Integer>>  entry:h1.entrySet()){
    
        Integer key=entry.getKey();
        System.out.print("key :"+key+" \nvalue :");
        ArrayList<Integer> values=entry.getValue();
        /*for(Integer word:values){
            System.out.print(word+" ");
        }*/
        System.out.print(values.get(0));
      }
    }

    void vertical()
    {
        int l=0;
        vert(root,l);
        print();
    }
	public static void main(String []args)
	{
       verticalorder b1=new verticalorder();
       b1.insert(40);
		b1.insert(50);
		b1.insert(60);
		b1.insert(30);
		b1.insert(55);
		b1.insert(78);
		b1.insert(48);
		b1.insert(15);
		b1.insert(32);
        //b1.inorder();
        b1.vertical();
	}
}