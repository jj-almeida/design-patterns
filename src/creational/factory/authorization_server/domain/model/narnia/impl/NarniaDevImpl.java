package creational.factory.authorization_server.domain.model.narnia.impl;

import creational.factory.authorization_server.domain.model.narnia.NarniaImpl;
import creational.factory.authorization_server.domain.model.narnia.interfaces.NarniaDev;

public class NarniaDevImpl extends NarniaImpl implements NarniaDev {

    public NarniaDevImpl() {
        super("narnia.dev", "user", "pass");
    }

    @Override
    public void specificNarniaMethodDev() {}
}
