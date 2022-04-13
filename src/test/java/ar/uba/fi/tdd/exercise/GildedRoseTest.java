package ar.uba.fi.tdd.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GildedRoseTest {


	@Test
	public void backstagePasses() {
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 4) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(6).isEqualTo(app.items[0].quality);
	}

	@Test
	public void backstagePasses_SellIn_5_Dias() {
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 4) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(7).isEqualTo(app.items[0].quality);
	}

	@Test
	public void backstagePassesPasadoConcierto() {
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 4) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(0).isEqualTo(app.items[0].quality);
	}

	@Test
	public void backstagePassesNoSuperaCalidad50() {
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(50).isEqualTo(app.items[0].quality);
	}




	@Test
	public void agedBrieNoSuperaCalidad50() {
		Item[] items = new Item[] { new Item("Aged Brie", 49, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
	}

	@Test
	public void agedBrie() {
		Item[] items = new Item[] { new Item("Aged Brie", 49, 4) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(5).isEqualTo(app.items[0].quality);
	}

	@Test
	public void sulfuras() {
		Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 49, 80) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(80).isEqualTo(app.items[0].quality);
	}

	@Test
	public void conjured() {
		Item[] items = new Item[] { new Item("conjured", 49, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(48).isEqualTo(app.items[0].quality);
	}

	@Test
	public void conjuredPasadoFechaDeVencimiento() {
		Item[] items = new Item[] { new Item("conjured", -1, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(46).isEqualTo(app.items[0].quality);
	}

	@Test
	public void articuloNormal() {
		Item[] items = new Item[] { new Item("normal", 49, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(49).isEqualTo(app.items[0].quality);
	}

	@Test
	public void articuloNormalPasadoFechaDeVencimiento() {
		Item[] items = new Item[] { new Item("normal", -1, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(48).isEqualTo(app.items[0].quality);
	}







}
