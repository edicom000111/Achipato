package yio.tro.achipato;

/**
 * Created by ivan on 09.08.2014.
 */
public class ModuleBarricade extends Module{

    int SHDDelay;
    long currentTime, lastTime;
    public ModuleBarricade(double x, double y, int appurtenance, Graph graph) {
        super(x, y, appurtenance, graph);
        timeToEndConstruction = System.currentTimeMillis() + 1000;
        price = GameController.PRICE_BARRICADE;
        maxHP = hp = 5;
        index = MODULE_INDEX_BARRICADE;


        maxSHD = 20;
        SHDDelay = 500;
    }

    @Override
    void move() {
        super.move();
        currentTime = System.currentTimeMillis();
        if (!isConstructing && currentTime > lastTime + SHDDelay) {
            lastTime = currentTime;
            if(SHD < maxSHD) SHD ++;
        }
    }
    @Override
    public void timeCorrection(long correction) {
        currentTime += correction;
    }
}
