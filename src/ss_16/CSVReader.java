package ss_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Country {
    private int id;
    private String code;
    private String name;

    // Constructor
    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    // Override phương thức toString để hiển thị thông tin quốc gia
    @Override
    public String toString() {
        return "ID: " + id + ", Code: " + code + ", Name: " + name;
    }
}

public class CSVReader {
    public static void main(String[] args) {
        String filePath = "countries.csv";  // Đường dẫn tới file CSV của bạn
        List<Country> countries = readCountriesFromCSV(filePath);

        // Hiển thị danh sách các quốc gia
        System.out.println("Danh sách các quốc gia:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    // Phương thức đọc file CSV và trả về danh sách các đối tượng Country
    public static List<Country> readCountriesFromCSV(String filePath) {
        List<Country> countries = new ArrayList<>();
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                // Bỏ qua dòng tiêu đề nếu có
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countries;
    }
}


