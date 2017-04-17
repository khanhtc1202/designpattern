package TemplatePattern.abstracts;

/**
 * Created by khanhtc on 4/18/17.
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    // template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
