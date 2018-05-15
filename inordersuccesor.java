
public class inordersuccessor
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    inordersuccessor()
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
    node search(node root,int d)
    {
       if(root==null)
       return root;
       if(root.d==d)
        return root;
       if(d<root.d)
        root.left=search(root.left,d);
       else
        root.right=search(root.right,d);
    }
    void sucessor(int d)
    {
        node r1=search(root,d);
        //sucessor(root,d);
    }
	public static void main(String []args)
	{
       inordersuccessor b1=new inordersuccessor();
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
        b1.sucessor(55);
	}
}