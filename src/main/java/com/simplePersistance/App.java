package com.simplePersistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args)
    {
        Alien alien= new Alien(2,"JohnDoe","Software");

//        Entity Manager... Manges tables
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("greatpuOne");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(alien);
        em.getTransaction().commit();

//        Users user = em.find(Users.class, 5);
//        System.out.println("--User details fetched from Oracle DB--"+user);
    }
}
