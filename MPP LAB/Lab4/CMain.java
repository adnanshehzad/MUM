import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CMain {

	public static void main(String[] args) {
		List<CEmployee> employees = Arrays.asList(
				new CHourly(1, 1, 1),
				new CSalaried(2, 100),
				new Commision(3, 0.1d, 100, 
					Arrays.asList(
						new COrder(1, LocalDate.of(2019, 7, 2), 100),
						new COrder(2, LocalDate.of(2019, 8, 2), 100),
						new COrder(3, LocalDate.of(2019, 8, 5), 100)
					)
				)
			);
			
			for(CEmployee e : employees) {
				e.print();
			}
		}

}
