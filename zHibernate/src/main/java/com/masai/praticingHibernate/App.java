package com.masai.praticingHibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholersConnection");
    	        EntityManager entityManager = emf.createEntityManager();

    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Enter operation (create/read/update/delete):");
    	        String operation = scanner.nextLine();

    	        switch (operation.toLowerCase()) {
    	            case "create":
    	                createScholers(entityManager);
    	                break;
    	            case "read":
    	                readScholers(entityManager);
    	                break;
    	            case "update":
    	                updateScholers(entityManager);
    	                break;
    	            case "delete":
    	                deleteScholers(entityManager);
    	                break;
    	            default:
    	                System.out.println("Invalid operation.");
    	                break;
    	        }

    	        entityManager.close();
    	        emf.close();
    	    }

    	    private static void createScholers(EntityManager entityManager) {
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Enter Scholers ID:");
    	        int id = scanner.nextInt();
    	        scanner.nextLine(); // Consume the newline character
    	        System.out.println("Enter Scholers Name:");
    	        String name = scanner.nextLine();
    	        System.out.println("Enter Scholers classID:");
    	        int classID = scanner.nextInt();

    	        EntityTransaction transaction = entityManager.getTransaction();
    	        transaction.begin();

    	        Scholers Scholers = new Scholers(id, name, classID);
    	        entityManager.persist(Scholers);

    	        transaction.commit();
    	        System.out.println("Scholers created successfully.");
    	    }

    	    private static void readScholers(EntityManager entityManager) {
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Enter Scholers ID to retrieve:");
    	        int id = scanner.nextInt();

    	        Scholers Scholers = entityManager.find(Scholers.class, id);
    	        if (Scholers != null) {
    	            System.out.println("Scholers details:");
    	            System.out.println("ID: " + Scholers.getId());
    	            System.out.println("Name: " + Scholers.getName());
    	            System.out.println("classID: " + Scholers.getClassID());
    	        } else {
    	            System.out.println("Scholers not found.");
    	        }
    	    }

    	    private static void updateScholers(EntityManager entityManager) {
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Enter Scholers ID to update:");
    	        int id = scanner.nextInt();
    	        scanner.nextLine(); // Consume the newline character

    	        EntityTransaction transaction = entityManager.getTransaction();
    	        transaction.begin();

    	        Scholers Scholers = entityManager.find(Scholers.class, id);
    	        if (Scholers != null) {
    	            System.out.println("Enter new Scholers Name:");
    	            String newName = scanner.nextLine();

    	            Scholers.setName(newName);
    	            entityManager.merge(Scholers);

    	            transaction.commit();
    	            System.out.println("Scholers updated successfully.");
    	        } else {
    	            System.out.println("Scholers not found.");
    	        }
    	    }

    	    private static void deleteScholers(EntityManager entityManager) {
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Enter Scholers ID to delete:");
    	        int id = scanner.nextInt();

    	        EntityTransaction transaction = entityManager.getTransaction();
    	        transaction.begin();

    	        Scholers Scholers = entityManager.find(Scholers.class, id);
    	        if (Scholers != null) {
    	            entityManager.remove(Scholers);

    	            transaction.commit();
    	            System.out.println("Scholers deleted successfully.");
    	        } else {
    	            System.out.println("Scholers not found.");
    	        }
    	    }
}
