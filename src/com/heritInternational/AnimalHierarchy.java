package com.heritInternational;

import com.heritInternational.model.Phylum;

public class AnimalHierarchy {
    private String latinName;
    private Phylum phylum;
    private String family;

    public AnimalHierarchy(String latinName, Phylum phylum, String family) {
        this.latinName = latinName;
        this.phylum = phylum;
        this.family = family;
    }

    @Override
    public String toString() {
        return "AnimalHierarchy{" +
                "latinName='" + latinName + '\'' +
                ", phylum=" + phylum +
                ", family='" + family + '\'' +
                '}';
    }
}
