package com.BikkadIT.SpringMvcPractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.SpringMvcPractice.Model.User;
import com.BikkadIT.SpringMvcPractice.Service.UserSericeI;



@RestController
public class UserController {
	@Autowired
	private UserSericeI userServiceI;
	public User createUser(User user) {
		User user1 = userServiceI.saveUser(user);
		return user1;
	}
	public List<User> saveAllUser(List<User> user){
		
		List<User> saveAllUser = userServiceI.saveAllUser(user);
		
		return saveAllUser;
	}
	public long countNoOfRecords() {
		long count = userServiceI.countNoOfRecord();
		
		return count;
	}
	public boolean recordExist(int id) {
		boolean recordExist = userServiceI.recordExist(id);
		
		return recordExist;
	}
	
	public User findUserById(int id) {
		User findById = userServiceI.findUserById(id);
		return findById;
	}
	public List<User> getAllUser() {
		List<User> findAll = (List<User>)userServiceI.getAllUser();
		return findAll;
	}
	public List<User> getRecordsMultiplePK(List<Integer> list) {
		List<User> findAllById = (List<User>)userServiceI.getRecordsMultiplePK(list);
		return findAllById;
	}
	public void deleteRecordById(int id) {
		userServiceI.deleteRecordById(id);
		
	}
	
	public void deleteRecordByObject(User user) {
		userServiceI.deleteRecordByObject(user);
		
	}
	
	public void deleteMultipleRecordPK(List<Integer> list) {
		userServiceI.deleteMultipleRecordPK(list);;
		
	}
	public void deleteAllRecords() {
		userServiceI.deleteAllRecords();
	}
	
	public Page<User> userPagination(){
		Page<User> findAll = userServiceI.userPagination();
		
		return findAll;
	}
	public List<User> sortRecord(){
		
		List<User> sortRecord = userServiceI.sortRecord();
		return sortRecord;
	}
	public User getUserByUserName(String userName) {
		User user = userServiceI.getUserByUserName(userName);
		
		return user;
	}
	public User getUserById(int userId) {
		User userById = userServiceI.getUserByUserId(userId);
		return userById;
	}
	public User getUserByUserAddress(String addr) {
		User userAddress = userServiceI.getUserByUserAddress(addr);
		
		return userAddress;
	}
	
	public User getUserByUserAge(int age) {
		User byUserAge = userServiceI.getUserByUserAge(age);
		return byUserAge;
	}
	
	public User getByUserNameAndUserAddress(String uname,String uaddr) {
		User nameAndUserAddress = userServiceI.getByUserNameAndUserAddress(uname, uaddr);
		
		return nameAndUserAddress;
	}
	public List<User> getByUserNameOrUserAddress(String uname,String uaddr) {
		List<User> nameOrUserAddress = userServiceI.getByUserNameOrUserAddress(uname, uaddr);
		
		return nameOrUserAddress;
	}
	
	public List<User> getByUserAgeGreaterThanEqual(int age) {
		List<User> greaterThanEqual = userServiceI.getByUserAgeGreaterThanEqual(age);
		return greaterThanEqual;
	}
	public List<User> getByUserAgeGreaterThan(int age) {
		List<User> greaterThan = userServiceI.getByUserAgeGreaterThan(age);
		return greaterThan;
	}
	
	public List<User> getByUserAgeLessThanEqual(int age) {
		List<User> thanEqual = userServiceI.getByUserAgeLessThanEqual(age);
		return thanEqual;
	}

	
	public List<User> getByUserAgeLessThan(int age) {
		List<User> lessThan = userServiceI.getByUserAgeLessThan(age);
		return lessThan;
	}
	public int countNoRecByUserName(String uname) {
		int userName = userServiceI.countNoRecByUserName(uname);
		return userName;
	}
	
	public List<User> getByUserAgeBetween(int age1, int age2) {
		List<User> findByUserAgeBetween = userServiceI.getByUserAgeBetween(age1, age2);
		return findByUserAgeBetween;
	}
	public List<User> getByUserNameEquals(String uname) {
		List<User> userNameEquals = userServiceI.getByUserNameEquals(uname);
		return userNameEquals;
	}
	
	public List<User> getByUserAddressIs(String uaddress) {
		List<User> is = userServiceI.getByUserAddressIs(uaddress);
		return is;
	}
	
	public List<User> getByUserAgeAfter(int age) {
		List<User> findByUserAgeAfter = userServiceI.getByUserAgeAfter(age);
		return findByUserAgeAfter;
	}

	
	public List<User> getByUserAgeBefore(int age) {
		List<User> findByUserAgeBefore = userServiceI.getByUserAgeBefore(age);
		return findByUserAgeBefore;
	}
//	public List<User> getByUserAgeIsNull(int age) {
//		List<User> ageIsNull = userServiceI.getByUserAgeIsNull(age);
//		return ageIsNull;
//	}
	public boolean existsByUId(int id) {
		boolean existsById = userServiceI.existsByUId(id);
		return existsById;
	}
	
	public User fetchUserByIdHql(int userId) {
		User byIdHql = userServiceI.fetchUserByIdHql(userId);
		return byIdHql;
	}
	
	public User loginCheck(String uname, int uage) {
		User check = userServiceI.loginCheck(uname, uage);
		return check;
	}
	
	public User fetchUserByAgeSql(int userAge) {
		User sql = userServiceI.fetchUserByAgeSql(userAge);
		return sql;
	}
	
}
