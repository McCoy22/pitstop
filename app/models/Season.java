package models;

import play.*;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Season extends Model {
	
	@Required
	public String year;

	public Season(String year) {
		this.year = year;
	}

	public String toString() {
		return year;
	}
}
