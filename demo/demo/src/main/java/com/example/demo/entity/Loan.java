package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(schema = "loan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    String loantype;
    String Description;



    String Status;
    double  amount;

//    @Embedded
    @ManyToOne()
    @JoinColumn(name = "customerId")
    CustomerDetails customerDetails;

//    @Embedded
    @ManyToOne()
    @JoinColumn(name = "underWriterId" )
    UnderWriter underWriter;

    public Loan(String homeLoan, String loanForPurchasingAHouse, String approved, String s, CustomerDetails customerDetails, UnderWriter underWriter) {
              this.loantype = homeLoan;
//                Id = id;
        this.loantype = loanForPurchasingAHouse;
        this.Description = s;
        this.Status = approved;
        this.amount = amount;
        this.customerDetails = customerDetails;
        this.underWriter = underWriter;
    }


//    public Loan(String homeLoan, String loanForPurchasingAHouse, String approved, String status, CustomerDetails customerDetails, UnderWriter underWriter) {
//        Id = id;
//        this.loantype = loantype;
//        Description = description;
//        Status = status;
//        this.amount = amount;
//        this.customerDetails = customerDetails;
//        this.underWriter = underWriter;
//    }
}
