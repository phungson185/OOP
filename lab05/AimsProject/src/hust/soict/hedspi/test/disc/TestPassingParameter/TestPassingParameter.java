package hust.soict.hedspi.test.disc.TestPassingParameter;

import hust.soict.hedspi.aims.DVDWrapper.DVDWrapper;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		DVDWrapper dvdWrapper1 = new DVDWrapper(jungleDVD);
		DVDWrapper dvdWrapper2 = new DVDWrapper(cinderellaDVD);

		swap(dvdWrapper1, dvdWrapper2);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	public static void swap(DVDWrapper dvdWrapper1, DVDWrapper dvdWrapper2) {
		DigitalVideoDisc digitalVideoDisc = dvdWrapper1.digitalVideoDisc;
		dvdWrapper1.digitalVideoDisc = dvdWrapper2.digitalVideoDisc;
		dvdWrapper2.digitalVideoDisc = digitalVideoDisc;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
