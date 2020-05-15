package de.slevermann.jackson.csv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ModelWithString {
    @JsonProperty("STRINGS")
    private List<String> strings;

    @JsonProperty("OTHER_FIELD")
    private String otherField;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public String getOtherField() {
        return otherField;
    }

    public void setOtherField(String otherField) {
        this.otherField = otherField;
    }

}
