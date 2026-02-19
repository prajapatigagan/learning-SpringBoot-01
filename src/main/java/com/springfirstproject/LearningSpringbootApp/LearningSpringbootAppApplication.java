package com.springfirstproject.LearningSpringbootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringbootAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringbootAppApplication.class, args);
    }

//    private RazorpayPaymentServices paymentServices=new RazorpayPaymentServices();
    //use for bean process..
//      private RazorpayPaymentServices paymentServices;

    //dependence injection
//    public LearningSpringbootAppApplication(RazorpayPaymentServices paymentServices) {
//        this.paymentServices = paymentServices;
//    }


    //Field Injection...
    @Autowired
    private RazorpayPaymentServices paymentServices;

    @Override
    public void run(String... args) throws Exception {
        String Payment =paymentServices.pay();
        System.out.println("Payment done :"+Payment);
    }

}
