package Chapter02;

//7/7 01. ���� ���� ����
public class Goods { // Default ������
	public static int countOfGoods;
	private String name; // public ������ �ƹ��������� ���� ����
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {

	}

	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	public static int getCountOfGoods(){
		//price=10; ->static �޼ҵ� �ȿ����� static ������ ���� �����ϹǷ� ���� �߻�
		return countOfGoods;
	}
	public void setName(String n) {
		name = n;
	}

	// public void setName(String name){ this.name = name; }
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("[" + name + ", " + price + "," + "countSold" + countSold);
	}
	//int discountPrice = camera.calcDiscountPrice();
	Goods goods1 = new Goods("Cannon", 300000, 0, 100);
	
}