package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HCLInterview {
    public static void main(String[] args) {
        String str = "Hello World";

        // Convert String to Stream and count character frequency
        Map<Character, Long> resultMap = str.chars()  // Convert to IntStream
                .mapToObj(c -> (char) c)  // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the frequency of each character
        resultMap.forEach((key, val) -> System.out.println(key + " = " + val));
    }
//    List<Apple> appleList = Arrays.asList(
//            new Apple("Fuji", "red", "150g"),
//            new Apple("Granny Smith", "green", "180g"),
//            new Apple("Honeycrisp", "red", "200g"),
//            new Apple("Golden Delicious", "yellow", "160g"),
//            new Apple("Pink Lady", null, "170g") // Handling null color
//    );

//    List<Apple> resultList = appleList.stream()
//            .filter(p -> p.color != null && p.color.equalsIgnoreCase("red")) // Avoid NullPointerException
//            .collect(Collectors.toList());
    List<String> list = Arrays.asList("3", "-7", null, "4", "12", "-2");

    List<Integer> positiveNumbers = list.stream()
            .filter(s -> s != null)  // Remove null values
            .map(Integer::parseInt)  // Convert to Integer
            .filter(num -> num > 0)  // Filter positive numbers
            .collect(Collectors.toList());

//        System.out.println(positiveNumbers);


//    import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//    @RestController
//    @RequestMapping("/resource")
//    class ResourceController {
//
//        @Autowired
//        private ResourceService resourceService;
//
//        // ✅ Using @PathVariable
//        @GetMapping("/fetch/{employeeId}")  // URL: /fetch/123
//        public Employee fetchResource(@PathVariable String employeeId) {
//            return resourceService.fetchEmployee(employeeId);
//        }
//
//        // ✅ Alternative Using @RequestParam
//        @GetMapping("/fetch")  // URL: /fetch?employeeId=123
//        public Employee fetchResourceWithParam(@RequestParam String employeeId) {
//            return resourceService.fetchEmployee(employeeId);
//        }
//
//        // ✅ Corrected @PostMapping with Proper ResponseEntity
//        @PostMapping("/insert")
//        public ResponseEntity<Employee> insertResource(@RequestBody Employee employee) {
//            return ResponseEntity.ok(resourceService.insertEmployee(employee));
//        }
//    }


}






