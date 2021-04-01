package com.Hibernate.InstructorMain;
import com.Hibernate.Entity.Instructor;
import com.Hibernate.Entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// THIS CLASS HAVE APPLIES CRUD OPERATIONS TO THE JVA CODE AND JDBC

public class Main {

    public static void main(String[] args) {

        try {

            SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Instructor.class)
                    .buildSessionFactory();

            Session session = sessionFactory.getCurrentSession();


//CREATE DATA

//                Instructor instructor = new Instructor("Dammy","Deo","sammy@gmail.com");
//
//                InstructorDetail instructorDetail = new InstructorDetail("Codeobar","Listen music");
//
//                instructor.setInstructorDetail(instructorDetail);

// DELETE DATA

                session.beginTransaction();

                int ID = 1;
                Instructor instructor = session.get(Instructor.class,ID);
                System.out.println("Deleting ID = 1");
                if (instructor!=null) {
                    session.delete(instructor);
                }

//                session.save(instructor);

                session.getTransaction().commit();

                System.out.println("Done !!!....");

            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
