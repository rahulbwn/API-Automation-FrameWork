package qa.core.report;

import qa.core.utils.properties.FrameworkProperties;

import java.io.IOException;

import qa.core.utils.helper.Timestamp;

public class GetReport {
    private GetReport(){}
    private static Report report;

    private static void loadReport() throws IOException{
        String reportType = FrameworkProperties.getFrameworkProperties().getProperty("reportType");
        String reportDir = FrameworkProperties.getFrameworkProperties().getProperty("reportDir");
        String reportFilePrefix = FrameworkProperties.getFrameworkProperties().getProperty("reportFilePrefix");
        String currentTimestamp = Timestamp.getCurrentTimeStamp();
        String reportFileName = reportFilePrefix + currentTimestamp;

        switch(reportType){
            case "text":
                report = new TextReport(reportDir,reportFileName);
                break;
            case "extent":
                report = ExtentReport.getInstance(reportDir,reportFileName);
                break;
            default:
                report = new ConsoleReport();
        }
    }

    public static Report getReport() throws IOException{
        if(report == null){
            loadReport();
        }
        return report;
    }
}
