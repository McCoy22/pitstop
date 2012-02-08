package models;

import play.*;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Tipp extends Model {
    
	@Required
	@ManyToOne
	public Race race;
	
	@Required
	@ManyToOne
	public User user;
	
	@Required
	public Driver platz1;
	@Required 
	public Driver platz2;
	@Required
	public Driver platz3;

}
