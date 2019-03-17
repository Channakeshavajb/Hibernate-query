package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.dao.RestaurantDAO;
import com.xworkz.hibernate.dto.RestaurantDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setName("taj");
		restaurantDTO.setLocation("blr");
		restaurantDTO.setVeg(false);
		restaurantDTO.setNoOfRooms(15);

		RestaurantDAO restaurantDAO = new RestaurantDAO();
		restaurantDAO.save(restaurantDTO);
		System.out.println(HibernateUtil.getFactory().getStatistics());
		HibernateUtil.getFactory().close();
	}

}
