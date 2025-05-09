package com.example.demo.controller;

import com.example.demo.entity.Loan;
import com.example.demo.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/loan")
public class LoanController {


    @Autowired
    LoanService loanService;

    @GetMapping(value = "/fetchAll")
    List<Loan> getLoanDetails(){

        return loanService.getListOfLoans();
    }

    @PatchMapping(value = "/update-status")
    void updateStatus(@RequestParam String loanId , @RequestParam  String status){
        loanService.updateStatus(loanId,status);
    }



}
