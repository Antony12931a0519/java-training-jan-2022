package com.advanced_java_examples.friendbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.advanced_java_examples.friendbook.entities.Test;

public interface TestDAO extends CrudRepository<Test, Integer> {

}
