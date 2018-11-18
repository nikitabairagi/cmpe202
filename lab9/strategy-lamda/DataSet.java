import java.util.ArrayList;
import java.util.Arrays;

public class DataSet {

    private ArrayList<Integer> data = new ArrayList<>()  ;
    private int[] sortedList;

    public DataSet()
    {
        data.clear();
        data.add( 198 ) ;
        data.add( 56  ) ;
        data.add( 12  ) ;
        data.add( 34  ) ;
        data.add( 62  ) ;
        data.add( 99  ) ;
        data.add( 145  ) ;
        data.add( 87  ) ;
        data.add( 26  ) ;
        data.add( 37  ) ;
        data.add( 13  ) ;
        data.add( 16  ) ;

        sortedList = data.stream().mapToInt(i->i).toArray();
    }

    public int[] get(){
        return sortedList;
    }

	public void display() {
        Arrays.stream(sortedList).forEach(System.out::println);
	}
	 
	public void resetData() {
        sortedList = data.stream()
                .mapToInt(i-> i)
                .toArray();

        System.out.println( "Data Reset Done!");
	}

}
 
