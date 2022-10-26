public class HTTPRequest {
    String greek = "Λονδίνο";
    String persian = "لندن";
    String hindi = "लंदन";
    String french = "Londres";

    public String english = "London";

    public String apiKey = "ApiKey";
    public String createRequest(String cityName, String apiKey) {

        String request = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey;

        return request;
    }

    public void printRequestInDifferentLanguages() {
        System.out.println(createRequest(greek, apiKey));
        System.out.println(createRequest(persian, apiKey));
        System.out.println(createRequest(hindi, apiKey));
        System.out.println(createRequest(french, apiKey));
    }
}
