package utils;



public class SeleniumConfig{
    private static final String BASE_URL;

    static {
        BASE_URL = "https://app-stg.converted.in/login";

    }
    public static String getValue() {
        return BASE_URL;
    }
}