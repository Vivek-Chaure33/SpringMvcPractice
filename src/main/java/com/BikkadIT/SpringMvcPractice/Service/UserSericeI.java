package com.BikkadIT.SpringMvcPractice.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.SpringMvcPractice.Model.User;

public interface UserSericeI {
 public User saveUser(User user);
 public List<User> saveAllUser(List<User> userList);
 public long countNoOfRecord();
 public boolean recordExist(int id);
 public User findUserById(int id);
 public List<User> getAllUser();
 public List<User> getRecordsMultiplePK(List<Integer> list);
 public void deleteRecordById(int id); 
 public void deleteRecordByObject(User user);
 public void deleteMultipleRecordPK(List<Integer> list);
 public void deleteAllRecords();
 public Page<User> userPagination();
 public List<User> sortRecord();
 public User getUserByUserName(String userName);
 public User getUserByUserId(int userId);
 public User getUserByUserAddress(String addr);
 public User getUserByUserAge(int age);
 public User getByUserNameAndUserAddress(String uname,String uaddr);
 public List<User> getByUserNameOrUserAddress(String uname,String uaddr);
 public List<User> getByUserAgeGreaterThanEqual(int age);
 public List<User> getByUserAgeGreaterThan(int age);
 public List<User> getByUserAgeLessThanEqual(int age);
 public List<User> getByUserAgeLessThan(int age);
 public int countNoRecByUserName(String uname);
 public List<User> getByUserAgeBetween(int age1,int age2);
 public List<User> getByUserNameEquals(String uname);
 public List<User> getByUserAddressIs(String uaddress);
 public List<User> getByUserAgeAfter(int age);
 public List<User> getByUserAgeBefore(int age);
 //public List<User> getByUserAgeIsNull(int age);
 public boolean existsByUId(int id);
 
 public User fetchUserByIdHql(int userId);
 
 public User loginCheck(String uname,int uage);
 
 public User fetchUserByAgeSql(int userAge);
 
}
