package kodlamaio.Kodlama.io.Devs.business.requsts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProgrammingLanguageRequest {
	private int id;
	private String name;
}
