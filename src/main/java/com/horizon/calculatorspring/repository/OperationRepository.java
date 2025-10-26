package com.horizon.calculatorspring.repository;
import com.horizon.calculatorspring.model.Operation;
import java.util.ArrayList;
import java.util.List;

public class OperationRepository {
    private List <Operation> operations =new ArrayList<> ();
    private Long operationId = 1L;

    public Operation save(Operation operation) {
        operation.setId(operationId++);
        operations.add(operation);
        return operation;
    }

    public List<Operation> findAll() {
        return operations;
    }

    public Operation findById(Long id) {
        return operations.stream()
                .filter(op -> op.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Operation> findByType(String type) {
        List<Operation> result = new ArrayList<>();
        for (Operation op : operations) {
            if (op.getType().equalsIgnoreCase(type)) {
                result.add(op);
            }
        }
        return result;
    }

    public void clear() {
        operations.clear();
        operationId = 1L;
    }

}
