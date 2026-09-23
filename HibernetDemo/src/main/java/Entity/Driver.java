package Entity;

import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.sql.Update;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("HND");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        Scanner sc =    new Scanner(System.in);

        Student s1 = new Student(11, "Deepak", "Java Fullstack");

        et.begin();
        em.persist(s1);


        et.commit();

//        em.close();
//        emf.close();
        int choice=0;

        do{
            System.out.println("1.Add Student\n2.Upadate the student\n3.FindBy Id\n4.Delete Student\n");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                   Student st   =   new Student();
                    System.out.println("Enter the Student id");
                    sc.nextInt();
                    st.setName(sc.nextLine());
                    add(st);




            }
        }while (choice!=0);
    }

    private static void add(){

    }
}
