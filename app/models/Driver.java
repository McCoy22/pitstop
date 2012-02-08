package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Driver extends Model {

	@Required
	public Integer nr;
	
	@Required
	public String name;

	@Required
	public String nationality;

	@Required
	@ManyToOne
	public Team team;

	
	public String toString () {
		return "" + nr + ". " + name + " (" + team.name + ")";
	}
}
