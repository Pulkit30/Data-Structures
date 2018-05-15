
public class deletespecific
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    deletespecific()
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
    node minimum(node root)
    {
       System.out.println(root.d);
        while(root.left!=null)
        {
            root=root.left;
            System.out.println(root.d);
        }
        return root;
    }
    node delete1(node root,int a)
    {
        if(root==null)
            return root;
        if(a<root.d)
          root.left=delete1(root.left,a);
       else if(a>root.d)
          root.right=delete1(root.right,a);
       else if(a==root.d)
       {
        if(root.left==null)
        {
            node temp=root.right;
            root=null;
            return temp;
        }
        else if(root.right==null)
        {
            node temp=root.left;
            root=null;
            return temp;
        }
        
            node temp=minimum(root.right);
            root.d=temp.d;
            root.right=delete1(root.right,temp.d);

       }
       return root;
    }
    void delete(int d)
    {
        delete1(root,d);
    }
    
	public static void main(String []args)
	{
       deletespecific b1=new deletespecific();
       b1.insert(40);
		b1.insert(50);
		b1.insert(60);
		b1.insert(30);
		b1.insert(55);
		b1.insert(78);
		b1.insert(48);
		b1.insert(15);
		b1.insert(32);
        b1.insert(31);
       // b1.inorder();
        b1.delete(32);
        b1.inorder();
	}
}