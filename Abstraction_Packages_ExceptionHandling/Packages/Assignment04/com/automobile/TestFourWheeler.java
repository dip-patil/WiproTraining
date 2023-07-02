package com.automobile;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class TestFourWheeler {

	public static void main(String[] args) {

		Ford ford = new Ford("Ford Ecosport", "MH18BC2017", "Dip Patil", 140);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.speed() + " kmph");
		ford.tempControl();

		System.out.println();

		Logan logan = new Logan("Mahindra Logan", "MH19DQ7246", "Tejas Patil", 150);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.speed() + " kmph");
		logan.gps();
	}

}
