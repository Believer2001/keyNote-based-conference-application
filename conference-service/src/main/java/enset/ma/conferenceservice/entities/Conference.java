package enset.ma.configurationservice.entities;

import enset.ma.configurationservice.enums.Type;

import java.time.Duration;
import java.util.Date;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Conference {
    private  String id;
    private  String title;
    private Type type;
    private Date startTime;
    private Duration duration;
    private int numberOfRegistrations;
    private double averageScore;


}
