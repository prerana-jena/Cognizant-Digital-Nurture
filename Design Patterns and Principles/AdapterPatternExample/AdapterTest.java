package AdapterPatternExample;

public class AdapterTest 
{
    public static void main(String[] args) 
    {
        PaymentProcessor paypalAdapter = new PaypalAdapter(new PaypalGateway());
        paypalAdapter.processPayment(100.0);
        
        PaymentProcessor stripeAdapter = new StripeAdapter(new StripeGateway());
        stripeAdapter.processPayment(200.0);
    }
    
}
