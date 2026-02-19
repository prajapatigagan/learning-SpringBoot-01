package com.springfirstproject.LearningSpringbootApp;
import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentServices implements PaymentServices {

    @Override
    public String pay(){
        String Payment="Razorpay Payment";
        System.out.println("Payment"+Payment);
        return Payment;
    }
}
