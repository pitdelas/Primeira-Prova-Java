import java.time.LocalDateTime;

public class Main {

     public static void main (String[] args){
   
        CombatTeam combatTeam = new CombatTeam(10);

        FireSpot fireSpot = new FireSpot(LocalDateTime.now(),LocalDateTime.now(),"pit",Status.ACTIVE, Identification.HUMAN, Intensity.HIGH);

        Image image = new Image("Imagem",LocalDateTime.now(),"satelitename");

        Leader leader = new Leader(true,"inter");

        ParkAddress parkadress = new ParkAddress("Floripa","Florida", "texas","betocarrero",8f, 7f);

        Sensor sensor = new Sensor(8f, 7f, SensorStatus.DEAD, "RUI" );

        SensroRead sensroRead = new SensroRead(1f,LocalDateTime.now());

        User user = new User("Adolfo", "rizzo","heitorizzu@gmail", "289" );
        

        System.out.println(combatTeam.toString());
        System.out.println(fireSpot.toString());
        System.out.println(image.toString());
        System.out.println(leader.toString());
        System.out.println(parkadress.toString());
        System.out.println(sensor.toString());
        System.out.println(sensroRead.toString());
        System.out.println(user.toString());

     }
}
