package org.example;

import org.example.config.Config;
import org.example.entity.Capital;
import org.example.entity.Country;
import org.example.entity.National;
import org.example.repository.CapitalRepository;
import org.example.repository.CountryRepository;

public class App {
    public static void main(String[] args) {

        //Config.getEntityManager();
        Capital capital = new Capital();
        capital.setArea(23654L);
        capital.setName("Bishkek");
        capital.setPopulation(20000000L);

        Country country = new Country("Italy", 199870D, 1432564d, 1170000L);
        National national = new National("Besh-Barmak", "kyrgys language", "kyz-kuumai");
        country.setNational(national);
        //country.setCapital(capital);

        CountryRepository countryRepository = new CountryRepository();
        CapitalRepository capitalRepository = new CapitalRepository();
        capitalRepository.saveCapital(capital);
        //countryRepository.saveCountry(country);
       // countryRepository.getAllCountries().forEach(System.out::println);
        //countryRepository.deleteById(2L);
        //countryRepository.update(2L, country);
//        countryRepository.addCapital(capital);
    }
}