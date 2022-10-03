import com.mashape.unirest.http.*;
import okhttp3.*;

import java.io.*;
public class Main {
    public static void main(String []args) throws Exception{
        //запрос проходит
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.post("http://a:a@localhost:9999/services/ua/oauth/token")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .field("username", "admin")
                .field("password", "admin")
                .field("grant_type", "password")
                .field("scope", "openid")
                .asString();
        System.out.println(response.getBody());

// запрос не проходит
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
//        RequestBody body = RequestBody.create(mediaType,"username=admin&password=admin&grant_type=password&scope=openid");
//        Request request = new Request.Builder()
//                .url("http://web_app:changeit@localhost:9999/oauth/token")
//                .method("POST", body)
//                .addHeader("Content-Type", "application/x-www-form-urlencoded")
//                .build();
//        Response response = client.newCall(request).execute();
//        System.out.println(response);

    }
}