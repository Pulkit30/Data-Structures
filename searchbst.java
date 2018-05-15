
public class searchbst
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    searchbst()
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
    int find(node root,int a)
    {
        if(root==null)
            return 0;
        if(root.d==a)
            return root.d;
        if(a<root.d)
            return find(root.left,a);
            return find(root.right,a);
    }
    void search(int a)
    {
        int c=find(root,a);
        if(c!=0)
            System.out.println(c);
        else
            System.out.println("Not found");
    }
	public static void main(String []args)
	{
       searchbst b1=new searchbst();
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
        b1.search(82);
	}
}