
public class Products {
	private String brands[]={"Samsung S21                               ","Google Pixel 6                               ","I-phone 13                                ","OnePlus 9                              ","Vivo v21                                 ","Sony bravia 55 inches TV                 ","LG Washing Machine                       ","HP Laptop                              ","Onida AC                                ","Lg Double door Fridge                       ","Detergent Powder                       ","Fresh Vegetables                       ","Orange Juice                          ","Moisture Body Lotion                    ","Snacks Items                          ","Jeans Pant                            ","T-Shirts                                 ","Formal Shirts                            ","Jackets                                ","Caps                                     ","Cupboards                             ","Study Table                            ","Dining Table                            ","Book Shelf                            ","Sofa                                   ","Dan Brown                              ","Sidney Sheldon                          ","Chetan bhagat                            ","Agatha Christie                         ","Enid Blyton                            "};
	private long prices[]={69999,62999,79999,54499,26999,57499,43590,71990,28999,85999,115,50,95,256,30,1599,739,799,999,499,12999,7499,25999,6999,56999,349,270,200,180,199};
	private int id[]={11,12,13,14,15,21,22,23,24,25,31,32,33,34,35,41,42,43,44,45,51,52,53,54,55,61,62,63,64,65,};
	public String[] getBrands() {
		return brands;
	}
	public void setBrands(String[] brands) {
		this.brands = brands;
	}
	public long[] getPrices() {
		return prices;
	}
	public void setPrices(long[] prices) {
		this.prices = prices;
	}
	public int[] getId() {
		return id;
	}
	public void setId(int[] id) {
		this.id = id;
	}
}
