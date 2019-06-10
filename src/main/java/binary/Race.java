package binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Race {
    private final List<Runner> runners = new ArrayList<>();
    public List<Runner> add(Runner runner) {
        runners.add(runner);
        return runners;
    }
    public List<Runner> getListOfRunner() {
        return runners;
    }
}
