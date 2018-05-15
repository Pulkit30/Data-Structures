
public class treeidentical
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    treeidentical()
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
    int check(node r1,node r2)
    {
      if(r1==null && r2==null)
        return 1;
      if(r1==null || r2==null)
        return 0;
      if(r1.d==r2.d)
      {
        int l1=check(r1.left,r2.left);
        int l2=check(r1.right,r2.right);
        if(l1==1 && l2==1)
            return 1;
      }
      return 0;
    }
    int check(treeidentical b)
    {
       return check(root,b.root);
    }
    void inorder()
    {
    	in1(root);
    }
	void insert(int a)
	{
		root=insert1(root,a);
	}

	public static void main(String []args)
	{
       treeidentical b1=new treeidentical();
       treeidentical b2=new treeidentical();
       b1.insert(40);
		b1.insert(50);
		b1.insert(60);
		b1.insert(30);
		b1.insert(55);
		b1.insert(78);
		//b1.insert(49);
		b1.insert(15);
		b1.insert(32);
       // b1.inorder();
        b2.insert(40);
        b2.insert(50);
        b2.insert(60);
        b2.insert(30);
        b2.insert(55);
        b2.insert(78);
        b2.insert(48);
        b2.insert(15);
        b2.insert(32);
       int r= b1.check(b2);
       if(r==1)
        System.out.println(r);
       else
        System.out.println(r);
	}
}