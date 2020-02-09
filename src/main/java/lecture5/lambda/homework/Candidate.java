package lecture5.lambda.homework;

import com.poiji.annotation.ExcelCell;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Data
//@Builder
public class Candidate {


    @ExcelCell(0)
    private String firstName;

    @ExcelCell(1)
    private String lastName;

    @ExcelCell(2)
    private String phone;

    @ExcelCell(3)
    private String profession;

    @ExcelCell(4)
    private int age;

    @ExcelCell(5)
    private String companyName;

    @ExcelCell(6)
    private String categoryProfession;

    @ExcelCell(7)
    private int yearsOfExperience;

    private static List<Candidate> getCandidatesThatMetSingleJobCriteria(List<Candidate> candidates, JobCriteria jobCriteria) {

        return candidates.stream().filter(s ->
                s.getYearsOfExperience() >= jobCriteria.getYearsOfExperience()
                        && jobCriteria.getCompanyName().equalsIgnoreCase(s.getCompanyName())
                        && jobCriteria.getCategoryProfession().equalsIgnoreCase(s.getCategoryProfession())
                        && jobCriteria.getProfession().equalsIgnoreCase(s.getProfession())
        )
                .collect(Collectors.toList());

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCategoryProfession() {
        return categoryProfession;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }


    public static List<Candidate> getCandidatesThatMetJobCriteria(List<Candidate> candidates, List<JobCriteria> jobCriteria) {
        List<Candidate> approvedCandidates = new ArrayList<>();
        jobCriteria.stream().forEach(item -> {
            approvedCandidates.addAll(getCandidatesThatMetSingleJobCriteria(candidates, item));

        });
        return approvedCandidates;
    }


}
