package com.isha.enlighta.controller;

import com.isha.enlighta.model.PersonData;
import com.isha.enlighta.service.PersonDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public class PersonDataController {

    PersonDataService personDataService = PersonDataService.getInstance();

    @PostMapping("/galacticCensus")
    public PersonData insert(@RequestBody Map<String, String> body){
        int id = Integer.parseInt(body.get("id"));
        String fullName = body.get("fullName");
        String dateOfBirth = body.get("dateOfBirth");
        String planetOfResidence = body.get("planetOfResidence");
        String gender = body.get("gender");
        String localAddress = body.get("localAddress");
        int annualIncome = Integer.parseInt(body.get("annualIncome"));
        return personDataService.createPersonData(id,fullName,dateOfBirth,planetOfResidence,gender,localAddress,annualIncome);
    }

    @GetMapping("/galaxy")
    public List<PersonData> index(){
        return personDataService.fetchPersonData();
    }

    @GetMapping("/galacticCensus/totalPerson")
    public int totalPersonInGalaxy(){
        return personDataService.getTotalPersonInGalaxy();
    }

    @GetMapping("/galacticCensus/totalPerson/{planet}")
    public int totalPersonOnPlanet(@PathVariable String planet){
        return personDataService.getTotalPersonOnPlanet(planet);
    }

    @GetMapping("/galacticCensus/perCapitaIncome")
    public double perCapitaIncomeInGalaxy(){
        return personDataService.getPerCapitaIncomeInGalaxy();
    }

    @GetMapping("/galacticCensus/perCapitaIncome/{planet}")
    public double perCapitaIncomeOnPlanet(@PathVariable String planet){
        return personDataService.getPerCapitaIncomeOnPlanet(planet);
    }

    @GetMapping("/galacticCensus/perCapitaStandardDeviation")
    public double perCapitaStandardDeviation(){
        return personDataService.getPerCapitaStandardDeviation();
    }
}
