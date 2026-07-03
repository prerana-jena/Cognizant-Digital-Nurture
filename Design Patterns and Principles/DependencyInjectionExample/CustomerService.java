package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void getCustomerDetails(int id) {
        String customerDetails = customerRepository.findCustomerById(id);
        System.out.println(customerDetails);
    }
}
