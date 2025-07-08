package com.LPU.TaskManagement;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String title;
	private boolean completed;
	
	Task(long id, String title, boolean completed){
		this.id = id;
		this.title = title;
		this.completed=completed;
	}
	public long getId(){
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public boolean getCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed=completed;
	}
	public Task() {
		super();
	}
}
