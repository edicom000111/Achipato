package yio.tro.achipato;

/**
 * Created by ivan on 09.08.2014.
 */
public class ModuleAirForce extends Module{

    public ModuleAirForce(double x, double y, int appurtenance, Graph graph) {
        super(x, y, appurtenance, graph);
        timeToEndConstruction = System.currentTimeMillis() + 2000;
        price = GameController.PRICE_AIRFORCE;
        maxHP = hp = 5;
        index = MODULE_INDEX_AIRFORCE;
    }

    @Override
    public void timeCorrection(long correction) {
        
    }
}
