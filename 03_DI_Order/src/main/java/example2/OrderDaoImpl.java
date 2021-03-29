package example2;

public class OrderDaoImpl implements OrderDao {

	public OrderDaoImpl() {
		System.out.println("OrderDaoImpl");
	}
	
	@Override
	public void insertOrder() {
		System.out.println("주문 정보 추가: insertOrder");
	}

	@Override
	public void removeOrder() {
		System.out.println("주문 정보 삭제: removeOrder");
	}

}
