package lab.com.alura.conversordemoneda.modelos;
import java.util.Map;
public record Conversor (String result,
                         String documentation,
                         String terms_of_use,
                         int time_last_update_unix,
                         String time_last_update_utc,
                         int time_next_update_unix,
                         String time_next_update_utc,
                         Map<String,Double> conversion_rates){}
