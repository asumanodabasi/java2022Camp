package kodlamaio.Kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdSubTechnologyResponse {
	private int id;
	private String name;
	private int programmingLanId;
	private String progammingLanName;
}
