package observator.button;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {
    private List<Observator> observators = new ArrayList<>();

    public void click() {
        for (Observator observator : observators) {
            observator.alert();
        }
    }

    @Override
    public void subscribe(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void unsubscribe(Observator observator) {
        observators.remove(observator);
    }
}
