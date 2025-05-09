package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
//@Table(schema = "underwriter")
@Data
public class UnderWriter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int underWriterId;
    String Name;

//    @Embedded
    @OneToMany(mappedBy = "underWriter" ,cascade = CascadeType.ALL)
    List<Loan> loanList;

}
