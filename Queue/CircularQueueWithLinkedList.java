package Queue;

import java.util.Scanner;

class StrNode
{
	int data;
	StrNode address;
}
public class CircularQueueWithLinkedList
{
	static StrNode front=null;
	static StrNode rear=null;
	static StrNode  temp=null;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch=1;
		do
		{
			System.out.println("Enter Your Choice:");
			System.out.println("1.Enqueue\n2.Dequeue\n3.peak\n4.Display\n5.Empty or not\n6.Exit\n");
			 ch=s.nextInt();
			switch(ch)
			{
			case 1:enqueue();
			break;
			case 2:dequeue();
			break;
			case 3:peak();
			break;
			case 4:display();
			break;
			case 5:isempty();
			break;
			case 6:System.exit(0);
			break;
			default:System.out.println("Enter Valid Option");
			}
		}
		while(ch!=0);
	}
	public static void enqueue() 
	{
		int ch=1;
		while(ch==1)
		{
			StrNode n=new StrNode();
			System.out.println("Enter the data:");
			n.data=s.nextInt();
			n.address=null;
			if(front==null && rear==null)
			{				
				front=rear=n;
				rear.address=front;
			}
			else
			{
				rear.address=n;
				rear=n;
				rear.address=front;
			}
			System.out.println("do you want to continue");
			ch=s.nextInt();
		}
	}
	public static void dequeue()
	{
		//temp=front;	
		int ch=1;
		while(ch==1)
		{
			if(front==null && rear==null)
			{
				System.out.println("Queue is UnderFlow");
				break;
			}
			else if(front==rear)
			{
				System.out.println("Deleted element is:"+front.data);
				front=rear=null;
			}
			else
			{
				temp=front;
				System.out.println("Deleted element is:"+temp.data);
				front=front.address;
				rear.address=front;
				temp.address=null;
				//temp.data=0;
				temp=null;
			}
			System.out.println("do you want to continue");
			ch=s.nextInt();
		}	
	}
	public static void peak()
	{
		System.out.println(front.data);
	}
	public static void display()
	{
		if(front==null && rear==null)
			System.out.println("Queue is UnderFlow");
		else
		{
			temp=front;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.address;
			}
		}
	}
	public static void isempty()
	{
		if(front==null && rear==null)
			System.out.println("Queue is empty");
		else
			System.out.println("Not Empty");
	}
}

