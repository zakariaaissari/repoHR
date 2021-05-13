package com.HRPlus.space.services;

import com.HRPlus.space.entities.Document;
import com.HRPlus.space.repositories.IDocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl {

	@Autowired
	private IDocumentRepo docRepo;

	public List<Document> getAllDocuments(Document doc) {
		return docRepo.findAll();
	}
	
	public Document saveDocument (Document doc) {
		return docRepo.save(doc);
	}
	

	
}
