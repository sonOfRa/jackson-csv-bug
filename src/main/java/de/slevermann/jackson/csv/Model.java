package de.slevermann.jackson.csv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Model {

    @JsonProperty("LONGS")
    private List<Long> longs;

    @JsonProperty("OTHER_FIELD")
    private String otherField;

    public List<Long> getLongs() {
        return longs;
    }

    public void setLongs(List<Long> longs) {
        this.longs = longs;
    }

    public String getOtherField() {
        return otherField;
    }

    public void setOtherField(String otherField) {
        this.otherField = otherField;
    }
}
