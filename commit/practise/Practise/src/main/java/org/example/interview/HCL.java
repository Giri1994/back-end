package org.example.interview;

import org.example.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HCL {


    public static void main(String args[]){

        List<List<Employee>> inputList = new ArrayList<>(); //  [[a,b][b,c]]

        //City , Name , rollNo
//      List<Employee> resultList=  inputList.stream().filter(e->e.getCity().equalsIgnoreCase("Pune")).collect(Collectors.toList());
//      System.out.println(""+resultList);

      // map & Flatmap
      List<Employee> flattenlist=  inputList.stream().flatMap(e->e.stream()).collect(Collectors.toList()); //  [a,b,b,c]



        // interface @Autowire

//        @Qualifer("bww")
//
//
//        interface Car
//        {}
//
//        class honda implements Car
//
//        class bww implements Car
//
//                Restemplate restemplate;
//        this.resTemplate = new RestTemplate();
//        String url =
//
//                resTemplate.getFor
//
//
//            Webclient webclient = new Webclient();
//
//        webclient.get("getemplyee")
//                .URI
//                .retrive()
//                .retry()
//                .responseBody("json")
//                .orElse({
//                        new EXCEPTION()
//                });
//
//
//        local:9090/getemplyee GET
//        JAR -> DOCKER IMAGE
//
//
//            import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//        public class WebClientExample {
//            private final WebClient webClient;
//
//            public WebClientExample() {
//                this.webClient = WebClient.builder()
//                        .baseUrl("https://jsonplaceholder.typicode.com")
//                        .build();
//            }
//
//            public String getPostById(int id) {
//                return webClient.get()
//                        .uri("/posts/{id}", id)
//                        .retrieve()
//                        .bodyToMono(String.class)
//                        .block(); // Blocking call (for demonstration)
//            }
//
//            public static void main(String[] args) {
//                WebClientExample client = new WebClientExample();
//                System.out.println(client.getPostById(1));
//            }
//        }


//        import org.springframework.web.client.RestTemplate;
//
//        public class RestTemplateExample {
//            private final RestTemplate restTemplate;
//
//            public RestTemplateExample() {
//                this.restTemplate = new RestTemplate();
//            }
//
//            public String getPostById(int id) {
//                String url = "https://jsonplaceholder.typicode.com/posts/" + id;
//                return restTemplate.getForObject(url, String.class);
//            }
//
//            public static void main(String[] args) {
//                RestTemplateExample client = new RestTemplateExample();
//                System.out.println(client.getPostById(1));
//            }
//        }



    }
}
