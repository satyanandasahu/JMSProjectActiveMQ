package com.example.jmsReceiver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("recieverContext.xml");
    	MessageReciever messageReciever = (MessageReciever) applicationContext.getBean("messageReceiver");
        System.out.println(messageReciever);
    }
}
