package com.horizon.calculatorspring.controller;

import com.horizon.calculatorspring.model.Operation;
import com.horizon.calculatorspring.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//as a REST API controller
@RestController
//url path for all endpoints
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorService();
    }

   // GET /calculator/history → returns all operations
    @GetMapping("/history")
    public List<Operation> getAllOperations() {
        return calculatorService.getAllOperations();
    }

    // GET /calculator/history/{id} → returns operation by ID
    @GetMapping("/history/{id}")
    public Operation getOperationById(@PathVariable Long id) {
        return calculatorService.getOperationById(id);
    }

    // GET /calculator/history/type/{type} → returns operation by type
    @GetMapping("/history/type/{type}")
    public List<Operation> getOperationsByType(@PathVariable String type) {
        return calculatorService.getOperationByType(type);
    }

    // Example endpoint for addition (optional)
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculatorService.divide(a, b);
    }

}
