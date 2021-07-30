package model.copy.copy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue ()
	private long id;
	
	
}
