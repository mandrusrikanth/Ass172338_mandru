package SpringAopCreated;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
    	Shape ss=(Shape) context.getBean("shape");
    	System.out.println(ss.getCircle().getName());
    	System.out.println(ss.getTriangle().getName());
    }
}
