import java.util.ArrayList;
import java.util.List;

public class NumberComparisons {
    public static List<Boolean> numberComparisons(List<Integer> list1, List<Integer> list2){
        List<Boolean> result = new ArrayList<>();
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).equals(list2.get(i))) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }
        }else{
            System.out.println("Длинна списка не равна");
        }
        return result;
    }
}
