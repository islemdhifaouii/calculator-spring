package com.horizon.calculatorspring.service;
import com.horizon.calculatorspring.model.Operation;
import com.horizon.calculatorspring.repository.OperationRepository;

import java.time.LocalDateTime;
import java.util.List;

public class CalculatorService {
    private OperationRepository repository;

    public CalculatorService() {
        this.repository = new OperationRepository();
    }

    public double add(double a, double b) {
        double result = a + b;

        // Create a new Operation object
        Operation op = new Operation(null, "add", a, b, result, LocalDateTime.now());

        // Save operation to repository
        repository.save(op);

        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        Operation op = new Operation(null, "subtract", a, b, result, LocalDateTime.now());
        repository.save(op);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        Operation op = new Operation(null, "divide", a, b, result, LocalDateTime.now());
        repository.save(op);
        return result;
    }

    public List<Operation> getAllOperations() {
        return repository.findAll();
    }

    public Operation getOperationById(Long id) {
        return repository.findById(id);
    }

    public List<Operation> getOperationByType(String type) {
        return repository.findByType(type);
    }

    // Optional: clear all operations
    public void clearOperations() {
        repository.clear();
    }

}
