package creational.factory.authorization_server.domain.model.narnia.impl;

import creational.factory.authorization_server.domain.model.narnia.NarniaImpl;
import creational.factory.authorization_server.domain.model.narnia.interfaces.NarniaPrd;

public class NarniaPrdImpl extends NarniaImpl implements NarniaPrd {

    public NarniaPrdImpl() {
        super("narnia.prd", "user", "pass");
    }

    @Override
    public void specificNarniaMethodPrd() {}
}
