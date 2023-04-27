package com.BikkadIT.SpringMvcPractice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringMvcPractice.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findUserByUserId(int userId);
	public User	findUserByUserName(String userName);
	public User findUserByUserAddress(String addr);
	public User findUserByUserAge(int age);
	public User findByUserNameAndUserAddress(String uname,String uaddr);
	public List<User> findByUserNameOrUserAddress(String uname,String uaddr);
	public List<User> findByUserAgeGreaterThanEqual(int age);
	public List<User> findByUserAgeGreaterThan(int age);
	public List<User> findByUserAgeLessThanEqual(int age);
	public List<User> findByUserAgeLessThan(int age);
	public int countByUserName(String uname);
	public List<User> findByUserAgeBetween(int age1,int age2);
	public List<User> findByUserNameEquals(String uname);
	public List<User> findByUserAddressIs(String uaddress);
	public List<User> findByUserAgeAfter(int age);
	public List<User> findByUserAgeBefore(int age);
	//public List<User> findByUserAgeIsNull(int age);
	public boolean existsByUserId(int id);
	
	@Query("from User where userId=:userId")
	public User getUserByIdHql(int userId);
	
	@Query("from User where userName=:uname and userAge=:uage")
	public User loginCheck(String uname,int uage);
	
	@Query( value = "select * from user_detail_new where uage=:userAge",nativeQuery = true)
	public User getUserByAgeSql(int userAge);
}
