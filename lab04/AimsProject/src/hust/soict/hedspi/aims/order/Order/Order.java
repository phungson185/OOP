package hust.soict.hedspi.aims.order.Order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;

	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered = 0;
	private float ttCost;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered++] = disc;
			System.out.printf("The disc %s has been added.\n", disc.getTitle());
		} else
			System.out.println("The order is almost full.");
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered > 0) {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					for (int j = i; j < qtyOrdered - 1; j++)
						itemsOrdered[j] = itemsOrdered[j + 1];
					itemsOrdered[--qtyOrdered] = null;
					break;
				}
			}
			System.out.printf("The disc %s has been removed.\n", disc.getTitle());
		} else
			System.out.println("The order is almost empty.");
	}

	public float totalCost() {
		ttCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			ttCost += itemsOrdered[i].getCost();
		}
		return ttCost;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist) {
		for (DigitalVideoDisc dvdlist1 : dvdlist) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				this.itemsOrdered[this.qtyOrdered++] = dvdlist1;
				System.out.printf("The disc %s has been added.\n", dvdlist1.getTitle());
			} else {
				System.out.printf("The disc %s cannot be added. The order is almost full.\n", dvdlist1.getTitle());
			}
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
			this.itemsOrdered[this.qtyOrdered++] = dvd1;
			this.itemsOrdered[this.qtyOrdered++] = dvd2;
			System.out.printf("The disc %s has been added.\n", dvd1.getTitle());
			System.out.printf("The disc %s has been added.\n", dvd2.getTitle());
		} else if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered++] = dvd1;
			System.out.printf("The disc %s has been added.\n", dvd1.getTitle());
			System.out.printf("The disc %s cannot be added.\n", dvd2.getTitle());
		} else
			System.out.println("The order is almost full.");
	}

	public void printOrdered() {
		System.out.println("***********************Order***********************");
		System.out.print("Date: ");
		MyDate myDate = new MyDate();
		myDate.print();
		System.out.print("\nOrdered Items:\n");

		for (int i = 0; i < qtyOrdered; i++) {
			System.out.printf(
					"%d. DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
							+ itemsOrdered[i].getDirector() + " - %d: %.2f $\n",
					i, itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
		}
		System.out.printf("Total cost: %.2f\n", totalCost());
		System.out.println("***************************************************");
	}
}