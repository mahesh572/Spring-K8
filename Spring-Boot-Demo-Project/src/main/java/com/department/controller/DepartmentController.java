package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;

import jakarta.validation.Valid;

/**
 * REST controller for managing Department entities.
 * Handles HTTP requests and routes them to the appropriate service methods.
 */
@RestController // Marks this class as a RESTful controller.
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService; // Injects the DepartmentService dependency.

    /**
     * Handles POST requests to save a new department.
     * @param department the department entity to be saved
     * @return the saved department entity
     */
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    /**
     * Handles GET requests to fetch the list of all departments.
     * @return a list of department entities
     */
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    /**
     * Handles PUT requests to update an existing department.
     * @param department the department entity with updated information
     * @param departmentId the ID of the department to be updated
     * @return the updated department entity
     */
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
        return departmentService.updateDepartment(department, departmentId);
    }

    /**
     * Handles DELETE requests to remove a department by ID.
     * @param departmentId the ID of the department to be deleted
     * @return a success message
     */
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}
