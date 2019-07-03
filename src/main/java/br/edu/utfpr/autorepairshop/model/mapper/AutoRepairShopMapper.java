package br.edu.utfpr.autorepairshop.model.mapper;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.utfpr.autorepairshop.model.AutoRepairShop;
import br.edu.utfpr.autorepairshop.model.dto.AutoRepairShopDTO;


@Component
public class AutoRepairShopMapper {
    
	@Autowired
    private ModelMapper mapper;
	
	@Autowired
	private AddressMapper address;
    
	public AutoRepairShopDTO toDto(AutoRepairShop entity) {
    	AutoRepairShopDTO dto = mapper.map(entity, AutoRepairShopDTO.class);
        return dto;
    }
    
    public AutoRepairShopDTO toResponseDto(AutoRepairShop entity){
    	AutoRepairShopDTO dto = mapper.map(entity, AutoRepairShopDTO.class);
    	dto.setAddress(address.toDto(entity.getAddress()));
        return dto;
    }
    
    public AutoRepairShop toEntity(AutoRepairShopDTO dto) throws ParseException {
    	dto.convertAddress();
    	AutoRepairShop entity = mapper.map(dto, AutoRepairShop.class);
        return entity;
    }
}
