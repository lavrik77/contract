package ru.lavrinenko.inserance.contract;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.lavrinenko.inserance.contract.model.SizeObject;
import ru.lavrinenko.inserance.contract.model.TypeObject;
import ru.lavrinenko.inserance.contract.model.YearObject;

@Component
@Setter
public class AppProperties {

  @Value("${coeff.type.FLAT}")
  private String flatCoeff;
  @Value("${coeff.type.HAUSE}")
  private String hauseCoeff;
  @Value("${coeff.type.ROOM}")
  private String roomCoeff;

  @Value("${coeff.year.LESS}")
  private String lessCoeff;
  @Value("${coeff.year.BETWEEN}")
  private String betweenCoeff;
  @Value("${coeff.year.AFTER}")
  private String afterCoeff;

  @Value("${coeff.size.SMALL}")
  private String smallCoeff;
  @Value("${coeff.size.MEDIUM}")
  private String mediumCoeff;
  @Value("${coeff.size.LARGE}")
  private String largeCoeff;

  public Double getTypeCoeff(TypeObject type) {
    Double value;
    switch (type) {
      case FLAT:
        value = Double.valueOf(this.flatCoeff);
        break;
      case HAUSE:
        value = Double.valueOf(this.hauseCoeff);
        break;
      case ROOM:
        value = Double.valueOf(this.roomCoeff);
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
    return value;
  }

  public Double getYearCoeff(YearObject year) {
    Double value;
    switch (year) {
      case LESS:
        value = Double.valueOf(this.lessCoeff);
        break;
      case BETWEEN:
        value = Double.valueOf(this.betweenCoeff);
        break;
      case AFTER:
        value = Double.valueOf(this.afterCoeff);
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + year);
    }
    return value;
  }

  public Double getSizeCoeff(SizeObject size) {
    Double value;
    switch (size) {
      case SMALL:
        value = Double.valueOf(this.smallCoeff);
        break;
      case MEDIUM:
        value = Double.valueOf(this.mediumCoeff);
        break;
      case LARGE:
        value = Double.valueOf(this.largeCoeff);
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + size);
    }
    return value;
  }
}
