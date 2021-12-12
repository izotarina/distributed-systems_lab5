package lab5;

public class StoreTestResult {
    private final String url;
    private final int requestCount;
    private final String result;

    public StoreTestResult(String url, int requestCount, String result) {
        this.url = url;
        this.requestCount = requestCount;
        this.result = result;
    }

    public String getUrl() {
        return url;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public String getResult() {
        return result;
    }
}
