package Chapter02;

//7/7 02. ��ü�������α׷��ǽ� (���۷���)
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods(); // ��ü�� ���۷��� �ϴ� ���� : ���۷��� ����
		// camera.name = "nikon";
		camera.setName("nikon");	//���� �������� ������ ���� �޼ҵ�� public���� ��ȯ
		// camera.price=400000;
		camera.setPrice(-1);
		// camera.countStock=30;
		camera.setCountStock(30);
		// camera.countSold=50;
		camera.setCountSold(10);
		
		
		
		System.out.println(Goods.countOfGoods);
		
		System.out.println(camera.getName());
		
		String str = camera.toString();
		System.out.println(str);
		
		System.out.println(camera);
		System.out.println(Goods.getCountOfGoods());
	}
}