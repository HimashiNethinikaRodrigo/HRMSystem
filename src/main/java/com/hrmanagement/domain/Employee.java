package com.hrmanagement.domain;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
public class Employee {
    private String employeeNo;
    private String firstName;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNo='" + employeeNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
