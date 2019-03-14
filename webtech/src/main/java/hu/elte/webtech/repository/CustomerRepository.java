package hu.elte.webtech.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import hu.elte.webtech.entities.Customer;

@Repository
public class CustomerRepository {

    private static List<Customer> customers = new ArrayList<>();
    
    static {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("John Doe");
        customer1.setAddress("Michigan 1st Street");
        customers.add(customer1);
        
        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("Jane Doe");
        customer2.setAddress("Michigan 2nd Street");
        customers.add(customer2);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        CustomerRepository.customers = customers;
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    public Customer getCustomerById(long id){
        return customers.stream().filter(customer -> customer.getId() == id).findFirst().get();
    }

}
