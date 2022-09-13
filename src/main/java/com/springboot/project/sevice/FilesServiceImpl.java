package com.springboot.project.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.model.Files;
import com.springboot.project.repository.FilesRepository;

@Service
public class FilesServiceImpl implements FilesService {

	@Autowired
	FilesRepository filesRepository;

	@Override
	public void save(Files files) {
		Files f = new Files();
		f.setFileName(files.getFileName());
		f.setUuid(files.getUuid());
		f.setUploadPath(files.getUploadPath());
		
		filesRepository.save(f);
	}
	
	
}
