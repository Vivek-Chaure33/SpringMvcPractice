package com.BikkadIT.SpringMvcPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.SpringMvcPractice.Controller.UserController;
import com.BikkadIT.SpringMvcPractice.Model.User;

@SpringBootApplication
public class SpringMvcPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringMvcPracticeApplication.class, args);
		UserController userController = context.getBean(UserController.class);

//		++++++++SAVE SINGLE DATA++++++++++
		
//		User user=new User();
//		user.setUserName("Vivek");
//		user.setUserAddress("Nashik");
//		user.setUserAge(27);
//		userController.createUser(user);
		
		
//	+++++++++SAVE ALL DATA++++++++++++++++

//		User user1=new User();
//		user1.setUserName("Nilesh");
//		user1.setUserAddress("Nashik");
//		user1.setUserAge(26);
//		
//		User user2=new User();
//		user2.setUserName("Ajay");
//		user2.setUserAddress("Malegaon");
//		user2.setUserAge(26);
//		
//		User user3=new User();
//		user3.setUserName("Dinesh");
//		user3.setUserAddress("Mumbai");
//		user3.setUserAge(28);
//		
//		List<User> userList=new ArrayList<>();
//		userList.add(user1);
//		userList.add(user2);
//		userList.add(user3);
//		
//		List<User> saveAllUser = userController.saveAllUser(userList);
//		System.out.println(saveAllUser);

//		+++++++++++++COUNT NUMBER OF DATA++++++++++++++
		
//		long records = userController.countNoOfRecords();
//		System.out.println(records);
	
//		+++++++++++++RECORD EXIST OR NOT+++++++++++++++
		
//		boolean recordExist = userController.recordExist(5);
//		if(recordExist) {
//			System.out.println("Record exist in database");
//		}else {
//			System.out.println("Record not found in database");
//		}
		
//		++++++++++++++FIND USER BY ID++++++++++++++
		
//		User byId = userController.findUserById(2);
//		System.out.println(byId);

//		++++++++++++++FIND ALL RECORD++++++++++++++		
		
//		List<User> allUser = userController.getAllUser();
//		System.out.println(allUser);
		
//		++++++++++FETCHING MULTIPLE RECORD++++++++++++++
//		List<Integer> list = Arrays.asList(52,54);
//		
//		
//		List<User> records_list = userController.getRecordsMultiplePK(list);
//		
//		System.out.println(records_list);
//	
//		++++++++++DELETE RECORD BY ID+++++++++++++
//		userController.deleteRecordById(4);
		
//		++++++++++DELETE RECORD BY OBJECT++++++++++++
//		user1.setUserId(3);
//		userController.deleteRecordByObject(user1);
		
//		+++++++++++DELETE MULTIPLE RECORD BY PRIMARY KEY++++++++++
		
//		List<Integer> asList = Arrays.asList(1,2);
//		userController.deleteMultipleRecordPK(asList);
		
		
//		+++++++++++DELETE ALL RECORDS++++++++++++++++
		
//		userController.deleteAllRecords();
		
//		+++++++Pagination+++++++++++
//		Page<User> userPagination = userController.userPagination();
//		System.out.println(userPagination);
//		for(User u:userPagination) {
//			System.out.println(u);
//		}
		
//		+++++++++SORT RECORD+++++++++++++
		
//		List<User> sortRecord = userController.sortRecord();
//		for(User u:sortRecord) {
//			System.out.println(u);
//		}
		
//		++++++++FIND USER BY ID++++++++
//		
//		User user = userController.findUserById(54);
//		System.out.println(user);

//		+++++++FIND USER BY NAME++++++++++
//		User byName = userController.getUserByUserName("Vivek");
//		System.out.println(byName);
		
//		+++++++++FIND USER BY ADDRESS++++++++++
//		User user = userController.getUserByUserAddress("Malegaon");
//		System.out.println(user);
		
//		++++++++FIND USER BY AGE+++++++++++++
//		User user = userController.getUserByUserAge(27);
//		System.out.println(user);
		
//		++++++++FIND BY NAME AND ADDRESS++++++++++
//		User user = userController.getByUserNameAndUserAddress("Vivek","Nashik");
//		System.out.println(user);
	
//		++++++++FIND BY NAME OR ADDRESS++++++++++
//		List<User> user = userController.getByUserNameOrUserAddress("Vivek","Mumbai");
//		System.out.println(user);
		
//		++++++++FIND BY AGE GREATER THAN EQUAL++++++++++
//		List<User> list = userController.getByUserAgeGreaterThanEqual(27);
//		System.out.println(list);
		
//		++++++++FIND BY AGE GREATER THAN++++++++++
//		List<User> list = userController.getByUserAgeGreaterThan(27);
//		System.out.println(list);
		
//		++++++++FIND BY LESS THAN EQUAL++++++++++
//		List<User> list = userController.getByUserAgeLessThanEqual(27);
//		System.out.println(list);
		
//		++++++++FIND BY AGE LESS THAN++++++++++
//		List<User> list = userController.getByUserAgeLessThan(27);
//		System.out.println(list);

//		++++++++FIND COUNT OF RECORD BY NAME++++++++++
//		int name = userController.countNoRecByUserName("Vivek");
//		System.out.println(name);		
		
//		++++++++FIND USERS WHOSE AGE BETWEEN++++++++++
//		List<User> byUserAgeBetween = userController.getByUserAgeBetween(20, 26);
//		System.out.println(byUserAgeBetween);
		
//		++++++++FIND USER WHOSE NAME EQUALS++++++++++
//		List<User> list = userController.getByUserNameEquals("Ajay");
//		System.out.println(list);
		
//		++++++++FIND USER WHOSE NAME IS++++++++++
//		List<User> list = userController.getByUserAddressIs("Nashik");
//		System.out.println(list);
		
//		++++++++FIND USER WHOSE AGE IS AFTER ++++++++++
//		List<User> byUserAgeAfter = userController.getByUserAgeAfter(27);
//		System.out.println(byUserAgeAfter);
		
//		++++++++FIND USER WHOSE AGE IS BEFORE ++++++++++
//		List<User> byUserAgeBefore = userController.getByUserAgeBefore(27);
//		System.out.println(byUserAgeBefore);
//	
		
//		List<User> isNull = userController.getByUserAgeIsNull(27);
//		System.out.println(isNull);
		
//		+++++++++++CHECK WHETHER DATA PRESENT OR NOT+++++++++
		
//		boolean existsByUId = userController.existsByUId(53);
//		if(existsByUId) {
//			User user = userController.findUserById(53);
//			System.out.println(user);
//		}else {
//			System.out.println("No record Found");
//		}
		
//		++++++++GET USER BY HQL QUERY++++++++++++
		
//		User hql = userController.fetchUserByIdHql(1);
//		System.out.println(hql);
		
//		++++++++++LOGIN CHECK+++++++++++
		
//		User user = userController.loginCheck("Nilesh", 26);
//		System.out.println(user);
		
//		+++++++++++GET USER BY AGE USING SQL NATIVE QUERY+++++++++
		
		User user = userController.fetchUserByAgeSql(28);
		System.out.println(user);
	}

}
