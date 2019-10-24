package patterns.creational.builder.item;

import patterns.creational.builder.item.packing.Packing;

public interface Item {

	public String name();
	public Packing packing();
	public float price();
}
