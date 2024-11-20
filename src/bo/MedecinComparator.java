package bo;

import java.util.Comparator;

public class MedecinComparator implements Comparator<MedecinSpecialiste> {
    @Override
    public int compare(MedecinSpecialiste o1, MedecinSpecialiste o2) {
        return o1.getSpecialite().compareToIgnoreCase(o2.getSpecialite());
    }
}


