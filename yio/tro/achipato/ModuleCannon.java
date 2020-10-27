package yio.tro.achipato;

/**
 * Created by ivan on 09.08.2014.
 */
public class ModuleCannon extends Module{

    long lastTimeAttacked;
    long currentTime, lastTime;
    int attackDelay, SHDDelay;

    public ModuleCannon(double x, double y, int appurtenance, Graph graph) {
        super(x, y, appurtenance, graph);
        afterConstructionVisibilityRange = 22 * (float) visualRadius;
        timeToEndConstruction = System.currentTimeMillis() + 1500;
        price = GameController.PRICE_CANNON;
        maxHP = hp = 10;
        maxSHD = 5;
        SHDDelay = 500;
        attackDelay = 5000;
        index = MODULE_INDEX_CANNON;
    }

    boolean canAttack() {
        return System.currentTimeMillis() > lastTimeAttacked + attackDelay;
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
        lastTimeAttacked += correction;
        currentTime += correction;
        if(!canAttack()) rotationAngle --;
    }
}
