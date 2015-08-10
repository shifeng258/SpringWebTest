package src;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SHIFENG258 on 2015/8/6.
 */
@Controller
public class webController {
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public @ResponseBody Map index(@PathVariable String userId,HttpServletRequest request) {
        UserDTO userDTO = new UserDTO();
        try {
            userDTO.setUserId(userId);
            userDTO.setEmail(userId+"@126.com");
            userDTO.setUserName(userId.substring(0,3));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(userDTO.toString());
        System.out.println("Accept:"+request.getHeader("Accept"));
        return (Map) new HashMap().put("userDTO",userDTO);
    }
}
