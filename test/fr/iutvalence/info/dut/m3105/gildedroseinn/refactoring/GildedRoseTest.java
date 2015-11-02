package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void itemsQualityAndSellInDeacreasePerDayTest()
	{
		Item item = new Item("tata",10,15);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),9);
		assertEquals(item.getQuality(),14);
	}
	
	@Test
	public void ifSellInInfZeroThenSellInDecreaseByOneAndQualityDecreaseByTwoPerDay()
	{
		Item item = new Item("toto",-25,16);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),-26);
		assertEquals(item.getQuality(),14);
	}
	
	@Test
	public void ifQualityUpperOrEqualThanZero()
	{
		Item item = new Item("titi",5,3);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(),0);
	}
	
}


