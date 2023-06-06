package composite.militaire.avec;











import java.util.ArrayList;
import java.util.List;

public class Armee {
    private List<Soldat> soldats = new ArrayList<>();

    public void add(Soldat soldat) {
        soldats.add(soldat);
    }

    public void avancer(){
        for (Soldat soldat : soldats) {
            soldat.avancer();
        }
    }
}
