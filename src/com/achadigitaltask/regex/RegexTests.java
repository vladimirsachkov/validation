package com.achadigitaltask.regex;

import java.util.ArrayList;

public class RegexTests {
    public static void main(String[] args) {
        ArrayList<String> testIdDocCodes = new ArrayList<>();
        testIdDocCodes.add("CODE");
        testIdDocCodes.add("COD1_");
        testIdDocCodes.add("KOD_1");
        testIdDocCodes.add("1KOD");
        testIdDocCodes.add("КОД");

        resultsOfTestValidationShow(testIdDocCodes);
    }

    private static void resultsOfTestValidationShow (ArrayList<String> testIdDocCodes) {
        for (String testIdDocCode: testIdDocCodes) {
            System.out.println(testIdDocCode + " : " + Regex.idDocValidation(testIdDocCode));
        }
    }
}
