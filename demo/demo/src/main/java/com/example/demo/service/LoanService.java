package com.example.demo.service;


import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.Loan;
import com.example.demo.entity.UnderWriter;
import com.example.demo.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {


    @Autowired
    LoanRepository loanRepository;

    public List<Loan> getListOfLoans() {
//        List<Loan> inputList =new ArrayList<>();
//        CustomerDetails customerDetails = new CustomerDetails();
//        customerDetails.setCustomerId(123);
//        customerDetails.setCustomerName("Giri");
//        UnderWriter underWriter =new UnderWriter();
//        underWriter.setUnderWriterId(124);
//        underWriter.setName("Kanda");
//        CustomerDetails customerDetails1 = new CustomerDetails();
//        customerDetails.setCustomerId(1245);
//        customerDetails.setCustomerName("Tamil");
//        UnderWriter underWriter1 =new UnderWriter();
//        underWriter.setUnderWriterId(1245);
//        underWriter.setName("Ragu");
////        ('Home Loan', 'Loan for purchasing a house', 'Approved', 250000, 1, 1),
////        ('Car Loan', 'Loan for purchasing a car', 'Pending', 35000, 2, 2);
//
//        inputList.add(new Loan(1,"Home Loan","Loan for purchasing a house","Approved",250000,customerDetails,underWriter));
//        inputList.add(new Loan(2,"Land Loan","Loan for purchasing a Land","Rejected",1000,customerDetails1,underWriter1));
//        return inputList;
        return loanRepository.findAll();
    }

    public void updateStatus(String loanId, String status) {
        Optional<Loan> loan =loanRepository.findById(Integer.valueOf(loanId));
        Loan loanVal= loan.get();
        loanVal.setStatus(status);
        loanRepository.save(loanVal);
    }
}
