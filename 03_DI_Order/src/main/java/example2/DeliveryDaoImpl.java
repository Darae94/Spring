package example2;

public class DeliveryDaoImpl implements DeliveryDao {

	public DeliveryDaoImpl() {
		System.out.println("DeliveryDaoImpl");
	}
	
	@Override
	public void insertAddress() {
		System.out.println("배달 주소 추가: insertAddress");
	}

	@Override
	public void removeAddress() {
		System.out.println("배달 주소 삭제: removeAddress");
	}

}
