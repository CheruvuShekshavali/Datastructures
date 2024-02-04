package Queue;

import java.util.Scanner;

public class CircularQueueWithArray
{
	static int queue[]=new int[100];
	static int rear=-1,front=-1;
	static int size;
	static int temp1=0,temp2=0;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch=1;
		System.out.println("Enter the size");
		size=s.nextInt();
		do
		{
			System.out.println("Enter Your Choice:");
			System.out.println("1.Enqueue\n2.Dequeue\n3.Peak\n4.Display\n5.Empty or not\n6.Full or not\n7.Exit\n");
			 ch=s.nextInt();
			switch(ch)
			{
			case 1:enqueue();
			break;
			case 2: dequeue();
			break;
			case 3:peak();
			break;
			case 4: display();
			break;
			case 5: empty();
			break;
			case 6: full();
			break;
			case 7:System.exit(0);
			break;
			default:System.out.println("invalid option");
			break;
			}
		}
		while(ch!=0);
	}
	public static void enqueue()
	{
		int ch=1;
		while(ch==1)
		{
			if(((rear+1)%size)==front)
			{
				System.out.println("Queue is overflow");
				break;
			}
			else if(rear==-1 && front==-1)
			{
				front=rear=0;
				System.out.println("Enter the data:");
				queue[rear]=s.nextInt();
			}
			else
			{
				rear=((rear+1)%size);
				System.out.println("Enter the data:");
				queue[rear]=s.nextInt();
			}
			System.out.println("Do you want to continue (1/0)");
			ch=s.nextInt();
			
		}
	}
	public static void dequeue()
	{
		int ch=1;
		while(ch==1) {
		if(front==-1&&rear==-1)
		{
			System.out.println("Queue  is underflow\n");
			break;
		}
		else if(front==rear)
		{
			System.out.println("deleted element is:"+queue[front]);
			front=rear=-1;
		}
		else
		{
			System.out.println("deleted element is:"+queue[front]);
			front=((front+1)%size);
		}
		System.out.println("enter the choice do you want to continue:");
		ch=s.nextInt();
		}
	}
	public static void peak()
	{
		System.out.println("the peak element in the queue is:"+queue[front]);
	}
	public static void display()
	{
		System.out.println("The Elements in the queue are:");
		int i=front;
		while(i!=rear)
		{
			System.out.println(queue[i]);
			i=((i+1)%size);
		}
		System.out.println(queue[rear]);
	}
	public static void empty()
	{
		if(front==-1||rear==-1)
		{
			System.out.println("is empty");
		}
		else
		{
			System.out.println("not empty");
		}
	}
	public static void full()
	{
		if(((rear+1)%size)==front)
		{
			System.out.println("queue is full");
		}
		else
		{
			System.out.println("queue is not full still have some space in it");
		}
	}
}