package com.example.jmsSender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String jsonString = "{\r\n"
    			+ "  \"firstName\": \"Test JMS & REST 0\",\r\n"
    			+ "  \"lastName\": \"Test JMS & REST API 0\",\r\n"
    			+ "  \"middleName\": \"JMS & REST 0\",\r\n"
    			+ "  \"age\": 44,\r\n"
    			+ "  \"gender\": \"Male\",\r\n"
    			+ "  \"address\": [\r\n"
    			+ "    {\r\n"
    			+ "      \"addressLine1\": \"Test JMS & REST 1 0\",\r\n"
    			+ "      \"addressLine2\": \"Test JMS & REST 2 0\",\r\n"
    			+ "      \"pinZipcode\": \"89327480\",\r\n"
    			+ "      \"country\": \"JMS0\",\r\n"
    			+ "      \"city\": \"REST0\",\r\n"
    			+ "      \"districtCounty\": \"API0\",\r\n"
    			+ "      \"addressType\": \"Permanent\",\r\n"
    			+ "      \"state\": \"JMSREST0\"\r\n"
    			+ "    }\r\n"
    			+ "  ]\r\n"
    			+ "}";
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("senderContext.xml");
    	JmsTemplate jmsTemplate = (JmsTemplate)applicationContext.getBean("jmsTemplate");
    	MessageCreator messageCreator = new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(jsonString);
			}
		}; 
    	
    	jmsTemplate.send(messageCreator);
        System.out.println( "Message Send" );
    }
}
