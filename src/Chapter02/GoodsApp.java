package Chapter02;

//7/7 02. 객체지향프로그램실습 (레퍼런스)
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods(); // 객체를 레퍼런스 하는 변수 : 레퍼런스 변수
		// camera.name = "nikon";
		camera.setName("nikon");	//내부 데이터의 접근을 위한 메소드는 public으로 소환
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