package com.noir;
import com.noir.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {   // Java Based Config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

        //Desktop dt = context.getBean("desktop",Desktop.class);
//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop",Desktop.class);
//        dt1.compile();


        // XML Config
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = context.getBean("alien1", Alien.class);
//        obj1.setAge(22);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj2.code();

    }
}
