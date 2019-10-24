package patterns.creational.builder.item.colddrink;

import patterns.creational.builder.item.Item;
import patterns.creational.builder.item.packing.Bottle;
import patterns.creational.builder.item.packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
