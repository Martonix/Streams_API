
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> osoby = Arrays.asList("Pavol", "Pato", "Peto", "Mato", "oliver", "miska", "Miska", "Michal", "Melichar", "Mišo");

        List<String> str = osoby.stream()
                .filter(osoba -> osoba.charAt(0) == 'M')
                .sorted(Comparator.comparing(osoba -> osoba.charAt(2)))
                //.map()
                .collect(Collectors.toList());

        str.forEach(System.out::println);

        osoby.stream().map(Optional::ofNullable).findFirst();
    }
}
