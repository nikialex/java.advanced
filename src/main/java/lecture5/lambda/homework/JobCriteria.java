package lecture5.lambda.homework;

import com.poiji.annotation.ExcelCell;


public class JobCriteria {
    @ExcelCell(0)
    private String companyName;
    @ExcelCell(1)
    private String profession;
    @ExcelCell(2)
    private String categoryProfession;


    @ExcelCell(3)
    private int yearsOfExperience;


    public String getCompanyName() {
        return companyName;
    }

    public String getProfession() {
        return profession;
    }

    public String getCategoryProfession() {
        return categoryProfession;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

}
