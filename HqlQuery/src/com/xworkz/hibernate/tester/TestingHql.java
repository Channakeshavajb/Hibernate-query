package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.dao.RestaurantDAO;
import com.xworkz.hibernate.dto.RestaurantDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class TestingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantDAO dao = new RestaurantDAO();
		RestaurantDTO dto = dao.fetchByName("taj");
		System.out.println("data from the db is : \t" + dto);
		if (dto != null) {
			System.out.println("Booking hotel");
		}
		HibernateUtil.getFactory().close();

	}

}
