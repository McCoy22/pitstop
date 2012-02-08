package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Team extends Model {

	@Required
	public String name;

	@Required
	public String nationality;

	@OneToMany(mappedBy = "team")
	public List<Driver> drivers;
	
	public String toString () {
		return name + " (" + nationality + ")";
	}

}
