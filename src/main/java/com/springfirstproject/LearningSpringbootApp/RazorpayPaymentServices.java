package com.springfirstproject.LearningSpringbootApp;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue ="razorpay")
public class RazorpayPaymentServices implements PaymentServices {

    @Override
    public String pay(){
        String Payment="Razorpay Payment";
        System.out.println("Payment : "+Payment);
        return Payment;
    }
}
