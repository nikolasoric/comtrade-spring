package com.comtrade.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.comtrade.demo.entity.Language;

public interface LanguageRepo extends CrudRepository<Language, Integer>
{
	Language findByName(String name);
}
