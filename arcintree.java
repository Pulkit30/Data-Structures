import java.util.*;
public class arcintree
{
	class node
	{
		node left;
		node right;
		int d;
	}
	node root;
	static int f=0;
	arcintree()
	{
		root=null;
	}
	node insertbst(node root,int d)
	{
		if(root==null)
		{
			node n=new node();
			n.d=d;
			n.left=null;
			n.right=null;
			return n;
		}
		if(d<root.d)		
			root.left=insertbst(root.left,d);
		else if(d>root.d)
			root.right=insertbst(root.right,d);
		return root;
	}
	void insert(int d)
	{
    root=insertbst(root,d);
    } 
	void in(node n)
	{
		if(n==null)
			return;
		in(n.left);
		System.out.println(n.d);
		in(n.right);
	}
	void inorder()
	{
		in(root);
	}
	void arc1(node root)
	{
		
    if(root==null)
    {
    	f=1;
    	return;
    }
    arc1(root.left);
    if(f==1)
    	System.out.println(root.d);
	}
	void arc()
	{
    if(root==null)
    	return;
    arc1(root.left);
	}
	public static void main(String[] args)
	{
		arcintree b1=new arcintree();
		b1.insert(40);
		b1.insert(50);
		b1.insert(60);
		b1.insert(30);
		b1.insert(55);
		b1.insert(78);
		b1.insert(48);
		b1.insert(15);
		b1.insert(32);
		b1.insert(29);
		b1.insert(28);
		b1.insert(27);
        b1.insert(26);
        //b1.insert(25);
		//b1.inorder();
		b1.arc();
	
	}
}