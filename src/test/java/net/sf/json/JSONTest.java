package net.sf.json;

import org.junit.Test;

/**
 * User: candide
 * Date: 23/10/13
 * Time: 14:01
 */
public class JSONTest {

    @Test
    public void testNumberPrecision(){
        final JSONObject jsonObject = JSONObject.fromObject("{\"status\": \"partial\", \"next_date\": 1329350828.0, \"session_data\": []}");
        System.out.println(jsonObject.getDouble("next_date"));
    }

}
