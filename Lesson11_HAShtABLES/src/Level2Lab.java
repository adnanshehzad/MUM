import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Level2Lab {

	private Map<String , String> map;
	public Level2Lab() {
		// TODO Auto-generated constructor stub
		map=new HashMap<String, String>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Level2Lab main=new Level2Lab();
		//main.getMap().put("Ad", value)
		main.getMap().put("Adnan", "6416567861");
		main.getMap().put("Adnan", "6416567830");
		main.getMap().put("Adnan", "6416567844");
		main.getMap().put("Dani", "6416567854");
		main.getMap().put("Edgar", "6416567863");
		main.getMap().put("Yousef", "6416567864");
		main.getMap().put("Shine", "6416567865");
		main.getMap().put("Haithm", "6416567866");
		main.getMap().put("Sibtain", "6416567867");
		
		for(Map.Entry<String, String> mp:main.getMap().entrySet())
		{
			System.out.println("The value for key is : " + mp.getKey() + " The Value is :" + mp.getValue());
			
		}
		System.out.println(main.getMap().size());
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

}
 