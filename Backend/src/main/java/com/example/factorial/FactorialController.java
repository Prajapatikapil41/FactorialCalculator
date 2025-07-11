// FactorialController.java

package com.example.factorial;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/factorial")
public class FactorialController {

    @GetMapping("/{number}")
    public ResponseEntity<?> getFactorial(@PathVariable int number) {
        if (number < 0) {
            return ResponseEntity.badRequest().body("Factorial is not defined for negative numbers.");
        }
        return ResponseEntity.ok(calculateFactorial(number));
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
