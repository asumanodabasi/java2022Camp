package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModuleMapperService {
	ModelMapper forResponse();
	ModelMapper forRequest();
}
