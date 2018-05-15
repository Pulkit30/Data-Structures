public class diameter
{
    class node
	{
		node left;
		node right;
		int d;
	}
	node root;
	int max=0;
    diameter()
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
    int left_count(node root,int m,int n)
    {
     if(root==null)
     	return n;
     n=n+1;
     int lh=left_count(root.left,m,n);
     int rh=left_count(root.right,m,n);
     if(lh>rh)
     	return lh;
     else
     	return rh;
    }
    int height(node root)
    {
    	if(root==null)
    		return 0;
    	int lh=height(root.left);
    	int rh=height(root.right);
    	if(lh>rh)
    		return 1+lh;
    	else
    		return 1+rh;
    }
    int di(node root){

     if(root==null)
     	return 0;
     int lh=height(root.left);
     int rh=height(root.right);
     int t1=1+lh+rh;
     int ld=di(root.left);
     int rd=di(root.right);
     int m1=Math.max(ld,rd);

     int m2=Math.max(m1,t1);
     if(m2>max)
     	max=m2;
     	      return m2;
    }
    void diameter()
    {
       int c=di(root);
       System.out.println(c);
    }
	public static void main(String[] args)
	{
		diameter b1=new diameter();

		b1.insert(40);
		/*b1.insert(50);
		b1.insert(60);
		
		b1.insert(55);
		b1.insert(78);
		b1.insert(48);*/
		b1.insert(30);
		b1.insert(15);
		b1.insert(14);
		b1.insert(13);
		b1.insert(12);
		b1.insert(11);
		b1.insert(32);
		b1.insert(29);
		b1.insert(28);
		b1.insert(27);
        b1.insert(26);
        b1.inorder();
        b1.diameter();
	}
}