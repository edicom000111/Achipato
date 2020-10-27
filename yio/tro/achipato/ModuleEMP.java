package yio.tro.achipato;

/**
 * Created by ivan on 09.08.2014.
 */
public class ModuleEMP extends Module{

    public ModuleEMP(double x, double y, int appurtenance, Graph graph) {
        super(x, y, appurtenance, graph);
        timeToEndConstruction = System.currentTimeMillis() + 2000;
        price = GameController.PRICE_EMP;
        maxHP = hp = 10;
        index = MODULE_INDEX_EMP;
    }

    @Override
    public void timeCorrection(long correction) {
        
    }
}
