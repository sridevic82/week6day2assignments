package invoca.cnt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetestAnalyser implements IRetryAnalyzer{
	int max_count=3;
	int count=0;
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && count< max_count)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
