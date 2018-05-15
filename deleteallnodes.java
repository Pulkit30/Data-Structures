
public class deleteallnodes
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    deleteallnodes()
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
   node del(node root)
    {
        if(root==null)
            return root;
        root.left=del(root.left);
        root.right=del(root.right);
        root=null;
        return root;
    }
    void delete()
    {
        root=del(root);
    }
	public static void main(String []args)
	{
       deleteallnodes b1=new deleteallnodes();
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
        b1.delete();
        b1.inorder();
	}
}