import java.util.ArrayList;
import java.util.List;

public class CompositeDealers implements Worker {

    List<Worker> workerList;

    public CompositeDealers() {
        workerList = new ArrayList<>();
    }

    void add(Worker worker){
        workerList.add(worker);
    }

    @Override
    public int getCost() {
        int result = 0;
        for (Worker worker : workerList) {
            result += worker.getCost();
        }
        return result;
    }
}
