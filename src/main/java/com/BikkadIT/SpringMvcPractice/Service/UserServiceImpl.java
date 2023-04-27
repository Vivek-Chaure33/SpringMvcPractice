package com.BikkadIT.SpringMvcPractice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringMvcPractice.Model.User;
import com.BikkadIT.SpringMvcPractice.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserSericeI{
	
	@Autowired
	private UserRepository repository;

	@Override
	public User saveUser(User user) {
		User user2 = repository.save(user);
		return user2;
	}

	@Override
	public List<User> saveAllUser(List<User> userList) {
		List<User> saveAll = (List<User>)repository.saveAll(userList);
		return saveAll;
	}

	@Override
	public long countNoOfRecord() {
		long count = repository.count();
		return count;
	}

	@Override
	public boolean recordExist(int id) {
		boolean existsById = repository.existsById(id);
		return existsById;
	}

	@Override
	public User findUserById(int id) {
		User findById = repository.findById(id).get();
		
		return findById;
	}

	@Override
	public List<User> getAllUser() {
		List<User> findAll = (List<User>)repository.findAll();
		return findAll;
	}

	@Override
	public List<User> getRecordsMultiplePK(List<Integer> list) {
		List<User> findAllById = (List<User>)repository.findAllById(list);
		return findAllById;
	}

	@Override
	public void deleteRecordById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void deleteRecordByObject(User user) {
		repository.delete(user);
		
	}

	@Override
	public void deleteMultipleRecordPK(List<Integer> list) {
		repository.deleteAllById(list);
		
	}

	@Override
	public void deleteAllRecords() {
		repository.deleteAll();
		
	}

	@Override
	public Page<User> userPagination() {
		PageRequest of = PageRequest.of(1, 2);
		Page<User> findAll = repository.findAll(of);
		return findAll;
	}

	@Override
	public List<User> sortRecord() {
		List<User> sortUser = repository.findAll(Sort.by("userName").descending());
		return sortUser;
	}

	@Override
	public User getUserByUserName(String userName) {
		User findUserByName = repository.findUserByUserName(userName);
		return findUserByName;
	}

	@Override
	public User getUserByUserId(int userId) {
		User byId = repository.findUserByUserId(userId);
		return byId;
	}

	@Override
	public User getUserByUserAddress(String addr) {
		User user = repository.findUserByUserAddress(addr);
		return user;
	}

	@Override
	public User getUserByUserAge(int age) {
		User userAge = repository.findUserByUserAge(age);
		return userAge;
	}

	@Override
	public User getByUserNameAndUserAddress(String uname, String uaddr) {
		User byNameAndAddr = repository.findByUserNameAndUserAddress(uname, uaddr);
		return byNameAndAddr;
	}

	@Override
	public List<User> getByUserNameOrUserAddress(String uname, String uaddr) {
		List<User> nameOrUserAddress = repository.findByUserNameOrUserAddress(uname, uaddr);
		return nameOrUserAddress;
	}

	@Override
	public List<User> getByUserAgeGreaterThanEqual(int age) {
		List<User> greaterThanEqual = repository.findByUserAgeGreaterThanEqual(age);
		return greaterThanEqual;
	}
	@Override
	public List<User> getByUserAgeGreaterThan(int age) {
		List<User> greaterThan = repository.findByUserAgeGreaterThan(age);
		return greaterThan;
	}

	@Override
	public List<User> getByUserAgeLessThanEqual(int age) {
		List<User> thanEqual = repository.findByUserAgeLessThanEqual(age);
		return thanEqual;
	}

	@Override
	public List<User> getByUserAgeLessThan(int age) {
		List<User> lessThan = repository.findByUserAgeLessThan(age);
		return lessThan;
	}

	@Override
	public int countNoRecByUserName(String uname) {
		int userName = repository.countByUserName(uname);
		return userName;
	}

	@Override
	public List<User> getByUserAgeBetween(int age1, int age2) {
		List<User> findByUserAgeBetween = repository.findByUserAgeBetween(age1, age2);
		return findByUserAgeBetween;
	}

	@Override
	public List<User> getByUserNameEquals(String uname) {
		List<User> userNameEquals = repository.findByUserNameEquals(uname);
		return userNameEquals;
	}

	@Override
	public List<User> getByUserAddressIs(String uaddress) {
		List<User> is = repository.findByUserAddressIs(uaddress);
		return is;
	}

	@Override
	public List<User> getByUserAgeAfter(int age) {
		List<User> findByUserAgeAfter = repository.findByUserAgeAfter(age);
		return findByUserAgeAfter;
	}

	@Override
	public List<User> getByUserAgeBefore(int age) {
		List<User> findByUserAgeBefore = repository.findByUserAgeBefore(age);
		return findByUserAgeBefore;
	}

	@Override
	public boolean existsByUId(int id) {
		boolean existsById = repository.existsByUserId(id);
		return existsById;
	}

	@Override
	public User fetchUserByIdHql(int userId) {
		User byIdHql = repository.getUserByIdHql(userId);
		return byIdHql;
	}

	@Override
	public User loginCheck(String uname, int uage) {
		User check = repository.loginCheck(uname, uage);
		return check;
	}

	@Override
	public User fetchUserByAgeSql(int userAge) {
		User sql = repository.getUserByAgeSql(userAge);
		return sql;
	}

//	@Override
//	public List<User> getByUserAgeIsNull(int age) {
//		List<User> ageIsNull = repository.findByUserAgeIsNull(age);
//		return ageIsNull;
//	}
	
	
}
