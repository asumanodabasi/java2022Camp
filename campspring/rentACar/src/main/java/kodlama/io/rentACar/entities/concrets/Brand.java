package kodlama.io.rentACar.entities.concrets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	@Id //sen veri tabaninda primary keysin
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //id si otomatik artan
	@Column(name="id") 
	private int id; //ustteki kod bu koda diyoki:sen brands tablosunun icindeki id column a karsilik geliceksin
	
	@Column(name="name")
	private String name;
	
	

}
