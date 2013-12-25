package com.deepak.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {
	public static void main(String[] args) {

		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

		List<VisitableItems> items = new ArrayList<VisitableItems>();
		VisitableItems milk = new Necessity(30);
		VisitableItems vodka = new Liquor(200);
		VisitableItems cigars = new Tobacco(100);

		items.add(milk);
		items.add(vodka);
		items.add(cigars);

		for (VisitableItems item : items) {
			System.out.println(item.accept(taxCalc) + "\n");
		}

		System.out.println("TAX HOLIDAY PRICES\n");
		for (VisitableItems item : items) {
			System.out.println(item.accept(taxHolidayCalc) + "\n");
		}
	}
}