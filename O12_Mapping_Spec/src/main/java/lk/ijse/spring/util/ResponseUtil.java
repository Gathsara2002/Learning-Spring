package lk.ijse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Gathsara
 * created : 10/13/2023 -- 5:40 PM
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private String state;
    private String message;
    private Object data;
}
