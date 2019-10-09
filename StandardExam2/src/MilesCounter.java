//package prob2;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		/* implement */
		List<Vehicle> retList=new ArrayList<Vehicle>();
		for(Object obj:vehicleArray)
		{
			retList.add((Vehicle) obj);
		}
		return retList;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		/*implement */
		int computemiles=0;
		for(Vehicle veh:vehicleList)
		{
			computemiles+=veh.getMilesUsedToday();
		}
		return computemiles;
	}
}
