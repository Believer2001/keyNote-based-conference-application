package enset.ma.keynoteservice.entities;


import enset.ma.keynoteservice.enums.Type;
import org.springframework.context.annotation.Lazy;

import java.time.Duration;
import java.util.Date;


public class Keynote {
    private Long id;
    private String  title;
    private Type type;
    private Date dateKeynote;
    private Duration duration;
    private  Integer nbInscrits;
}
