package example2;

public class ServiceImpl implements Service {
	
	private OrderDaoImpl odao;
	private DeliveryDaoImpl ddao;
	
	public ServiceImpl() {
		System.out.println("ServiceImpl");
	}

	public OrderDaoImpl getOdao() {
		return odao;
	}

	public void setOdao(OrderDaoImpl odao) {
		this.odao = odao;
	}

	public DeliveryDaoImpl getDdao() {
		return ddao;
	}
	public void setDdao(DeliveryDaoImpl ddao) {
		this.ddao = ddao;
	}

	@Override
	public void order() {
		odao.insertOrder();
		ddao.insertAddress();
	}

	@Override
	public void remove() {
		odao.removeOrder();
		ddao.removeAddress();
	}

}
