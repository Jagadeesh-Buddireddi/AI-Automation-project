package utils;

import org.testng.ITestResult;

public class AIFailureAnalyzer {
    public static String analyzeFailure(ITestResult result) {
        Throwable exception = result.getThrowable();
        if (exception != null) {
            String message = exception.getMessage();
            if (message.contains("NoSuchElement")) return "UI Element missing - Check locator.";
            if (message.contains("SQLException")) return "Database error - Check query.";
            if (message.contains("Timeout")) return "Timeout - Adjust waits.";
        }
        return "Unknown failure - Review logs.";
    }
}