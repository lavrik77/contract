package ru.lavrinenko.inserance.contract.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import ru.lavrinenko.inserance.contract.model.SizeObject;
import ru.lavrinenko.inserance.contract.model.TypeObject;
import ru.lavrinenko.inserance.contract.model.YearObject;
import ru.lavrinenko.inserance.contract.services.CoefficientService;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Map;

@RestController
public class CoefficientController {

    @Autowired
    private CoefficientService coefficientService;

    private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");

    @GetMapping(path = "/api/typeenums")
    public Map<String, Map<TypeObject, String>> typeEnums() {
        return coefficientService.getTypeEnum();
    }

    @GetMapping(path = "/api/sizeenums")
    public Map<String, Map<SizeObject, String>> sizeEnums() {
        return coefficientService.getSizeEnum();
    }

    @GetMapping(path = "/api/yearenums")
    public Map<String, Map<YearObject, String>> yearEnums() {
        return coefficientService.getYeartEnum();
    }

    @GetMapping(path = "/api/typecoeff")
    public Map<String, Map<TypeObject, Double>> typeCoeff() {
        return coefficientService.getTypeCoeff();
    }

    @GetMapping(path = "/api/yearcoeff")
    public Map<String, Map<YearObject, Double>> yearCoeffs() {
        return coefficientService.getYearCoeff();
    }

    @GetMapping(path = "/api/sizecoeff")
    public Map<String, Map<SizeObject, Double>> sizeCoeffs() {
        return coefficientService.getSizeCoeff();
    }



    private String getSessionId() {
        return RequestContextHolder.currentRequestAttributes().getSessionId();
    }
}
