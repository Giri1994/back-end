//package com.example.demo.service;
//
//import com.example.demo.customexception.EmployeeNotFound;
//import com.example.demo.dto.EmployeeDto;
//import com.example.demo.entity.Employee;
//import com.example.demo.mapper.EmployeeMapper;
//import com.example.demo.repository.EmployeeRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.util.AssertionErrors.assertEquals;
//
//@ExtendWith(MockitoExtension.class)
//public class EmployeeServiceImplTest {
//
//    @InjectMocks
//    EmployeeServiceImpl employeeServiceImpl;
//
//    @Mock
//    EmployeeRepository employeeRepository;
//
//    @Mock
//    EmployeeMapper mapper;
//
//    @Test
//    void SaveEmp_givenEmployeeObj_ShouldSaveAndReturnResponse() {
//
//        //Array
//        EmployeeDto dto=CustomEmployeeDto().get(0);
//        Employee employee =new Employee();
//        employee.setAge(1);
//        employee.setName("raj");
//        employee.setAge(6);
//        employee.setSalary(1000);
//        employee.setDepartment("IT");
//        employee.setDoj(new Date(2024 - 07 - 03));
//
//        //ACT
//        when(employeeRepository.save(mapper.toEntity(dto))).thenReturn(employee);
//        when(mapper.toDto(employee)).thenReturn(dto);
//        EmployeeDto response=employeeServiceImpl.SaveEmp(dto);
//
//        //ASSERT
//        assertEquals("",response,dto);
//
//
//    }
//
//    @Test
//    void updateEmployee() {
//
//        //Array
//        EmployeeDto dto=CustomEmployeeDto().get(0);
//        Employee employee =new Employee();
//        employee.setId(1);
//        employee.setName("raj");
//        employee.setAge(6);
//        employee.setSalary(1000);
//        employee.setDepartment("IT");
//        employee.setDoj(new Date(2024 - 07 - 03));
//
//        //ACT
//        when(employeeRepository.findById(dto.getId())).thenReturn(Optional.of(employee));
//        when(employeeRepository.save(employee)).thenReturn(employee);
////        when(mapper.toDto(employee)).thenReturn(dto);
//        EmployeeDto response=employeeServiceImpl.updateEmployee(dto.getId(),dto);
//
//        //ASSERT
//        assertEquals("", response.getName(),dto.getName());
//
//
//    }
//
//    @Test
//    void updateEmployeeNull() {
//
//        //Array
//        EmployeeDto dto=CustomEmployeeDto().get(0);
//        Employee employee =new Employee();
//        employee.setName("raj");
//        employee.setAge(6);
//        employee.setSalary(1000);
//        employee.setDepartment("IT");
//        employee.setDoj(new Date(2024 - 07 - 03));
//
//        //ACT
//        when(employeeRepository.findById(dto.getId())).thenReturn(Optional.empty());
////        when(employeeRepository.save(employee)).thenReturn(employee);
////        when(mapper.toDto(employee)).thenReturn(dto);
////        EmployeeDto response=employeeServiceImpl.updateEmployee(dto.getId(),dto);
//
//        //ASSERT
//        assertThrows(EmployeeNotFound.class,()->employeeServiceImpl.updateEmployee(dto.getId(),dto));
//
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
//
//        EmployeeDto empOne = new EmployeeDto();
//        empOne.setId(1);
//        empOne.setAge(1);
//        empOne.setName("raj");
//        empOne.setAge(6);
//        empOne.setSalary(1000);
//        empOne.setDepartment("IT");
//        empOne.setDoj(new Date(2024 - 07 - 03));
//        return List.of(empOne);
//    }
//}
