package kodlamaio.Kodlama.io.Devs.business.requsts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteProgrammingLanguageRequest {
	private String name;
	private int id;
}
