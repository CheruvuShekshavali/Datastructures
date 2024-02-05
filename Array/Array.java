package Array;

import java.util.Scanner;

public class Array {

	static Scanner s = new Scanner(System.in);
	static int size;
	static int a[] = new int[100];

	public static void main(String[] args) {
		int ch;
		System.out.println("Enter the size:");
		size = s.nextInt();
		do {
			System.out.println("Enter Your Choice");
			System.out.println(
					"1.Push\n2.Pop\n3.Peak\n4.Display\n5.Insert at any Position\n6.Insert at beginning\n7.Insert at ending\n8.Delete at beginning\n9.Delete at ending\n10.Sort\n11.Sort In Descending Order\n12.Exit");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				peak();
				break;
			case 4:
				display();
				break;
			case 5:
				insert_at_position();
				break;
			case 6:
				insert_at_beginning();
				break;
			case 7:
				insert_at_ending();
				break;
			case 8:
				deletion_at_beginning();
				break;
			case 9:
				deletion_at_ending();
				break;
			case 10:
				sort();
				break;
			case 11:
				sort_in_descending_order();
				break;
			case 12:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		} while (ch != 0);
	}

	public static void push() {
		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array elements  are Pushed into the Array!");
	}

	public static void pop() {

		System.out.println("Position to delete:");
		int pos = s.nextInt();
		int temp = a[pos - 1];
		if (pos > size || pos < 0) {
			System.out.println("Invalid Position");
		} else {
			for (int j = pos - 1; j < size - 1; j++) {
				a[j] = a[j + 1];
			}
			size--;
		}

		System.out.println(temp + " is deleted from the position " + pos);

	}

	public static void peak() {
		System.out.println(a[0] + " is the peak element");
	}

	public static void display() {
		System.out.println("Array elements are:");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}

	public static void insert_at_position() {
		System.out.println("Array position to insert:");
		int pos = s.nextInt();
		System.out.println("Enter the data:");
		int data = s.nextInt();
		for (int j = size - 1; j >= pos - 1; j--) {
			a[j + 1] = a[j];
		}
		a[pos - 1] = data;
		size++;
		System.out.println(data + "  is inserted at  Position" + pos);
	}

	public static void insert_at_beginning() {
		System.out.println("Enter the data to insert at beginning:");
		int data = s.nextInt();
		for (int j = size - 1; j >= 0; j--) {
			a[j + 1] = a[j];
		}
		a[0] = data;
		size++;
		System.out.println(data + " is inserted at Peak");
	}

	public static void insert_at_ending() {
		System.out.println("Enter the data to insert at the end of array:");
		int data = s.nextInt();
		a[size] = data;
		size++;
		System.out.println(data + "  is inserted at the end of array");
	}

	public static void deletion_at_beginning() {
		int temp = a[0];
		for (int j = 0; j < size - 1; j++) {
			a[j] = a[j + 1];
		}
		size--;
		System.out.println("Peak element " + temp + " is Deleted");
	}

	public static void deletion_at_ending() {
		System.out.println("Least Element " + a[size - 1] + " is deleted");
		for (int i = 0; i < size - 1; i++) {
			System.out.println(a[i]);
		}
	}

	public static void sort() {
		for (int i = 0; i < size - 1; i++) {
			int count = 0;
			for (int j = 0; j < size - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
		System.out.println("Sorted In Ascending Order!");
		System.out.println("Array elements after sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}

	public static void sort_in_descending_order() {
		for (int i = 0; i < size - 1; i++) {
			int count = 0;
			for (int j = 0; j < size - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
		System.out.println("Sorted In Decending Order!");
		System.out.println("Array elements after sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}
}
