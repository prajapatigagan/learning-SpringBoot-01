package com.springfirstproject.LearningSpringbootApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//All Anotation are same works..
@Component
//@Service
//@RestController
//@Repository
//@Controller
@ConditionalOnProperty(name = "payment.provider", havingValue ="stripe")
public class StripePaymentServices implements PaymentServices {
    @Override
    public String pay() {
        String Payment="Stripe Payment";
        System.out.println("Payment : "+Payment);
        return Payment;
    }
}
