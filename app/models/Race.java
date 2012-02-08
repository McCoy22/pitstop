package models;

import play.*;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Race extends Model {
	
	@Required
	public String country;
	
	@Required
	public String city;
	
	@Required
	public Season season;
    
}
