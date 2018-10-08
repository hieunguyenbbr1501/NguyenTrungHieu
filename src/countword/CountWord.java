package countword;
import java.io.BufferedReader;
import java.io.FileReader;

public class CountWord {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("C:\\Users\\CCNE\\Desktop\\text.txt");
        BufferedReader br = new BufferedReader(fr);
        String st = br.readLine();
        int count = 0;
        while(st != null)
        {
            String []words = st.split(" ");
            for(String w : words)
            {
                count++;
            }
            st = br.readLine();
        }
        
        System.out.println(count);
    }
    
     
}