package com.jd.json.demo;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by guoyiqing1 on 2016/5/31.
 */
public class OrgjsonDemo {
    public static String jsonTest() throws JSONException {
        JSONObject json=new JSONObject();
        JSONArray jsonMembers=new JSONArray();
        JSONObject member1=new JSONObject();
        member1.put("loginname", "zhangfan");
        member1.put("password", "userpass");
        member1.put("email","10371443@qq.com");
        member1.put("sign_date", "2007-06-12");
        jsonMembers.put(member1);

        JSONObject member2 = new JSONObject();
        member2.put("loginname", "zf");
        member2.put("password", "userpass");
        member2.put("email","8223939@qq.com");
        member2.put("sign_date", "2008-07-16");
        jsonMembers.put(member2);
        json.put("users", jsonMembers);
        return json.toString();
    }
    public static String jsonTest2() throws JSONException{
        String jsonString="{\"users\":[{\"loginname\":\"zhangfan\",\"password\":\"userpass\",\"email\":\"10371443@qq.com\"},{\"loginname\":\"zf\",\"password\":\"userpass\",\"email\":\"822393@qq.com\"}]}";
        JSONObject json= new JSONObject(jsonString);
        JSONArray jsonArray=json.getJSONArray("users");
        String loginNames="loginname list:";
        for(int i=0;i<jsonArray.length();i++){
            JSONObject user=(JSONObject) jsonArray.get(i);
            String userName=(String) user.get("email");
            if(i==jsonArray.length()-1){
                loginNames+=userName;
            }else{
                loginNames+=userName+",";
            }
        }
        return loginNames;
    }

    public static void main(String[] args) {
        System.out.println(jsonTest());
        System.out.println(jsonTest2());
    }
}
