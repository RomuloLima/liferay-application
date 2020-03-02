package br.com.liferay.salestaxes.entity;

import java.math.BigDecimal;

public enum TaxTypeEnum {
    NA(BigDecimal.ZERO),
    BASIC(new BigDecimal("0.10")),
    IMPORTED(new BigDecimal("0.05")) ,
    BOTH(BASIC.getApplicableTax().add(IMPORTED.getApplicableTax()));
    private BigDecimal applicableTax;

    private TaxTypeEnum(BigDecimal tax) {
        applicableTax = tax;
    }

    public BigDecimal getApplicableTax() {
        return applicableTax;
    }
}
