package Stack;

import java.util.Scanner;

class StackWithArray 
{
	static Scanner s=new Scanner(System.in);
	static int size;
	static int top=-1;
	static int stack[]=new int[100];
	public static void main(String[] args) 
	{
		int ch;
		System.out.println("Enter the size:");
		size=s.nextInt();
		do
		{
			System.out.println("Enter Your Choice");
			System.out.println("1.Push\n2.Pop\n3.Peak\n4.Display\n5.Is empty or not\n6.Is full or not\n7.Exit\n");
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
				case 6:isfullornot();
				break;
				case 7:System.exit(0);
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
			System.out.println("Enter the element:");
			int data=s.nextInt();
				if(top>=size-1)
				{	
					System.out.println("Stack Overflow");
					break;
				}
				else
				{
					top++;
					stack[top]=data;
					System.out.println("Data is Inserted");
				}
				System.out.println("do u need to continue(1/0)");
				choice=s.nextInt();
		}
	}
	
	public static void pop()
	{
		int choice=1;
		while(choice==1)
		{
		if(top<0)
		{
			System.out.println("Stack is Underflow");
			System.out.println("Enter the elements first");
			break;
		}
		else
		{
			System.out.println("Deleted element is:"+stack[top]);
			top--;
		}
		System.out.println("enter the choice to continue");
		choice=s.nextInt();
		}
	}
	public static void peak()
	{
		System.out.println(stack[top]+" is the peak element");
	}
	public static void display()
	{
		System.out.println("the elements in the stack are :");
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}
	public static void isemptyornot()
	{
		if(top<0)
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}
	public static void isfullornot()
	{
		if(top>=size-1)
			System.out.println("Stack is full");
		else
			System.out.println("Stack is not full");
	}
}