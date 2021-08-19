package com.pm.user.webapp.dto;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum FolioType {
    PASSENGER("P"),
    CREW("C");

    private final String apiCode;

    FolioType(String apiCode) {
        this.apiCode = apiCode;
    }

    public static FolioType fromApiCode(String apiCode) {
        return Arrays.stream(values())
                .filter(folioType -> folioType.getApiCode().equals(apiCode))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No FolioType found with code " + apiCode));
    }

    public String getApiCode() {
        return apiCode;
    }
}
