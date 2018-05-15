import java.util.Stack;
import java.util.Arrays;
public class leafsum
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    Stack<Integer> s1=new Stack<Integer>();
    leafsum()
    {
   	  root=null;
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
    int lsum(node a,int d,int s)
    {
       if(a==null)
       {
        return 0;
       }
       if(a.left==null && a.right==null)
       {
        s1.push(a.d);
        s=s+a.d;
        if(s==d)
           {
            System.out.println(Arrays.toString(s1.toArray()));
            s1.pop();
            return 1;
           }
           s1.pop();
        return 0;
       } 
       s1.push(a.d);
       s=s+a.d;
       int ls=lsum(a.left,d,s);
       int rs=lsum(a.right,d,s);
       s1.pop();
       if(ls==1 || rs==1)
        return 1;
      return 0;
    }
    void leafsum(int d)
    {
        int s=0;
        System.out.println(lsum(root,d,s));
    }
	public static void main(String []args)
	{
       leafsum b1=new leafsum();
       b1.insert(40);
		b1.insert(50);
		b1.insert(60);
		b1.insert(30);
		b1.insert(55);
		b1.insert(78);
		b1.insert(48);
		b1.insert(15);
		b1.insert(32);
        b1.inorder();
        b1.leafsum(138);
	}
}