package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName = "D:/CS/fortune-data.txt";
	
	private List<String> theFortunes;
	
	private Random random = new Random();
	
	public FileFortuneService() {
		
		System.out.println(">> FileFortuneService: inside of default constructor");
		
	}
	
	@PostConstruct
	public void loadTheFile() {
		System.out.println(">> FileFortuneService: inside of loadTheFile() method");
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		theFortunes = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
			
			String tempLine;
			
			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public String getFortune() {
		
		int index = random.nextInt(theFortunes.size());
		
		String fortune = theFortunes.get(index);
		
		return fortune;
	}

}
