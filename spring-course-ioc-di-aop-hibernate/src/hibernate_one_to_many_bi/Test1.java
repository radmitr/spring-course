package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 14. Отношение Один-ко-Многим (Bi-directional) */
public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            // 1 - save department (and auto save Dmitriy and Elena)
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("IT", 1200, 300);
//            Employee emp1 = new Employee("Dmitriy", "Radionov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            // save department and two employees
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 2 - get department (and auto get Dmitriy and Elena)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1); // by id = 1
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 3 - get Dmitriy (and auto get department)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1); // by id = 1
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 4 - delete Dmitriy (and auto delete Elena and department)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1); // by id = 1
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 5 - repeat saving the department (and auto save Dmitriy and Elena)
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("IT", 1200, 300);
//            Employee emp1 = new Employee("Dmitriy", "Radionov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            // save department and two employees
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 6 - delete only Elena (before have to change CascadeType)
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4); // by id = 4
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
