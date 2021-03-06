package fr.nantes.ustephan.web.service.impl;

import fr.nantes.ustephan.web.entity.Country;
import fr.nantes.ustephan.web.repository.CityRepository;
import fr.nantes.ustephan.web.repository.CountryRepository;
import fr.nantes.ustephan.web.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ughostephan on 26/11/2016.
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    @Transactional
    public Country findById(String id) {
        return countryRepository.findOne(id);
    }

    @Override
    @Transactional
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
