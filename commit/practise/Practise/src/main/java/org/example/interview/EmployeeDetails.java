package org.example.interview;

import java.util.Objects;

public class EmployeeDetails {


    int empId;

    String employeeName;


    int managerId;

    public EmployeeDetails(int i, String giri, int i1) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDetails that)) return false;
        return getEmpId() == that.getEmpId() && getManagerId() == that.getManagerId() && Objects.equals(getEmployeeName(), that.getEmployeeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmployeeName(), getManagerId());
    }



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }





}
