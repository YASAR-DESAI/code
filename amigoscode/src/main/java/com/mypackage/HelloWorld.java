package com.mypackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping
public class HelloWorld {
	
	CustomerRepository cr ;
	
	

	public HelloWorld(CustomerRepository cr) {
		
		this.cr = cr;
	}

	public static void main(String[] args) {
		
		SpringApplication.run(HelloWorld.class,args);
		System.out.println("HELLO!!!");

	}
	
	@GetMapping("/howdy")
	public HelloMessage sayHowdy() {
		
		System.out.println("Howdy fellow stranger?!");
		
		return new HelloMessage("HELLO STRANGER!!");
	}
	
	@GetMapping("/person")
	public Person getDetails()
	{
		Person p1 = new Person();
		p1.setAge(23);
		p1.setMessage(new HelloMessage("This is Harry."));
		p1.setName("Harry");
		p1.setNationality("British");
		return p1;
	}
	
	@GetMapping("/customers")
	public List<Customer> getList(){
		
		return cr.findAll();
		
	}
	
	@PostMapping("/addCustomer")
	public void addCustomer(NewCustomer request)
	{
		Customer newCustomer = new Customer();
		newCustomer.setName(request.getName());
		newCustomer.setAge(request.getAge());
		
		cr.save(newCustomer);
	}
	
	
	@DeleteMapping("/customers/{customerId}")
	public void addCustomer(@PathVariable("customerId") int id)
	{
		cr.deleteById(id);
	}



}
