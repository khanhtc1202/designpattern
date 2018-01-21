package StatePattern.state;

import StatePattern.context.Context;

public interface State {
    public void doAction(Context context);
}
