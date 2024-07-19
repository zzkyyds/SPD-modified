package core.component;

public abstract class AbstractComponent {

    private String cName=getType().getSimpleName();


    public abstract void init();
    public abstract void update();
    public abstract void act();



    public Class<?> getType() {
        return this.getClass();
    }
}
