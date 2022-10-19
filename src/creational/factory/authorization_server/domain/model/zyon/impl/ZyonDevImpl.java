package creational.factory.authorization_server.domain.model.zyon.impl;

import creational.factory.authorization_server.domain.model.zyon.ZyonImpl;
import creational.factory.authorization_server.domain.model.zyon.interfaces.ZyonDev;

public class ZyonDevImpl extends ZyonImpl implements ZyonDev {

    public ZyonDevImpl() {
        super("zyon.dev", "user", "pass");
    }

    @Override
    public void specificZyonMethodDev() {}
}
