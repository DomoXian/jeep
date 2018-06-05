import com.leno.jeep.JeepApplication;
import com.leno.jeep.ao.AreaAO;
import com.leno.jeep.common.utils.FileUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JeepApplication.class)
@ActiveProfiles("local")
public class JeepApplicationTests {

    @Autowired
    private AreaAO areaAO;

    @Test
    public void contextLoads() {
        FileUtil.JsonFile(areaAO.getProvince(), "province.json");
        FileUtil.JsonFile(areaAO.getCity(), "city.json");

    }

}
