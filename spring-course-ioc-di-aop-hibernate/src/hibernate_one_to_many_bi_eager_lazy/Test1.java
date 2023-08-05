package hibernate_one_to_many_bi_eager_lazy;

import hibernate_one_to_many_bi_eager_lazy.entity.Department;
import hibernate_one_to_many_bi_eager_lazy.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 16. Типы загрузок данных eager и lazy */
public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            // 1 - save department (and auto save Dmitriy, Elena and Anton)
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("Sales", 1500, 800);
//            Employee emp1 = new Employee("Dmitriy", "Radionov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1500);
//            Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//
//            // save department and three employees
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            /* 2 - get department (and auto get Dmitriy, Elena and Anton if FetchType.EAGER;
                                   get employees only after department.getEmps() if FetchType.LAZY) */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            System.out.println("Get department");
//            Department department = session.get(Department.class, 4); // by id = 4
//
//            System.out.println("Show department");
//            System.out.println(department);
//
//            System.out.println("Show employees of the department");
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            /* 3 - department.getEmps() after commit;
                   if FetchType.EAGER - OK,
                   if FetchType.LAZY - org.hibernate.LazyInitializationException */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            System.out.println("Get department");
//            Department department = session.get(Department.class, 4); // by id = 4
//
//            System.out.println("Show department");
//            System.out.println(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("Show employees of the department");
//            System.out.println(department.getEmps());
//
//            System.out.println("Done!");

            // 4 - department.getEmps().get(0) before commit()
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4); // by id = 4

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгрузим наших работников");
//            department.getEmps(); // org.hibernate.LazyInitializationException
            department.getEmps().get(0);
//            System.out.println(department.getEmps().get(0));

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
