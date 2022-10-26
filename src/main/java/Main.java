public class Main {
        public static void main(String[] args) {

            HTTPRequest hr = new HTTPRequest();
            System.out.println(hr.createRequest(hr.english, hr.apiKey));

            hr.printRequestInDifferentLanguages();
        }
    }

