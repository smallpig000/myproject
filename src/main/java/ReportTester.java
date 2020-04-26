import com.hank.FinanceReport;
import com.hank.HealthReport;
import com.hank.IReport;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        IReport finance = new FinanceReport();
        IReport health = new HealthReport();
        List<IReport> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for(IReport report:reports){
            report.load();
            report.print();
        }
    }
}
