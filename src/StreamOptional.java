import java.util.Optional;

public class StreamOptional {

    public static void main(String[] args) {
      //  basicOptional();

        moreOptional();
    }

    private static void moreOptional() {

        Optional<String> meno = Optional.of("Mato");
        Optional<String> empty = Optional.empty();

        if(meno.isPresent()){
            System.out.println("meno: " + meno.get());
        }else{
            System.out.println("meno tu neni");
        }

      //  if (meno.ifPresent(m -> System.out.println("meno je: " + m));



    }


    private static void basicOptional() {
        Optional<String> meno = Optional.of("Mato");
        String hodnota1 = "Miska";
        String hodnota2 = null;

        System.out.println("neprazdny Optional: " + meno);
        System.out.println("neprazdny Optional: meno " + meno.get());
        System.out.println("prazdny Optional " + Optional.empty());

        System.out.println("OfNullable na neprazdnom Optional: " + Optional.ofNullable(hodnota1));

        System.out.println("OfNullable na prazdnom Optional: " + Optional.ofNullable(hodnota2));


        System.out.println("OfNullable na neprazdnom Optional: " + Optional.ofNullable(hodnota2));
    }

}
