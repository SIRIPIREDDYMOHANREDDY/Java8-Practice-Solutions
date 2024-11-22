package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream13 {
    // GroupBy

    public static void main(String[] args) {
        Em e1 = new Em(1, "Mohan", 25000.00, "USA");
        Em e2 = new Em(2, "Abraham", 46000.00, "INDIA");
        Em e3 = new Em(3, "Ching", 36000.00, "CHINA");
        Em e4 = new Em(4, "David", 16000.00, "INDIA");
        Em e5 = new Em(5, "Cathy", 29000.00, "USA");

        List<Em> list = Arrays.asList(e1, e2, e3, e4, e5);

        System.out.println("=================================");
        Map<String, List<Em>> group = list.stream()
                .collect(Collectors.groupingBy(e -> e.country));
        System.out.println(group);
    }
}

class Em {
    int id;
    String name;
    double salary;
    String country;

    public Em(int id, String name, double salary, String country) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Em [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
    }
}
