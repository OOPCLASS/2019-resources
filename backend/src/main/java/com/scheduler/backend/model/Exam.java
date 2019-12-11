package com.scheduler.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam extends AbstractEntity {

	@Column(name = "exam_from")
	private Date from;
	@Column(name = "exam_to")
	private Date to;
}
