package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestTwoWheeler {

	public static void main(String[] args) {

		Hero hero = new Hero("Hero Splender", "MH19DQ7246", "Dip Patil", 80);
		System.out.println(hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed() + " kmph");
		hero.radio();

		System.out.println();

		Honda honda = new Honda("Honda Shine", "MH18BC2017", "Tejas Patil", 100);
		System.out.println(honda.getModelName());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getSpeed() + " kmph");
		honda.cdplayer();
	}

}
