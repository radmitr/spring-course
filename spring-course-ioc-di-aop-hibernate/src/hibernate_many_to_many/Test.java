package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 17. Отношение Многие-ко-Многим. Часть 1 */
/* 18. Отношение Многие-ко-Многим. Часть 2 */
public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            // 1 - save Football (and auto save Dmitriy, Masha, Vasya and ids in 'child_section')
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Dmitriy", 5);
//            Child child2 = new Child("Masha", 7);
//            Child child3 = new Child("Vasya", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 2 - save Igor (and auto save Volleyball, Chess, Math and ids in 'child_section')
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 3 - get Football (and auto get Dmitriy, Masha, Vasya)
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1); // by id = 1
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 4 - get Igor (and auto get Volleyball, Chess, Math)
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4); // by id = 4
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 5 - delete Football (and auto delete Dmitriy, Masha, Vasya and ids in 'child_section')
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1); // by id = 1
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 6 - attempt to save Football (and auto save Dmitriy, Masha, Vasya and ids in 'child_section')
            // for @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            //            CascadeType.REFRESH, CascadeType.DETACH})
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Dmitriy", 5);
//            Child child2 = new Child("Masha", 7);
//            Child child3 = new Child("Vasya", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit(); // java.lang.IllegalStateException
//            System.out.println("Done!");

            // 7 - save Football, then serially save Dmitriy, Masha, Vasya and auto save ids in 'child_section')
            // for @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            //            CascadeType.REFRESH, CascadeType.DETACH})
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Dmitriy", 5);
//            Child child2 = new Child("Masha", 7);
//            Child child3 = new Child("Vasya", 6);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 8 - persist()
            // save Dance (and auto save Olya, Grisha, Pavlik and ids in 'child_section')
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 8);
//            Child child3 = new Child("Pavlik", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit(); // java.lang.IllegalStateException
//            System.out.println("Done!");

            // 9 - delete Dance (and auto delete ids in 'child_section')
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7); // by id = 7
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 10 - delete Dmitriy (and auto delete ids in 'child_section')
            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 5); // by id = 5
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
