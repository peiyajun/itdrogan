package app16;

import java.util.*;
class app16_8
{
	public static void main(String[] args)
	{
		LinkedList<Integer> llist=new LinkedList<Integer>();
		for(int i=10;i<=100;i+=10)
		{
			llist.add(i);
		}
		ListIterator<Integer> litr1=llist.listIterator();
		System.out.print("正向列出LinkedList内容：");
		while(litr1.hasNext())
			System.out.print(litr1.next()+" ");
		System.out.println();
		
		ListIterator<Integer> litr2=llist.listIterator(llist.size());
		System.out.print("反向列出LinkedList内容：");
		while(litr2.hasPrevious())
			System.out.print(litr2.previous()+" ");
		System.out.println();
	}
}
