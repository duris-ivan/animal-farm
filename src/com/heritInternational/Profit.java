package com.heritInternational;

import com.heritInternational.model.UnitOfProfit;

public class Profit {
    private String mainAnimalProfit;
    private float countProfit;
    private UnitOfProfit unitOfProfit;

    public Profit(String mainAnimalProfit, float countProfit) {
        this.mainAnimalProfit = mainAnimalProfit;
        this.countProfit = countProfit;
    }

    public Profit(String mainAnimalProfit, float countProfit, UnitOfProfit unitOfProfit) {
        this.mainAnimalProfit = mainAnimalProfit;
        this.countProfit = countProfit;
        this.unitOfProfit = unitOfProfit;
    }

    @Override
    public String toString() {
        return "Profit{" +
                "mainAnimalProfit='" + mainAnimalProfit + '\'' +
                ", countProfit=" + countProfit +
                ", unitOfProfit=" + unitOfProfit +
                '}';
    }
}
