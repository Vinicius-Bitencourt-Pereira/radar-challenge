package br.com.radar.challenge.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_person")
public class PersonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(nullable = false, unique = false, length = 150)
	private String name;
	
	@Column(nullable = false, unique = false, length = 50)
	private String gender;
	
	@Column(nullable = false)
	private LocalDate birthDate;
	
	@Column(nullable = false, unique = true, length = 50)
	private String phone;
	
	@Column(nullable = false, unique = true, length = 150)
	private String email;
	
	public PersonModel() {
	}

	public PersonModel(Long id, String name, String gender, LocalDate bythDate, String phone, String email) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthDate = bythDate;
		this.phone = phone;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBythDate() {
		return birthDate;
	}

	public void setBythDate(LocalDate bythDate) {
		this.birthDate = bythDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonModel other = (PersonModel) obj;
		return Objects.equals(id, other.id);
	}
	
}
