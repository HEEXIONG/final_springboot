package com.springboot.project.sevice;

import java.util.List;

import com.springboot.project.model.NBoard;

public interface NBoardService {
	List<NBoard> getList(NBoard board);
	NBoard get(NBoard nboard);
	void registerNBoard(NBoard nboard);
	void updateNBoard(NBoard nboard);
	void deleteNBoard(NBoard nboard);
}
