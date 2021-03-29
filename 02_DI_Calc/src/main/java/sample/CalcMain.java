package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CalcMain {

	public static void main(String[] args) {

		/*
		 * CalcBeanImpl cb = new CalcBeanImpl(5); cb.setSu1(14);
		 */
		
		Resource resource = new ClassPathResource("applicationCalc.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		CalcBeanImpl cb = (CalcBeanImpl) factory.getBean("cb");
		
		cb.calculate();
		
		//MessageBeanImpl msg = new MessageBeanImpl("À±¾Æ");
		//msg.setGreeting("¾È³ç");
		MessageBeanImpl msg = (MessageBeanImpl) factory.getBean("msg");
		
		msg.sayHello();
		
	}

}
