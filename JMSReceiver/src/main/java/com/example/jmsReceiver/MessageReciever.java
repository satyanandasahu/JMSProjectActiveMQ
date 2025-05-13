package com.example.jmsReceiver;

import com.example.restClient.PIRestClient;
import com.example.satya.vo.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

public class MessageReciever implements MessageListener {

	private PIRestClient piRestClient = null;
	
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		try {
			String jsonString = message.getBody(String.class);
			System.out.println("message: ========== " + jsonString);
			String personid = piRestClient.createPerson(createObjectFromJson(jsonString));
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Person createObjectFromJson(String jsonString) {
		Person person = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            person = mapper.readValue(jsonString, Person.class);
        } catch(JsonProcessingException e){
		// TODO: handle exception
        	e.printStackTrace();
        }
        return person;
	}

	/**
	 * @return the piRestClient
	 */
	public PIRestClient getPiRestClient() {
		return piRestClient;
	}

	/**
	 * @param piRestClient the piRestClient to set
	 */
	public void setPiRestClient(PIRestClient piRestClient) {
		this.piRestClient = piRestClient;
	}
	
	
}
