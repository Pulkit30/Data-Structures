
public class treesubtree
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    treesubtree()
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
	int check2(node a1,node a2)
	{
		if(a1==null)
			return 0;
		if(a2==null)
			return 1;
		if(a1.d!=a2.d)
			return 0;
		if(a2.left== null && a2.right==null)
			return 1;
		
		int l1=check2(a1.left,a2.left);
		int r1=check2(a1.right,a2.right);
		if(l1==1 && r1==1)
			return 1;
		return 0;
	}
	node check(node a1,node a2)
	{
		if(a1==null || a2==null)
			return a1;
		if(a1.d==a2.d)
			return a1;
		else if(a2.d<a1.left.d)
			return check(a1.left,a2);
		return check(a1.right,a2);
	}
    void check(treesubtree b2)
    {
    	node j=check(root,b2.root);
    	if(j!=null)
    	{
    	System.out.println(j.d);
        int k=check2(j,b2.root);
        System.out.println(k);
        }
    }
	public static void main(String []args)
	{
       treesubtree b1=new treesubtree();
       treesubtree b2=new treesubtree();
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
        b2.insert(50);
        b2.insert(48);
        b2.insert(60);
        b2.insert(55);
        //b2.insert(78);
        b2.inorder();
        b1.check(b2);
	}
}