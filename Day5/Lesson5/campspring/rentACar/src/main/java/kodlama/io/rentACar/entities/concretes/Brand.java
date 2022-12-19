package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Data // getter ve setter + parametresiz constructor(@Data = @Getter+@Setter)
@AllArgsConstructor // tüm parametreli constructor (@NoArgsConstructor= parametresiz)
@Entity
@NoArgsConstructor // parametresiz constructor
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
}
