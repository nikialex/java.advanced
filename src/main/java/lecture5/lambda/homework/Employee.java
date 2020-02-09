package lecture5.lambda.homework;

import lombok.Builder;
import lombok.Data;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Data
@Builder
public class Employee {
    private String firstName;
    private String lastName;
    private String phone;
    private String profession;
    private int age;
    private String companyName;
    private LocalDate startingDate;


    public static void writeHiredEmployeesToExcel(List<Candidate> approvedCandidates, String pathFile) {


        List<Employee> employees = new ArrayList<>();

        approvedCandidates.stream().forEach(item -> {
            Employee currEmp = Employee.builder()
                    .age(item.getAge())
                    .companyName(item.getCompanyName())
                    .firstName(item.getFirstName())
                    .lastName(item.getLastName())
                    .profession(item.getProfession())
                    .phone(item.getPhone())
                    .startingDate(LocalDate.now())
                    .build();

            employees.add(currEmp);
        });


        //Create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        XSSFSheet spreadsheet = workbook.createSheet("sample.xlsx");

        //Create row object
        XSSFRow row;

        //This data needs to be written (Object[])
        Map<Integer, Object[]> empinfo = new TreeMap<Integer, Object[]>();
        empinfo.put(1, new Object[]{"First Name", "Last name", "phone", "Profession", "Company", "Starting work Date"});
        AtomicInteger count = new AtomicInteger(2);
        employees.stream().forEach(currEmp -> {
            empinfo.put(count.get(), new Object[]{currEmp.getFirstName(), currEmp.getLastName(), currEmp.getPhone(), currEmp.getProfession(), currEmp.getCompanyName(), currEmp.getStartingDate().toString()});
            count.incrementAndGet();
        });

        //Iterate over data and write to sheet
        Set<Integer> keyid = empinfo.keySet();
        int rowid = 0;


        for (int key : keyid) {
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = empinfo.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }
        try {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(
                    new File(pathFile));

            workbook.write(out);
            out.close();
        } catch (Exception e) {
            System.out.println(pathFile + " creation or writing was NOT successfully");
        }
        System.out.println(pathFile + "written successfully");
    }
}


