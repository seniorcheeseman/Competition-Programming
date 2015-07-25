package uvaProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Uva122 {

	public static class Tree{
		public  Tree left=null;
		public  Tree right=null;
		int value = -1;
		public Tree(int v){value= v;}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			Tree head = new Tree(-1);
			boolean failed = false;
			while(true)
			{
			String node = input.next();
			node =node.replaceAll("[()]", "");
			String[] parts = node.split(",");
			if(parts[0].length()==0)
			{
				String result= "";
				Queue<Tree> traversal = new LinkedList<Tree>();
				if(head.value==-1){
					System.out.println("not complete");
					break;
				}
				else
				{
					result= Integer.toString(head.value);
					if(head.left!=null)traversal.add(head.left);
					if(head.right!=null)traversal.add(head.right);
				
				while(!traversal.isEmpty()){
					Tree temp = traversal.remove();
					if(temp.left!=null)traversal.add(temp.left);
					if(temp.right!=null)traversal.add(temp.right);
					if(temp.value==-1){
						result = "not complete";
						break;
					}
					result += " " + Integer.toString(temp.value);
				}
				if(!failed)
				System.out.println(result);
				else System.out.println("not complete");
				break;
				}
			}
			else if(parts.length==1)
			{
				head.value = Integer.parseInt(parts[0]);
			}
			else
			{
				Tree leaf = head;
				for(int x=0; x<parts[1].length();x++)
				{
					char temp = parts[1].charAt(x);
					if(temp=='L')
					{
						if(leaf.left==null)
						leaf.left = new Tree(-1);
						
						leaf = leaf.left;
					}
					else if(temp=='R')
					{
						if(leaf.right == null)
						leaf.right= new Tree(-1);
						leaf = leaf.right;
					}
				}
				if(leaf.value==-1)
					leaf.value = Integer.parseInt(parts[0]);
				else{
					failed = true;
				}
			}
			}
		}
		
	}

}
