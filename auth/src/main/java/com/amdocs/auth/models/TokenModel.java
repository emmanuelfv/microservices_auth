package com.amdocs.auth.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="token")
public class TokenModel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Getter
	@Setter
	Long id;

	@Getter
	@Setter
	Long userId;

	@Getter
	@Setter
	String token;

	@Getter
	@Setter
	Date creationDate;

	@Getter
	@Setter
	Date lastUpdatedDate;


}
