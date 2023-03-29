package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service //her seferinde instance uretmemizi engeller IoC ye yerlesir
@AllArgsConstructor
public class ModuleMapperManager implements ModuleMapperService {
   private ModelMapper modelMapper;
	@Override
	public ModelMapper forResponse() {
		//gevsek yaptik orn:veri tabanında bazı yerler response edilmedigi zaman bize kızma olanlari maple
		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelMapper;
	}

	@Override
	public ModelMapper forRequest() {
		//request aldigimzda her seyin bi karsiligi olamali yoksa kiz
		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
	}

}
