package com.emilasaga.lavaderomalvin.core.wash.usecases;

import com.emilasaga.lavaderomalvin.core.wash.dtos.WashDTO;
import com.emilasaga.lavaderomalvin.core.wash.model.Wash;
import com.emilasaga.lavaderomalvin.repositories.WashRepository;
import com.emilasaga.lavaderomalvin.utils.WashMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateWash {

    @Autowired
    private WashRepository washRepository;

    public void execute(final Long washId, final WashDTO wash) {

        final Optional<Wash> optionalExistingWash = this.washRepository.findById(washId);

        if (optionalExistingWash.isPresent()) {
          final Wash existingWash = optionalExistingWash.get();

            WashMapper.INSTANCE.update(wash, existingWash);
            washRepository.save(existingWash);
        }

    }
}
