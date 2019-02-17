package InterceptingFilterPattern;

import InterceptingFilterPattern.filters.AuthenticationFilter;
import InterceptingFilterPattern.filters.DebugFilter;
import InterceptingFilterPattern.mechanism.FilterManager;

public class InterceptingFilterPatternDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
