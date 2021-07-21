package ru.lavrinenko.inserance.contract.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lavrinenko.inserance.contract.AppProperties;
import ru.lavrinenko.inserance.contract.model.SizeObject;
import ru.lavrinenko.inserance.contract.model.TypeObject;
import ru.lavrinenko.inserance.contract.model.YearObject;

import java.util.HashMap;
import java.util.Map;

@Service
public class CoefficientService {

  @Autowired
  private AppProperties appProperties;

  public Map<String, Map<TypeObject, Double>> getTypeCoeff() {
    Map<String, Map<TypeObject, Double>> coeffs = new HashMap<>();
    Map<TypeObject, Double> type = new HashMap<>();
    for(TypeObject obj: TypeObject.values()){
      type.put(obj,appProperties.getTypeCoeff(obj));
    }
    coeffs.put("TypeObject", type);
    return coeffs;
  }

  public Map<String, Map<YearObject, Double>> getYearCoeff() {
    Map<String, Map<YearObject, Double>> coeffs = new HashMap<>();
    Map<YearObject, Double> year = new HashMap<>();
    for(YearObject obj: YearObject.values()){
      year.put(obj,appProperties.getYearCoeff(obj));
    }
    coeffs.put("YearObject", year);
    return coeffs;
  }

  public Map<String, Map<SizeObject, Double>> getSizeCoeff() {
    Map<String, Map<SizeObject, Double>> coeffs = new HashMap<>();
    Map<SizeObject, Double> size = new HashMap<>();
    for(SizeObject obj: SizeObject.values()){
      size.put(obj,appProperties.getSizeCoeff(obj));
    }
    coeffs.put("SizeObject", size);
    return coeffs;
  }

  public Map<String, Map<TypeObject, String>> getTypeEnum() {
    Map<String, Map<TypeObject, String>> model = new HashMap<>();
    Map<TypeObject, String> type = new HashMap<>();
    for(TypeObject obj: TypeObject.values()){
      type.put(obj,obj.getTitle());
    }
    model.put("TypeObject", type);

    return model;
  }

  public Map<String, Map<YearObject, String>> getYeartEnum() {
    Map<String, Map<YearObject, String>> model = new HashMap<>();
    Map<YearObject, String> type = new HashMap<>();
    for(YearObject obj: YearObject.values()){
      type.put(obj,obj.getTitle());
    }
    model.put("YearObject", type);

    return model;
  }

  public Map<String, Map<SizeObject, String>> getSizeEnum() {
    Map<String, Map<SizeObject, String>> model = new HashMap<>();
    Map<SizeObject, String> type = new HashMap<>();
    for(SizeObject obj: SizeObject.values()){
      type.put(obj,obj.getTitle());
    }
    model.put("SizeObject", type);

    return model;
  }
}
