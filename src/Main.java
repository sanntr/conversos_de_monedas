import com.alulara.modules.Api;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Api api = new Api();
        try {
            System.out.println(api.conectionApi());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
