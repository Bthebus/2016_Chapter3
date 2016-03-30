package za.ac.cput.Chapter3_3.appConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Chapter3_3.services.Impl.EmployeeServiceImpl;
import za.ac.cput.Chapter3_3.services.Impl.StudentServiceImpl;
import za.ac.cput.Chapter3_3.services.PersonInterface;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-12
 */
@Configuration
public class AppConfig {
    @Bean(name="student")
    public PersonInterface getStudent(){
        return new StudentServiceImpl("Braedy", "Thebus", "213039168", "Fulltime");
    }

    @Bean(name="employee")
    public PersonInterface getEMployee()
    {
        return new EmployeeServiceImpl("John","Wick","5555","Permanent");
    }
}
