package com.bharat.client;

import java.awt.print.Book;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;




import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class JerseyClientGet {

	public static void main(String[] args) {
		try {

			Client client = Client.create();
			 

			//WebResource webResource = client
			//		.resource("http://localhost:8001/library/v1/books");
			System.out.println("in side try");
			WebResource webResource=client.resource("http://54.215.210.214:9000/orders/68935");
			
			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			
			String output = response.getEntity(String.class);
			System.out.println("Output from Server .... \n");
			System.out.println(output);
			JSONObject obj=new JSONObject(output);
			System.out.println("shipped_books "+obj.getString("shipped_books"));
			System.out.println("obj is = "+obj.toString());
			
			
			
//			ObjectMapper mapper=new ObjectMapper();
//			try{
//				Books book=new Books();
//				shipped_books shipping=new shipped_books(book);
//				Books output1 = response.getEntity(Books.class);
//				System.out.println(output1);
//				//shipping=mapper.readValue(output, shipped_books.class);
//				//System.out.println(shipping.book.getCategory());
//				
////				System.out.println("category "+book.getCategory());
////				System.out.println(book.getCoverimage());
////				System.out.println(book.getIsbn());
////				System.out.println(book.getTitle());
//				
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}