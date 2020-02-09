package lecture5.lambda.homework;

import com.poiji.bind.Poiji;
import java.io.File;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        List<Candidate> candidates = Poiji.fromExcel(new File("src\\main\\resources\\Candidates.xlsx"), Candidate.class);
        List<JobCriteria> JobCriterias = Poiji.fromExcel(new File("src\\main\\resources\\JobCriteria.xlsx"), JobCriteria.class);
        List<Candidate> approvedCandidates = Candidate.getCandidatesThatMetJobCriteria(candidates, JobCriterias);
        Employee.writeHiredEmployeesToExcel(approvedCandidates,"C:\\Users\\nikial\\Desktop\\test.xlsx");

    }

}


