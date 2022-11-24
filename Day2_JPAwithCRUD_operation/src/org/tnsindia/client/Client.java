package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		Scanner s=new Scanner(System.in);
		
		//create operation
				/*customer.setCust_ID(1028);
				customer.setName("Vrush");
				customer.setProduct_price(980.20);
				service.addCustomer(customer);
				System.out.println("Customer added Successfully"); */
		//retreive 
		
				/*customer=service.getCustomerById(1028);
				System.out.println("Customer ID: "+customer.getCust_ID());
				System.out.println("Customer Name: "+customer.getName());
				System.out.println("Customer Product-price: "+customer.getProduct_price()); */
		//updation
				/*System.out.println("Enter the CustID for the updation");
				customer=service.getCustomerById(s.nextInt());
				customer.setName("Rutuja Sonawane");
				service.updateCustomer(customer);
				System.out.println("Customer updated Successfully");*/
				
				//deletion
				System.out.println("Enter the CustID for the deletion");
				customer=service.getCustomerById(s.nextInt());
				service.deleteCustomer(customer);
				System.out.println("Customer deleted Successfully");		
				

	}

}
