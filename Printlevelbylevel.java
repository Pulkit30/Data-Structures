
public class Printlevelbylevel
{
    public class node
	{
     int d;
     node left;
     node right;
	}
	node root;
    Printlevelbylevel()
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
    int height(node a)
    {
        if(a==null)
            return 0;
        int lh=height(a.left);
        int rh=height(a.right);
        if(lh>rh)
            return 1+lh;
        else
            return 1+rh;
    }
    void inorder()
    {
    	in1(root);
    }
	void insert(int a)
	{
		root=insert1(root,a);
	}
    void printgivenlevel(node root,int level)
    {
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.d + " ");
        else
        {
            printgivenlevel(root.left,level-1);
            printgivenlevel(root.right,level-1);
        }

    }
    void printlevelorder(node root)
    {
      int h=height(root);
      for(int i=1;i<=h;i++)
      {
        printgivenlevel(root,i);
        System.out.println();
      }
    }
     void printlevelorder()
     {
        printlevelorder(root);
     }
	public static void main(String []args)
	{
       Printlevelbylevel b1=new Printlevelbylevel();
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
        b1.printlevelorder();
   
	}
}