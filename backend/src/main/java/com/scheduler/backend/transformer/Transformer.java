package com.scheduler.backend.transformer;

import java.sql.ResultSet;
import java.util.List;

import com.scheduler.backend.model.AbstractEntity;

public interface Transformer<T extends AbstractEntity> {

	T toModel(ResultSet resultSet);
	
	List<T> toModelList(ResultSet resultSet);
}
