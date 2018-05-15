import java.util.ArrayList;
import java.util.Stack;
public class bstboundary
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
	static int f=0;
	static int g=0;
    Stack<Integer> s1=new Stack<Integer>();
    ArrayList<Integer> s2=new ArrayList<Integer>();
    bstboundary()
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
    void bound_left(node root)
    {
    	
    	if(root==null)
    		return;
    	if(root.left==null && root.right==null)
    		f=1;
    	if(f==0)
    		s1.push(root.d);
    	else if(root.left==null || root.right==null)
    		s1.push(root.d);
    	bound_left(root.left);
    	bound_left(root.right);
    }
    void bound_right(node root)
    {
    	if(root==null)
    		return;
        if(root.left==null && root.right==null)
        	g=1;
        if(g==0)
        	s2.add(root.d);
        else if(root.left==null || root.right==null)
            s2.add(root.d);
            bound_right(root.right);
            bound_right(root.left); 

    }
    void boundary()
    {
        s1.push(root.d);
    	bound_left(root.left);
        bound_right(root.right);
    }
    void inorder()
    {
    	in1(root);
    }
	void insert(int a)
	{
		root=insert1(root,a);
	}
    void print()
    {
        while(s1.empty()!=true)
            System.out.println(s1.pop());
        int m=s2.size();
        int i;
        for(i=0;i<m;i++)
            System.out.println(s2.get(i));
    }
   
	public static void main(String []args)
	{
       bstboundary b1=new bstboundary();
       b1.insert(40);
		b1.insert(50);
		b1.insert(60);
		b1.insert(30);
		b1.insert(55);
		b1.insert(78);
		b1.insert(48);
		b1.insert(15);
		b1.insert(32);
       // b1.inorder();
        b1.boundary();
        b1.print();
	}
}