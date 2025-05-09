package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
//@Table(schema = "customer_details")
@Data
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    String customerName;

//    @Embedded
//    @JoinColumn(name = "id")
    @OneToMany(mappedBy = "customerDetails" ,cascade = CascadeType.ALL)
    List<Loan> loanList;


//    -- Create schema for loan
//    CREATE SCHEMA IF NOT EXISTS loan;
//
//-- Create schema for underwriter
//    CREATE SCHEMA IF NOT EXISTS underwriter;
//
//-- Create schema for customer_details
//    CREATE SCHEMA IF NOT EXISTS customer_details;
//
//-- Create UnderWriter Table
//    CREATE TABLE underwriter.UnderWriter (
//    underWriterId SERIAL PRIMARY KEY,
//    Name VARCHAR(255) NOT NULL
//);
//
//-- Create CustomerDetails Table
//    CREATE TABLE customer_details.CustomerDetails (
//    customerId SERIAL PRIMARY KEY,
//    customerName VARCHAR(255) NOT NULL
//);
//
//-- Create Loan Table
//    CREATE TABLE loan.Loan (
//    Id SERIAL PRIMARY KEY,
//    LoanType VARCHAR(255) NOT NULL,
//    Description TEXT,
//    Status VARCHAR(50),
//    amount DOUBLE PRECISION,
//    customerId INT,
//    UnderWriterId INT,
//    FOREIGN KEY (customerId) REFERENCES customer_details.CustomerDetails(customerId) ON DELETE SET NULL,
//    FOREIGN KEY (UnderWriterId) REFERENCES underwriter.UnderWriter(underWriterId) ON DELETE SET NULL
//);


//    -- Insert sample data into UnderWriter table
//    INSERT INTO underwriter.UnderWriter (Name) VALUES
//            ('John Doe'),
//('Alice Smith');
//
//-- Insert sample data into CustomerDetails table
//    INSERT INTO customer_details.CustomerDetails (customerName) VALUES
//            ('Michael Johnson'),
//('Sarah Brown');
//
//-- Insert sample data into Loan table
//    INSERT INTO loan.Loan (LoanType, Description, Status, amount, customerId, UnderWriterId) VALUES
//            ('Home Loan', 'Loan for purchasing a house', 'Approved', 250000, 1, 1),
//('Car Loan', 'Loan for purchasing a car', 'Pending', 35000, 2, 2);


//    ------------------------------------
//
//    CREATE TABLE loan (
//            Id SERIAL PRIMARY KEY,
//            LoanType VARCHAR(255) NOT NULL,
//    Description TEXT,
//    Status VARCHAR(50),
//    amount DOUBLE PRECISION,
//    customerId INT,
//    UnderWriterId INT,
//    FOREIGN KEY (customerId) REFERENCES customer_details(customerId) ON DELETE SET NULL,
//    FOREIGN KEY (UnderWriterId) REFERENCES underwriter(underWriterId) ON DELETE SET NULL
//);
//
//    CREATE TABLE underwriter (
//            underWriterId SERIAL PRIMARY KEY,
//            Name VARCHAR(255) NOT NULL
//);
//
//    CREATE TABLE customer_details (
//            customerId SERIAL PRIMARY KEY,
//            customerName VARCHAR(255) NOT NULL
//);
//
//    INSERT INTO underwriter (Name) VALUES
//            ('John Doe'),
//                    ('Alice Smith');
//
//    INSERT INTO customer_details (customerName) VALUES
//            ('Michael Johnson'),
//                    ('Sarah Brown');
//
//    INSERT INTO loan (LoanType, Description, Status, amount, customerId, UnderWriterId) VALUES
//            ('Home Loan', 'Loan for purchasing a house', 'Approved', 250000, 1, 1),
//                    ('Car Loan', 'Loan for purchasing a car', 'Pending', 35000, 2, 2);
//
//
//}


}
