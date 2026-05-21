package directwaytoinsert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcconfig.class);
        JdbcTemplate Template = context.getBean(JdbcTemplate.class);

        //insert query
        String query = "INSERT INTO student(id, name , city) VALUES (?,?,?)";

        //fire the query
        int res = Template.update(query, 101, "sita", "ayodhya");
        System.out.println("data inserted"+res);
    }
}
