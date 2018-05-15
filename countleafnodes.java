public class countleafnodes
{
    class node
    {
    	node left;
    	node right;
    	int d;
    }
    node root;
    countleafnodes()
    {
    	root=null;
    }
    node insert1(node root,int r)
    {
    	if(root==null)
    	{
    		node n1=new node();
    		n1.left=null;
    		n1.right=null;
    		n1.d=r;
    		return n1;
    	}
    	if(r<root.d)
    		root.left=insert1(root.left,r);
    	else if(r>root.d)
    		root.right=insert1(root.right,r);
    	return root;
    }
    void insert(int r)
    {
       root=insert1(root,r); 
    }
    void in(node root)
    {
    	if(root==null)
    		return;
    	in(root.left);
    	System.out.println(root.d);
    	in(root.right);
    }
    int leaves(node a)
    {
    	if(a==null)
    		return 0;
    	if(a.left==null && a.right==null)
    		return 1;
    	int c1=leaves(a.left);
    	int c2=leaves(a.right);
    	return c1+c2;

    }
    void printleaf()
    {
    	int c=leaves(root);
    	System.out.println(c);
    }
    void inorder()
    {
    	in(root);
    }
	public static void main(String[] args)
	{
		countleafnodes b1=new countleafnodes();
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
		b1.printleaf();

	}
}