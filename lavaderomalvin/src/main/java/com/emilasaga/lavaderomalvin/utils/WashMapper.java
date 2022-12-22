package com.emilasaga.lavaderomalvin.utils;

import com.emilasaga.lavaderomalvin.core.wash.dtos.WashDTO;
import com.emilasaga.lavaderomalvin.core.wash.model.Wash;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WashMapper {

    WashMapper INSTANCE = Mappers.getMapper(WashMapper.class);

    void update(WashDTO modifiedWash, @MappingTarget Wash existingWash);
}
