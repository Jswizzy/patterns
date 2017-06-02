package name.jnsmith.patterns.structure.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emaiAddress;

    public EmployeeCSV(String csv) throws Exception {
        String[] tokens = csv.split(",");

        if (!(tokens.length == 4)) throw new Exception("Invalid CSV Format");

        id = Integer.parseInt(tokens[0]);
        firstname = tokens[1];
        lastname = tokens[2];
        emaiAddress = tokens[3];
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmaiAddress() {
        return emaiAddress;
    }

    @Override
    public String toString() {
        return "EmployeeCSV{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emaiAddress='" + emaiAddress + '\'' +
                '}';
    }
}
