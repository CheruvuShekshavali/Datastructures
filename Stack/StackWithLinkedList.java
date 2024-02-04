package Stack;

import java.util.Scanner;

class StackWithLinkedList
{
	static Scanner s=new Scanner(System.in);
	static Node top=null,temp=null;
	public static void main(String[] args) 
	{
		int ch;
		do
		{
			System.out.println("Enter Your Choice");
			System.out.println("1.Push\n2.Pop\n3.Peak\n4.Display\n5.Is empty or not\n6.Exit\n");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:push();
				break;
				case 2:pop();
				break;
				case 3:peak();
				break;
				case 4:display();
				break;
				case 5:isemptyornot();
				break;
				case 6:System.exit(0);
				break;
				default:System.out.println("Invalid Option");
				break;
			}
		}
		while(ch!=0);
	}
	public static void push()
	{
		int choice=1;
		while(choice==1) 
		{
			Node n =new Node();
			System.out.println("Enter the data:");
			n.data=s.nextInt();
			n.address=top;
			top=n;
			System.out.println("do u need to continue");
			choice=s.nextInt();
		}	
	}
	public static void pop()
	{
		int choice=1;
		while(choice==1)
		{
			if(top==null)
			{
				System.out.println("Stack is underflow");
				break;
			}
			else
			{
				temp=top;
				top=top.address;
				System.out.println("Deleted element is:"+temp.data);
				temp=null;
				System.out.println("enter the choice to continue");
				choice=s.nextInt();
			}
		}
	}
	public static void peak()
	{
		System.out.println(top.data+"  is the peak element");
	}
	public static void display()
	{
		temp=top;
		while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.address;
			}
	}
	public static void isemptyornot()
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}
}

