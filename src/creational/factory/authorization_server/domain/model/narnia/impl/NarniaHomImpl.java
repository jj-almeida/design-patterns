package creational.factory.authorization_server.domain.model.narnia.impl;

import creational.factory.authorization_server.domain.model.narnia.NarniaImpl;
import creational.factory.authorization_server.domain.model.narnia.interfaces.NarniaHom;

public class NarniaHomImpl extends NarniaImpl implements NarniaHom {

    public NarniaHomImpl() {
        super("narnia.hom", "user", "pass");
    }

    @Override
    public void specificNarniaMethodHom() {}
}
