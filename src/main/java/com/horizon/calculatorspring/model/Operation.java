package com.horizon.calculatorspring.model;
import java.time.LocalDateTime;

public class Operation {
    private Long id;
    private String type;
    private double operand1;
    private double operand2;
    private double result;
    private LocalDateTime createdAt;

    public Operation(Long id, String type, double operand1, double operand2, double result, LocalDateTime createdAt) {
        this.id = id;
        this.type = type;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getOperand1() { return operand1; }
    public void setOperand1(double operand1) { this.operand1 = operand1; }

    public double getOperand2() { return operand2; }
    public void setOperand2(double operand2) { this.operand2 = operand2; }

    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", result=" + result +
                ", createdAt=" + createdAt +
                '}';
    }
}


