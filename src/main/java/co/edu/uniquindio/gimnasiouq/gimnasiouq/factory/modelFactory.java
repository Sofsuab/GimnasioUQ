package co.edu.uniquindio.gimnasiouq.gimnasiouq.factory;

import co.edu.uniquindio.gimnasiouq.gimnasiouq.model.GimnasioUQ;

public class modelFactory {
    private static modelFactory instance;
    private GimnasioUQ gimnasioUQ;

    private modelFactory() {
        gimnasioUQ = GimnasioUQ.getInstance();
    }

    public static modelFactory getInstance() {
        if (instance == null) {
            instance = new modelFactory();
        }
        return instance;
    }

    public GimnasioUQ getGimnasioUQ() {
        return gimnasioUQ;
    }
}
