//package com.example.GreetingApp.controller;
//
//import com.example.GreetingApp.model.Greeting;
//import com.example.GreetingApp.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    @GetMapping("/{id}")
//    public Greeting getGreetingById(@PathVariable Long id) {
//        return greetingService.getGreetingById(id);
//    }
//
//    @PostMapping("/save")
//    public Greeting saveGreeting(@RequestBody Greeting greeting) {
//        return greetingService.saveGreeting(greeting);
//    }
//
//    // ✅ UC6: Fetch all greetings
//    @GetMapping("/all")
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//
//    @PutMapping("/{id}")
//    public Greeting updateGreeting(@PathVariable Long id, @RequestBody Greeting newGreeting) {
//        return greetingService.updateGreeting(id, newGreeting);
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteGreeting(@PathVariable Long id) {
//        greetingService.deleteGreeting(id);
//        return "Greeting with ID " + id + " deleted successfully!";
//    }
//}