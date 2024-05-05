package qa.core.report;

import java.io.IOException;

import org.testng.Reporter;
import qa.core.utils.properties.FrameworkProperties;

public class ReporterUtils {
	static String reportLogSplitN;
	public ReporterUtils() throws IOException
	{
    final String reportLogSplit = FrameworkProperties.getFrameworkProperties().getProperty("reportLogSplit");
    reportLogSplitN=reportLogSplit;
	}
	
    public static void log(ReportLevel level, String message, String detail){
        
			Reporter.log(level + reportLogSplitN + message + reportLogSplitN + detail);
    }
    public static void log(ReportLevel level, String message){
        Reporter.log(level + reportLogSplitN + message);
    }
}
