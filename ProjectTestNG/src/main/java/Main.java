
//import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
//		FileReader reader = new FileReader("environement.properties");
//		Properties properties = new Properties();
//		properties.load(reader);
//		String URL = properties.getProperty("Url");
//		System.out.println("mon url est ===================>" + URL);

		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		calendar.add(Calendar.DATE, 100);
		String dateDebut = (sdf.format(calendar.getTime())).toString();
		System.out.println("Ma date est ========================================================>" + dateDebut);

	}

}
