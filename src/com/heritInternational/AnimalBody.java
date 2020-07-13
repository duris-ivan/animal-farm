package com.heritInternational;

import com.heritInternational.model.Beak;
import com.heritInternational.model.Lip;
import com.heritInternational.model.Sex;
import com.heritInternational.model.Voice;
import com.heritInternational.model.Wings;

public class AnimalBody {
    private Beak beak;
    private Lip lip;
    private Wings wings;
    private Sex sex;
    private byte numberOfLegs;
    private byte numberOfToes;
    private Voice voice;
    private short lengthOfTailInCm;

    public AnimalBody(Beak beak, Wings wings, Sex sex, byte numberOfLegs, byte numberOfToes, Voice voice) {
        this.beak = beak;
        this.wings = wings;
        this.sex = sex;
        this.numberOfLegs = numberOfLegs;
        this.numberOfToes = numberOfToes;
        this.voice = voice;
    }

    public AnimalBody(Lip lip, Sex sex, byte numberOfLegs, byte numberOfToes, Voice voice, short lengthOfTailInCm) {
        this.lip = lip;
        this.sex = sex;
        this.numberOfLegs = numberOfLegs;
        this.numberOfToes = numberOfToes;
        this.voice = voice;
        this.lengthOfTailInCm = lengthOfTailInCm;
    }

    @Override
    public String toString() {
        return "AnimalBody{" +
                "beak=" + beak +
                ", lip=" + lip +
                ", wings=" + wings +
                ", sex=" + sex +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfToes=" + numberOfToes +
                ", voice=" + voice +
                ", lengthOfTailInCm=" + lengthOfTailInCm +
                '}';
    }
}
