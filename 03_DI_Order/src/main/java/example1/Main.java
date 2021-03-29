package example1;

public class Main {

	public static void main(String[] args) {
		OrderDao odao = new OrderDao();
		DeliveryDao ddao = new DeliveryDao();
		
		Service service = new Service();
		service.setOdao(odao);
		service.setDdao(ddao);
		
		service.order();
		service.remove();
	}

}
