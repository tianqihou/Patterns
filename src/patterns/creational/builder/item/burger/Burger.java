package patterns.creational.builder.item.burger;

import patterns.creational.builder.item.Item;
import patterns.creational.builder.item.packing.Packing;
import patterns.creational.builder.item.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
