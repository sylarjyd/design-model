package cn.jyd.design.builder;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}

abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

}