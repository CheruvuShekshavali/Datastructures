package LinkedList;



import java.util.Scanner;

public class SinglyLinkedList 
{
	static StructNode head;
   static StructNode temp;
   static Scanner s=new Scanner(System.in);
   static int count=0;
   static StructNode prev;
  static StructNode temp2;
  static StructNode temp3;
  static StructNode prevnode;
  static StructNode revnode;
	public static void main(String[] args) 
	{
		int choice;
		do
		{
			System.out.println("Enter  your choice:");
			System.out.println("1.Creat Singly Linked List\n2.Print\n3.Insert at beginning\n4.Insertion at Position\n5.Inster after Position\n6:Insert before Position\n7.Insert at End\n8.Delete at Beginning\n9.Delete at Position\n10.Delete after Position\n11.Delete at End\n12.Delete before Position\n13.Linear Search\n14.Ascending_Sort\n15.Descending_Sort\n16.Reversing\n17.Swapping Duplicate elements\n18.Binary Search\n19.Exit\n");
			choice=s.nextInt();
			switch(choice)
			{
			case 1: creating_node();
			break;
			case 2:print();
			break;
			case 3: insertion_beg();
			break;
			case 4: insertion_pos();
			break;
			case 5:insert_after_pos();
			break;
			case 6:insert_before_pos();
			break;
			case 7:insert_at_end();
			break;
			case 8:deletion_at_beg();
			break;
			case 9:deletion_at_pos();
			break;
			case 10:deletion_after_pos();
			break;
			case 11:deletion_at_end();
			break;
			case 12:deletion_before_pos();
			break;
			case 13:linear_search();
			break;
			case 14:asc_sort();
			break;
			case 15:des_sort();
			break;
			case 16:reversing();
			break;
			case 17:swapping_dup_ele();
			break;
			case 18:binary_search();
			break;
			case 19: System.exit(0);
			break;
			default : System.out.println("Invalid choice");
			break;
			}
		}
		while(choice!=0);
	}
	public static void creating_node()
	{
		int ch=1;
		while(ch==1)
			{
				StructNode sn= new StructNode();
				System.out.println("Enter Data:");
				sn.data=s.nextInt();
				sn.address=null;
				if(head==null)
				{
					head=temp=sn;
				}
				else
				{
					temp.address=sn;
					temp=sn;
				}
				System.out.println("Enter choice (1.tocontinue /0.to stop):");
				ch=s.nextInt();
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
				print();
			}
		public static void insertion_pos()
		{
			System.out.println("Enter Position:");
			int pos=s.nextInt();
			int i=1;
			if(pos>count||pos<1)
			{
				System.out.println("Invalid");
			}
			else if(pos==1)
			{
				insertion_beg();
			}
			else
			{
				StructNode sn=new StructNode();
				System.out.println("Enter the Data");
				sn.data=s.nextInt();
				sn.address=null;
				temp=head;
				while(i<pos-1)
				{
					temp=temp.address;
					i++;
				}
				sn.address=temp.address;
				temp.address=sn;
				System.out.println("Insertion at position is Done\n");
				
			}
		}
		public static void insert_after_pos()
		{
			System.out.println("Enter Position:");
			int pos=s.nextInt();
			int i=1;
			if(pos>=count||pos<0)
			{
				System.out.println("Invalid");
			}
			else if(pos==0)
			{
				insertion_beg();
			}
			else
			{
				StructNode sn=new StructNode();
				System.out.println("Enter the Data");
				sn.data=s.nextInt();
				sn.address=null;
				temp=head;
				while(i<=pos-1)
				{
					temp=temp.address;
					i++;
				}
				sn.address=temp.address;
				temp.address=sn;
				System.out.println("Insertion after position in Done\n");
		}
		}
			public static void insert_before_pos()
			{
				System.out.println("Enter Position:");
				int pos=s.nextInt();
				int i=1;
				if(pos>=count+3 || pos<2)
				{
					System.out.println("Invalid\n");
				}
				else if(pos==2 || pos==1)
				{
					insertion_beg();
				}
				else if(pos==count+2)
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
					while(i<pos-2)
					{
						temp=temp.address;
						i++;
					}
					sn.address=temp.address;
					temp.address=sn;
					System.out.println("Insertion before position is Done\n");
				}
			}
			public static void insert_at_end()
			{
				StructNode sn=new StructNode();
				System.out.println("Enter the Data:");
				sn.data=s.nextInt();
				sn.address=null;
				temp=head;
				while(temp.address!=null)
				{
					temp=temp.address;
				}
				temp.address=sn;
				System.out.println("Insertion at end is Done\n");
			}
			public static void deletion_at_beg()
			{
				if(head==null)
				{
					System.out.println("create the nodes first\n");
				}
				else
				{
					temp=head;
					head=head.address;
					temp.address=null;
					temp=null;
				}
				System.out.println("Deletion at beginning is done\n");
				
			}
			public static void deletion_at_pos()
			{
				System.out.println("Enter the position to delete:");
				int pos=s.nextInt();
			
				if(head==null)
				{
					System.out.println("list is empty");
				}
				else if(pos==1)
				{
					deletion_at_beg();
				}
				else if(pos>count)
				{
					System.out.println("Invalid Position\n");
				}
				else if(pos==count)
				{
					deletion_at_end();
				}
				else
				{
					int i=1;
					temp=head;
					while(i<pos)
					{
						prev=temp;
						temp=temp.address;
						i++;
					}
					prev.address=temp.address;
					temp.address=null;
					temp=null;
				}
				System.out.println("Deletion at position is done\n");
			}
			public static void deletion_after_pos()
			{
				System.out.println("Enter the position to delete next node of the given position:");
				int pos=s.nextInt();
				if(head==null)
				{
					System.out.println("list is empty");
				}
				else if(pos==0)
				{
					deletion_at_beg();
				}
				else if(pos>=count)
				{
					System.out.println("Invalid Position\n");
				}
				else if(pos==count-1)
				{
					deletion_at_end();
				}
				else
				{
					int i=1;
					temp=head;
					while(i<pos+1)
					{
						prev=temp;
						temp=temp.address;
						i++;
					}
					prev.address=temp.address;
					temp.address=null;
					temp=null;
				}
				System.out.println("Deletion after position is done\n");
			}
			public static void deletion_at_end()
			{
				if(head==null)
				{
					System.out.println("list is empty");
				}
				else
				{
					temp=head;
					int i=1;
					while(i<count-1)
					{
						temp=temp.address;
						i++;
					}
					temp.address=null;
					temp=null;
				}
				System.out.println("Deletion at end is done\n");
			}
			public static void deletion_before_pos()
			{
				System.out.println("Enter the position to delete previous node of the given position:");
				int pos=s.nextInt();
				if(head==null)
				{
					System.out.println("list is empty");
				}
				else if(pos==2)
				{
					deletion_at_beg(); 
				}
				else if(pos==count+1)
				{
					deletion_at_end();
				}
				else if(pos<=1 || pos>count+1)
				{
					System.out.println("Invalid Position");
				}
				else
				{
					int i=1;
					temp=head;
					while(i<pos-1)
					{
						prev=temp;
						temp=temp.address;
						i++;
					}
					prev.address=temp.address;
					temp.address=null;
					temp=null;
				}
				System.out.println("Deletion before position is done\n");
			}
			public static void linear_search()
			{
				System.out.println("Enter the Element:");
				int ele=s.nextInt();
				int count1=0;
				temp=head;
				if(head==null)
				{
					System.out.println("Create List\n");
				}
				else
				{
					while(temp!=null)
					{
						if(temp.data==ele) 
						{
							System.out.println("Element Found\n");
							count1++;
							break;
						}
						temp=temp.address;
					}
					if(count1==0)
					{
						System.out.println("Element not found\n");
					}
				}
		
			}
			public static void asc_sort()
			{
				temp=head;
				for(temp=head ;temp!=null;temp=temp.address)
				{
					for(temp2=temp.address;temp2!=null;temp2=temp2.address)
					{
						if(temp.data>temp2.data)
						{
							int temp3=temp.data;
							temp.data=temp2.data;
							temp2.data=temp3;
						}
					}
				}
			}
			public static void des_sort()
			{
				temp=head;
				for(temp=head ;temp!=null;temp=temp.address)
				{
					for(temp2=temp.address;temp2!=null;temp2=temp2.address)
					{
						if(temp.data<temp2.data)
						{
							int temp3=temp.data;
							temp.data=temp2.data;
							temp2.data=temp3;
						}
					}
				}
			}
			public static void reversing()
			{
				prevnode=null;
				temp=head;
				revnode=head;
				while(temp!=null)
				{
					temp=temp.address;
					revnode.address=prevnode;
					prevnode=revnode;
					revnode=temp;
				}
				head=prevnode;
				System.out.println("Reversing is Done\n");
			}
			public static void swapping_dup_ele()
			{
				if(head==null)
				{
					System.out.println("First Create List");
				}
				else
				{
					System.out.println("Enter 1st Position:");
					int pos1=s.nextInt();
					System.out.println("Enter 2nd Position:");
					int pos2=s.nextInt();
					if(pos1==pos2)
					{
						System.out.println("Swapping is not required");
					}
					else if(pos1<1 || pos1>count || pos2<1 || pos2>count )
					{
						System.out.println("Invalid Position");
					}
					else 
					{
						StructNode prevnode1=null,prevnode2=null,datanode1=head,datanode2=head;
						int count1=1,count2=1;
						while(datanode1!=null && count1!=pos1)
						{
							count1++;
							prevnode1=datanode1;
							datanode1=datanode1.address;
						}
						while(datanode2!=null && count2!=pos2)
						{
							count2++;
							prevnode2=datanode2;
							datanode2=datanode2.address;
						}
						if(datanode1!=null && datanode2!=null)
						{
							if(prevnode1!=null)
								prevnode1.address=datanode2;
							else
								head=datanode2;
							if(prevnode2!=null)
								prevnode2.address=datanode1;
							else
								head=datanode1;
						temp=datanode2.address;
						datanode2.address=datanode1.address;
						datanode1.address=temp;
					}	
				}
			}
				System.out.println("Swapping is Done\n");
		}

			public static void binary_search()
			{
				asc_sort();
				int count=0;
				System.out.println("enter element to be searched");
				int ele=s.nextInt();
				temp=head;
				while(temp!=null)
				{
					temp=temp.address;
					count++;
				}
				int l=1;
				int r=count;
				int mid=0;
				int foundcount=0;
				while(l<=r)
				{
					mid=(l+r)/2;
					int count3=1;
					temp3=head;
					while(count3<mid)
					{
						temp3=temp3.address;
						count3++;
					}
					if(ele==temp3.data)
					{
						System.out.println("element found at Node : "+l);
						foundcount++;
						break;
					}
					else if(ele>temp3.data)
					{
						l=mid+1;
					}
					else
					{
						r=mid-1;
					}
				}
				if(foundcount==0)
				{
					System.out.println("element not found");
				}
			}
}
