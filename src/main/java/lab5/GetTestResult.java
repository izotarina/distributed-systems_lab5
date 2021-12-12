package lab5;

public class GetTestResult {
    private final String url;
    private final int requestCount;


    public GetTestResult(String url, int requestCount) {
        this.url = url;
        this.requestCount = requestCount;
    }

    public String getUrl() {
        return url;
    }

    public int getRequestCount() {
        return requestCount;
    }
}
