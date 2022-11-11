package kodlamaio.Kodlama.io.Devs.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="subTechnology")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTechnology {

	@Id
	@Column(name="subTecId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subTecId;
	
	@Column(name="subTecName")
	private String subTecName;
	
	@ManyToOne()
	@JoinColumn(name="languages_id")
	private ProgrammingLanguage language;
}
