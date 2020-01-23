package ajax.book;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BookNaverProxy {
	
	public String getData(String key, String pageSize, String start)
	{
		String clientId = "SE0PVTS8HwHFNkMhzaPW";	//���ø����̼� Ŭ���̾�Ʈ ���̵�";
        String clientSecret = "dTuIUDXTgv";			//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
        
        try {
            String text = URLEncoder.encode(key, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/book.json?query="+ text +"&display="+pageSize+"&start="+start; // json ���
            //String apiURL = "https://openapi.naver.com/v1/search/book.xml?query="+ text; // xml ���
            URL url = new URL(apiURL);
            
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

            int responseCode = con.getResponseCode();
            BufferedReader br;
            
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            } else {  // ���� �߻�
                br = new BufferedReader(new InputStreamReader(con.getErrorStream(),"UTF-8"));
            }
            
            String inputLine;
            StringBuffer response = new StringBuffer();
            
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            return response.toString();
        } catch (Exception e) {
        	return null;
        }
	}

	public static void main(String[] args) {

		BookNaverProxy b= new BookNaverProxy();
//		String data= b.getData("Ajax", "20");
//		System.out.println(data);
	}

}
