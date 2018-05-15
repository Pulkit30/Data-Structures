void topview (node root)
{
void vertorder(Node root,HashMap<Integer,ArrayList<Integer>> h1,int l)
    {
        if(root==null)
            return;
        if(h1.get(l)==null)
        {
            ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(root.data);
            h1.put(l,a);
        }
        else
        {
            h1.get(l).add(root.data);
        }
        vertorder(root.left,h1,l-1);
        vertorder(root.right,h1,l+1);
    }
	void topView(Node root) {
      Queue<Node> q1=new LinkedList();
      ArrayList<Integer>a1=new ArrayList<Integer>();
      if(root==null)
          return;
        q1.add(root);
        while(!q1.isEmpty())
        {
            Node r1=q1.remove();
            a1.add(r1.data);
            if(r1.left!=null)
                q1.add(r1.left);
             if(r1.right!=null)
                q1.add(r1.right);
        }
        HashMap<Integer,ArrayList<Integer>>h1;
        h1=new HashMap<>();
        int l=0;
        vertorder(root,h1,l);
        for(Map.Entry<Integer,ArrayList<Integer>> entry:h1.entrySet())
        {
            Integer key=entry.getKey();
            ArrayList<Integer> a2=entry.getValue();
            for(int i=0;i<a1.size();i++)
            {
                int f=0;
               
                for(int j=0;j<a2.size();j++)
                {
                    if(a1.get(i)==a2.get(j))
                    {
                        f=1;
                        System.out.print(a1.get(i) + " ");
                        break;
                    }
                }
                if(f==1)
                    break;
                }
           
          /* System.out.print(key + ":");
            for(Integer w:a2)
                System.out.print(w + " ");
            System.out.println();*/
        }
       // System.out.println(a1);
    }