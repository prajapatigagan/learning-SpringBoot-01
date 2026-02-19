package com.springfirstproject.LearningSpringbootApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RazorpayPaymentServices {
    @GetMapping
    public String pay(){
        String Payment="Razorpay Payment";
        System.out.println("Payment"+Payment);
        return Payment;
    }
}
