package handson3autowire;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
 
@SuppressWarnings("resource") 

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("handson3autowire/ApplicationContext.xml"); 
		Student1 s = (Student1)context.getBean("student"); 
		s.displayProfile(); 

	}

}
