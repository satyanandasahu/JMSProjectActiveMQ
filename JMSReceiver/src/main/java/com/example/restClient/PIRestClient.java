package com.example.restClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

import com.example.satya.vo.Person;

public class PIRestClient {

	public String createPerson(Person person) {
		ResponseEntity<String> postResponse = RestClient.builder()
				.baseUrl("http://localhost:8080/").build().post()
				.uri("user/api/create").body(person).retrieve()
				.toEntity(String.class);
		
		System.out.println(postResponse);
		return postResponse.getBody();
	}
	
	public static void getPerson() {
		ResponseEntity<Person> getResponse = RestClient.builder()
				.baseUrl("http://localhost:8080/").build().get()
				.uri("user/api?id=1747126073044").retrieve()
				.toEntity(Person.class);
		
		System.out.println(getResponse.getBody().getAddress());
	}
	
	public static void main(String[] args) {
		getPerson();
	}

}
