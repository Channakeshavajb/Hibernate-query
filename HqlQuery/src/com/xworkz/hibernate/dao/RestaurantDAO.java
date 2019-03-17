   package com.xworkz.hibernate.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.hibernate.dto.RestaurantDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class RestaurantDAO {

	public RestaurantDAO() {
		// TODO Auto-generated constructor stub

		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	public void save(RestaurantDTO dto) {
		System.out.println("saving restaurant \t" + dto);
		SessionFactory factory = HibernateUtil.getFactory();
		System.out.println(factory != null ? "factory found" : "factory not found");
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {
			System.out.println("saving dto with session \t" + dto.getName());
			session.save(dto);
			transaction.commit();
			System.out.println("saving dto was successfully \t" + dto.getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception saving dto \t" + dto.getName());
		} finally {
			session.close();
			System.out.println("closing only session");
		}

	}
	
	
	public RestaurantDTO fetchByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			// step 1 prepare statement
			String syntax = "select rdto from RestaurantDTO rdto where rdto.name = '" + name +"'";
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query);
			
			// step 2 process the query
			RestaurantDTO dtoFromDb = (RestaurantDTO) query.uniqueResult();
			if(dtoFromDb != null) {
				System.out.println("data found for name: \t" + name);
				return dtoFromDb;
			}
			else {
				System.out.println("data not found for name : \t"+ name);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception fetcing ");
		}
		finally {
			session.close();
		}
		return null;
	}
}
