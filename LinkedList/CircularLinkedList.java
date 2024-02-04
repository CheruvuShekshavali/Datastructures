package LinkedList;

import java.util.Scanner;

public class CircularLinkedList 
{
	   static StructNode head;
	   static StructNode temp;
	   static StructNode prevnode;
	   static Scanner s=new Scanner(System.in);
	   static int count=0;
	   static StructNode prev;
	   static StructNode temp2;
	  public static void main(String[] args) 
		{
			int choice;
			do
			{
				System.out.println("Enter  your choice:");
				System.out.println("1.Creat Circular Linked List\n2.Print\n3.Insert at beginning\n4.Insert_at_end\n5.Insert at position\n6.insert_after_position\n7.insert_before_position\n8.delete_begining\n9.delete_end\n10.delete_position\n11.delete_after_position\n12.delete_before_position\n13.searching\n14.exit\n");
				choice=s.nextInt();
				switch(choice)
				{
				case 1: creating_node();
				break;
				case 2:print();
				break;
				case 3:insertion_beg();
				break;
				case 4:insertion_end();
				break;
				case 5:insertion_at_pos();
				break;
				case 6:insertion_after_pos();
				break;
				case 7:insertion_before_pos();
				break;
				case 8:deletion_beg();
				break;
				case  9:deletion_end();
				break;
				case 10:deletion_at_pos();
				break;
				case 11:deletion_after_pos();
				break;
				case 12:deletion_before_pos();
				break;
				case 13:searching();
				break;
				case 14:System.exit(0);
				break;
				default: System.out.println("Invalid choice");
				break;
				}
			}
		while(choice!=0);
		}
	  public static void creating_node()
	  {
		  int c=1;
			while(c==1)
			{
				StructNode sn= new StructNode();
				System.out.println("Enter the data:");
				sn.data=s.nextInt();
				sn.address=null;
				if(head==null)
				{
					head=temp=sn;
					temp.address=head;
				}
				else
				{
					temp.address=sn;
					temp=temp.address;
					temp.address=head;
				}
				
				System.out.println("Enter the choice to create a node(1/0):");
				c=s.nextInt();
			}
		}
	  public static void print()
		{
			if(head==null)
			{
				System.out.println("First enter the elements");
			}
			else
			{
				System.out.println("Entered elements are:");
					temp=head;
					do
					{
						System.out.println(temp.data);
						temp=temp.address;
						count++;
					}
					while(temp!=head);
			  }
		}	
	  public static void insertion_beg()
		{
			StructNode sn=new StructNode();
			System.out.println("Enter the data:");
			sn.data=s.nextInt();
			sn.address=null;
			sn.address=head;
			head=sn;
			System.out.println("Insertion in beg is Sucessfull");
			System.out.println(sn.data);
			System.out.println("Insertion at beginning is done");
		}
	  public static void insertion_end()
	  {
		  StructNode sn =new StructNode();
		  System.out.println("enter the data");
		  sn.data=s.nextInt();
		  sn.address=null;
		  temp=sn;
		  int i =1;
		  do
		  {
			  temp=temp.address;
			  i++;
		  }
		  while(i<count-1);
		  temp.address=sn;
		  temp=null;
	  }
	  public static void insertion_at_pos()
	  {
		  System.out.println("enter the position");
		  int pos=s.nextInt();
		  if(pos==1)
		  {
			  insertion_beg();
		  }
		  else if(pos==count)
		  {
			  insertion_end();
		  }
		  else if(pos<1&&pos>count)
		  {
			  System.out.println("invalid position");
		  }
		  else {
			  System.out.println("enter the data");
			  StructNode sn=new StructNode();
			  sn.data=s.nextInt();
			  sn.address=null;
			  temp=head;
			  int i=1;
			  do
			  {
				  temp=temp.address;
				  i++;
			  }
			  while(i<pos-1);
			  sn.address=temp.address;
			  temp.address=sn;
			  temp=null;
		  }
	  }
	  public static void insertion_after_pos()
	  {
		  System.out.println("enter the position");
		  int pos=s.nextInt();
		  if(pos==0)
		  {
			  insertion_beg();
		  }
		  else if(pos==count)
		  {
			  insertion_end();
		  }
		  else if(pos<0&&pos>count)
		  {
			  System.out.println("invalid position");
		  }
		  else
		  {
			  System.out.println("enter the data");
			  StructNode sn=new StructNode();
			  sn.data=s.nextInt();
			  sn.address=null;
			  temp=head;
			  int i=1;
			  do
			  {
				  temp=temp.address;
				  i++;
			  }
			  while(i<pos);
			  sn.address=temp.address;
			  temp.address=sn;
		  }
	  }
	  public static void insertion_before_pos()
	  {
		  System.out.println("enter the position");
		  int pos=s.nextInt();
		  if(pos==2)
		  {
			  insertion_beg();
		  }
		  else if(pos==count+1)
		  {
			  insertion_end();
		  }
		  else if(pos<2&&pos>count+1)
		  {
			  System.out.println("invalid position");
		  }
		  else
		  {
			  System.out.println("enter the data");
			  StructNode sn=new StructNode();
			  sn.data=s.nextInt();
			  sn.address=null;
			  temp=head;
			  int i=1;
			  do
			  {
				  temp=temp.address;
				  i++;
			  }
			  while(i<pos-2);
			  sn.address=temp.address;
			  temp.address=sn;
			  temp=null;
		  }
	  }
	  public static void deletion_beg()
	  {
		temp=head;
		head=temp.address;
		temp.address=null;
		temp=head;
		do
		{
			temp=temp.address;
		}
		while(temp.address!=head);
		temp.address=head;
		temp=null;
	  }
	  public static void deletion_end()
	  {
		  temp=head;
		  int i=1;
		  do
		  {
			  temp=temp.address;
			  i++;
		  }
		  while(i<count-1);
		  temp.address=head;
		  temp=null;
	  }
	  public static void deletion_at_pos()
	  {
		  System.out.println("enter the postion");
		  int pos=s.nextInt();
		  if(pos==1)
		  {
			  deletion_beg();
		  }
		  else if(pos==count)
		  {
			  deletion_end();
		  }
		  else if(pos<1&&pos>count)
		  {
			  System.out.println("invalid position");
		  }
		  else
		  {
			  temp=head;
			  prevnode=null;
			  int i=1;
			  do {
				  prevnode=temp;
				  temp=temp.address;
				  i++;
			  }
			  while(i<pos);
			  prevnode.address=temp.address;
			  temp.address=null;
			  temp=null;
		  }
	  }
	  public static void deletion_after_pos()
	  {
		  System.out.println("enter the position");
		  int pos= s.nextInt();
		  if(pos==0)
		  {
			  deletion_beg();
		  }
		  else if(pos==count-1)
		  {
			  deletion_end();
		  }
		  else if(pos<0&&pos==count)
		  {
			  System.out.println("invalid position");
		  }
		  else
		  {
			  temp=head;
			  prevnode=null;
			  int i=1;
			  do
			  {
				  prevnode=temp;
				  temp=temp.address;
				  i++;
			  }
			  while(i<=pos);
			  prev.address=temp.address;
			  temp.address=null;
			  temp=null;
		  }
	  }
	  public static void deletion_before_pos()
	  {
		  System.out.println("enter the position");
		  int pos=s.nextInt();
		  if(pos==2)
		  {
			  deletion_beg();
		  }
		  else if(pos==count+1)
		  {
			  deletion_end();
		  }
		  else if(pos<2&&pos>count+1)
		  {
			  System.out.println("invalid position");
		  }
		  else
		  {
			  temp=head;
			  prevnode=null;
			  int i=1;
			  do
			  {
				  prevnode=temp;
				  temp=temp.address;
				  i++;
			  }
			  while(i<pos-2);
			  prevnode.address=temp.address;
			  temp.address=null;
			  temp=null;
		  }
	  }
	  public static void searching()
	  {
		  System.out.println("enter the element to search ");
		  int ele=s.nextInt();
		  temp=head;
		  do
		  {
			  if(temp.data==ele)
			  {
				  System.out.println("element found");
			  }
			  else
			  {
				  temp=temp.address;
			  }
		  }
		  while(temp!=head);
	  }
}
