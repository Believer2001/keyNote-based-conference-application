package enset.ma.keynoteservice;

import enset.ma.keynoteservice.entities.Keynote;
import enset.ma.keynoteservice.repositories.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository) {
        return args -> {
            keynoteRepository.save(Keynote.builder()
                            .name("tseh")
                            .prenoms("benoit")
                            .email("tsehbenoit@gmail.com")
                            .fonction("Developer")
                                    .build());
            keynoteRepository.save(
                    Keynote.builder()
                            .name("tangara")
                            .prenoms("youssouf")
                            .email("tangara@gmail.com")
                            .fonction("Architecte")
                            .build()
            );


            keynoteRepository.save(
                    Keynote.builder()
                            .name("toure")
                            .prenoms("alassane")
                            .email("alassanetoure@gmail.com")
                            .fonction("Consultant")
                            .build()
            );

            keynoteRepository.findAll().forEach(k -> {
                System.out.println("==========================");
                System.out.println(k.toString());
                System.out.println("==========================");
            });
        };
    }

}
