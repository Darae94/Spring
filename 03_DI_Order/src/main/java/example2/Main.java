package example2;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//applicationCTX.xml
		//OrderDao odao = new OrderDao();
		//DeliveryDao ddao = new DeliveryDao();
		//
		//Service service = new Service();
		//service.setOdao(odao);
		//service.setDdao(ddao);
		//
		//service.order();
		//service.remove();
		
		//Resource resource = new ClassPathResource("applicationCTX.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		// ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:applicationCTX.xml");
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		ServiceImpl service = (ServiceImpl) factory.getBean("service");
		service.order();
		service.remove();
		
	}

}
