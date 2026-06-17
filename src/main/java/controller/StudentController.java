package controller;

import dao.StudentDAO;
import dao.StudentDAOImpl;

public class StudentController {

    StudentDAO dao = new StudentDAOImpl();

    public StudentDAO getDao() {
        return dao;
    }
}