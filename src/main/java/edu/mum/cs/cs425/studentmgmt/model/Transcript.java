package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Transcript {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transcriptId;
	
	@NotNull
	private String degreeTitle;

	public Transcript() {}

	public Transcript(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public Long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, degreeTitle=%s]", transcriptId, degreeTitle);
	} 
	
}