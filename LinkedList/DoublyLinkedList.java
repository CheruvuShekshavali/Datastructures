package LinkedList;

import java.util.Scanner;

public class DoublyLinkedList 
{
	   static StructNode head;
	   static StructNode temp;
	   static int count=0;
	   static Scanner s=new Scanner(System.in);
	   public static void main(String[] args) 
	   {
		   int choice;
		   do 
		   {
			   System.out.println("Enter  your choice:");
			   System.out.println("1.Create Doubly Linked List\n2.Print\n3.Insert at Beginning\n4.Insert at Position\n5.Insert after Position\n6.Insert before Pos\n7.Insertion at End\n8.Delete at Beginning\n"
			   		+"9.Deletion_at_end\n10.deletion_pos\n11.Deletion_before_position\n12.Deletion_after_position\n13.Linear_Search\n14.Sorting Ascending order\n15.Sorting_Descending\n16.Exit\n");
			   choice=s.nextInt();
				switch(choice)
				{
					case 1: creating_DLL();
					break;
					case 2:print();
					break;
					case 3:insert_at_beg();
					break;
					case 4:insertion_pos();
					break;
					case 5:insert_after_pos();
					break;
					case 6:insert_before_pos();
					break;
					case 7:insert_at_end();
					break;
					case 8:delete_at_beg();
					break;
					case 9: delete_at_end();
					break;
					case 10:deletion_pos();
					break;
					case 11:delete_before_pos();
					break;
					case 12: delete_aft_pos();
					break;
					case 13:linear_search();
					break;
					case 14:sorting_asc();
					break;
					case 15:sorting_dec();
					break;
					case 16:System.exit(0);
					break;
					default : System.out.println("Invalid choice");
					break;
				}
			  }
		   while(choice!=0);
	   }
	   public static void creating_DLL()
	   {
		   int ch=1;
			while(ch==1)
			{
				StructNode sn= new StructNode();
				System.out.println("Enter Data:");
				sn.data=s.nextInt();
				sn.prev=null;
				sn.address=null;
				if(head==null)
				{
					head=temp=sn;
				}
				else
				{
					sn.prev=temp;
					temp.address=sn;
					temp=temp.address;
				}
				System.out.println("Do you want to continue");
				ch=s.nextInt();
			}
			System.out.println("Entered elements are:");
			temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.address;
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
				System.out.println("Entered  Elements are:");
				temp=head;
				while(temp!=null)
				{
					System.out.println(temp.data);
					temp=temp.address;
					count++;
				}
	   }
	   }
	   public static void insert_at_beg()
	   {
		   if(head==null)
		   {
			   System.out.println("Empty");
		   }
		   else
		   {
			   StructNode sn=new StructNode();
			   System.out.println("Enter data");
			   sn.data=s.nextInt();
			   sn.prev=null;
			   sn.address=null;
			   head.prev=sn;
			   sn.address=head;
			   head=sn;
		   }
		   System.out.println("Insertion at beginning is done");
	   }
	   public static void insertion_pos()
		{
			System.out.println("Enter Position:");
			int pos=s.nextInt();
			
			if(pos>count+1 || pos<1)
			{
				System.out.println("Invalid");
			}
			else if(pos==1)
			{
				insert_at_beg();
			}
			else if(pos==count)
			{
				insert_at_end();
			}
			else
			{
				StructNode sn=new StructNode();
				System.out.println("Enter the Data");
				sn.data=s.nextInt();
				sn.address=null;
				temp=head;
				int i=1;
				while(i<pos-1)
				{
					temp=temp.address;
					i++;
				}
				sn.address=temp.address;
				sn.prev=temp;
				temp.address=sn;
				sn.address.prev=sn;
				System.out.println("Insertion at position is Done\n");
			}
			System.out.println("Insertion at position is Done");
		}
	   public static void insert_before_pos()
	   {
		   System.out.println("Enter Position:");
		   int pos=s.nextInt();
		   
		   if(pos>count+2)
		   {
			   System.out.println("Invalid");
		   }
		   else if(pos==2 || pos==1)
		   {
			   insert_at_beg();
		   }
		   else if(pos==count+1)
		   {
			   insert_at_end();
		   }
		   else
		   {
			   StructNode sn=new StructNode();
			   System.out.println("Enter data");
			   sn.data=s.nextInt();
			   temp=head;
			   int i=1;
			   while(i<pos-2)
			   {
				   temp=temp.address;
				   i++;
			   }
				sn.address=temp.address;
				sn.prev=temp;
				temp.address=sn;
				sn.address.prev=sn;
		   }
		   System.out.println("Insertion before position is Done");
	   }
	   public static void insert_after_pos()
	   {
		   System.out.println("Enter Position:");
		   int pos=s.nextInt();
		   if(pos>count || pos<0)
		   {
			   System.out.println("Invalid");
		   }
		   else if(pos==0)
		   {
			   insert_at_beg();
		   }
		   else if(pos==count)
		   {
			   insert_at_end();
		   }
		   else
		   {
			   StructNode sn=new StructNode();
			   System.out.println("Enter data");
			   sn.data=s.nextInt();
			   sn.address=null;
			   sn.prev=null;
			   int i=1;
			   temp=head;
			   while(i<pos)
			   {
				   temp=temp.address;
				   i++;
			   }
				sn.address=temp.address;
				sn.prev=temp;
				temp.address=sn;
				sn.address.prev=sn;
		   }
		   System.out.println("Insertion after position is Done");
	   }
	   public static void insert_at_end()
	   {
		   if(head==null)
		   {
			   System.out.println("Empty");
		   }
		   else
		   {
			   StructNode sn=new StructNode();
			   System.out.println("Enter data");
			   sn.data=s.nextInt();
			   sn.address=null;
			   sn.prev=null;
			   temp=head;
			   while(temp.address!=null)
			   {
				   temp=temp.address;
			   }
			   sn.prev=temp;
			   temp.address=sn;
		   }
		   System.out.println("Insertion at end is Done");
	   }
	   public static void delete_at_beg()
	   {
		   if(head==null)
		   {
			   System.out.println("Empty");
		   }
		   else
		   {
			   temp=head;
			   head=head.address;
			   temp.address=null;
			   temp=null;
			   head.prev=null;
		   }
		   System.out.println("Deletion at beginning is Done");
	   }
	   public static void delete_at_end()
	   {
		   if(head==null)
		   {
			   System.out.println("Empty");
		   }
		   else
		   {
			   temp=head;
			   while(temp.address!=null)
			   {
				   temp=temp.address;
			   }
			   temp.prev.address=null;
			   temp.prev=null;
			   temp=null;
		   }
		   System.out.println("Deletion at end is Done");
	   }
	   public static void deletion_pos()
	   {
		   if(head==null)
		   {
			   System.out.println("list is empty");
		   }
		   else
		   {
			System.out.println("enter the position");
			int pos=s.nextInt();
			if(pos==1)
			{
				delete_at_beg();
			}
			else if(pos==count)
			{
				delete_at_end();
			}
			else if(pos>count||pos<1)
			{
				System.out.println("invalid position");
			}
			else
			{
				temp=head;
				
				int i=1;
				while(i<=pos)
				{
					temp=temp.address;
					i++;
				}
				temp.address.prev=temp.prev;
				temp.prev.address=temp.address;
				temp.address=null;
				temp.prev=null;
				temp=null;
			}
		   }
	   }
	   public static void delete_before_pos()
	   {
		   System.out.println("enter the position ");
		  int pos =s.nextInt();
		  if(pos==2)
		  {
			  delete_at_beg();
		  }
		  else if(pos==count+1)
		  {
			  delete_at_end();
		  }
		  else if(pos<2||pos>count+1)
		  {
			  System.out.println("invalid  position");
		  }
		  else
		  {
			  temp=head;
			  int i=1;
			  while(i<=pos-2)
			  {
				  temp=temp.address;
				  i++;
			  }
			  temp.address.prev=temp.prev;
			  temp.prev.address=temp.address;
			  temp.prev=null;
			  temp.address=null;
			  temp=null;
		  }
	   }
	   public static void delete_aft_pos()
	   {
		   System.out.println("enter the position");
		   int pos=s.nextInt();
		   if(pos==0)
		   {
			   delete_at_beg();
		   }
		   else if(pos==count-1)
		   {
			   delete_at_end();
		   }
		   else if(pos>=count||pos<0)
		   {
			   System.out.println("invalid");
		   }
		   else
		   {
			   temp=head;
			   int i=1;
			   while(i<=pos)
			   {
				   temp=temp.address;
				   i++;
			   }
			   temp.address.prev=temp.prev;
			   temp.prev.address=temp.address;
			   temp.prev=null;
			   temp.address=null;
			   temp=null;
		   }
	   }
	   public static void linear_search()
	   {
		   System.out.println("enter the element to search the element ");
		   int ele=s.nextInt();
		   temp=head;
		   int c=0;
		   if (head==null)
		   {
			   System.out.println("list is empty enter the elements");
		   }
		   else
		   {
			   while(temp!=null)
			   {
				   if(temp.data==ele)
				   {
					   System.out.println("element found");
					   c++; 
					   break;
				   }
				   else
				   {
					   temp=temp.address;
				   }
			   }
			   if(c==0)
			   {
				   System.out.println("element not found");
			   }
		   }
	   }
	   public static void sorting_asc()
	   {
		   temp=head;
		   for(StructNode i=temp;i!=null;i=i.address)
		   {
			   for(StructNode j=i.address;j!=null;j=j.address)
			   {
				   if(i.data>j.data)
				   {
					   int t=i.data;
					   i.data=j.data;
					   j.data=t;
				   }
			   }
		   }
	   }
	   public static void sorting_dec()
	   {
		   temp=head;
		   for(StructNode i=temp;i!=null;i=i.address)
		   {
			   for(StructNode j=i.address;j!=null;j=j.address)
			   {
				   if(i.data<j.data)
				   {
					   int t=i.data;
					   i.data=j.data;
					   j.data=t;
				   }
			   }
			   
		   }
	   }
}