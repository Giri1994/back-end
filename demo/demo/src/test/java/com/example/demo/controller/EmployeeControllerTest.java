//package com.example.demo.controller;
//
//
//import com.example.demo.dto.EmployeeDto;
//import com.example.demo.service.EmployeeService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.util.AssertionErrors.assertEquals;
//
//@ExtendWith(MockitoExtension.class)
//public class EmployeeControllerTest {
//
//    @InjectMocks
//    EmployeeControler employeeControler;
//
//    @Mock
//    EmployeeService employeeService;
//
//    @Test
//    void inserEmpDetails_passValidRequest_shouldgetCorrectResponse() {
//
//        EmployeeDto employeeDto =CustomEmployeeDto().get(0);
//
//        //Arrange
//        when(employeeService.SaveEmp(employeeDto)).thenReturn(employeeDto);
//
//
//        //Act
//        ResponseEntity<EmployeeDto> response = employeeControler.inserEmpDetails(employeeDto);
//
//
//        //Assert
//        assertEquals("",employeeDto,response.getBody());
//        assertEquals("",HttpStatus.OK, response.getStatusCode());
//
//    }
//
//    @Test
//    void getEmpDetails_getRequest_fetchCorrectResponse() {
//
//        //Arrange
//        when(employeeService.getAll()).thenReturn(CustomEmployeeDto());
//
//
//        //Act
//        ResponseEntity<List<EmployeeDto>> response = employeeControler.getEmpDetails();
//
//
//        //Assert
//        assertEquals("response",CustomEmployeeDto(),response.getBody());
//        assertEquals("Status",HttpStatus.OK, response.getStatusCode());
//        assertEquals("",CustomEmployeeDto().size(),response.getBody().size());
//        verify(employeeService).getAll();
//
//    }
//
//    @Test
//    void getEmpDetails_validInput_fetchCorrectResponse(){
//
//        when(employeeService.findByNameAndAge(Mockito.any(),Mockito.anyInt())).thenReturn(CustomEmployeeDto().get(0));
//        ResponseEntity<EmployeeDto> resp=employeeControler.getEmpDetails("raj",6);
//
//        assertEquals("",resp.getBody(),CustomEmployeeDto().get(0));
//        assertEquals("",resp.getStatusCode(),HttpStatus.OK );
//    }
//
//    @Test
//    void updateEmploye_validInput_UpdatedResponse(){
//
//        EmployeeDto employee =new EmployeeDto();
//        employee.setId(1);
//        employee.setAge(1);
//        employee.setName("ravi");
//        employee.setAge(7);
//        employee.setSalary(6000);
//        employee.setDepartment("IT");
//        employee.setDoj(new Date(2024 - 07 - 03));
//
//
//        when(employeeService.updateEmployee(employee.getId(),employee)).thenReturn(employee);
//        ResponseEntity<EmployeeDto> response=employeeControler.updateEmployee(employee.getId(),employee);
//
//        assertEquals("",response.getBody().getName(),employee.getName());
//
//    }
//
//    List<EmployeeDto> CustomEmployeeDto() {
//
////    "id": 6,
////            "name": "raj",
////            "age": 60,
////            "salary": 10000,
////            "department": "IT",
////            "doj": "2024-07-03T13:45:30.000+00:00"
////}
//
//        EmployeeDto empOne = new EmployeeDto();
//        empOne.setAge(1);
//        empOne.setName("raj");
//        empOne.setAge(6);
//        empOne.setSalary(1000);
//        empOne.setDepartment("IT");
//        empOne.setDoj(new Date(2024 - 07 - 03));
//        return List.of(empOne);
//    }
//
//}
