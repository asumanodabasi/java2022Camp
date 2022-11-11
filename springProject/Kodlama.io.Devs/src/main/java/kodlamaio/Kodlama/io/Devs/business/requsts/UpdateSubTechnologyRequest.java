package kodlamaio.Kodlama.io.Devs.business.requsts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnologyRequest {
	private int id;
	private String name;
	private int programmingLanId;
}
