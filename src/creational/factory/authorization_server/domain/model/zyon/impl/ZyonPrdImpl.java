package creational.factory.authorization_server.domain.model.zyon.impl;

import creational.factory.authorization_server.domain.model.zyon.ZyonImpl;
import creational.factory.authorization_server.domain.model.zyon.interfaces.ZyonPrd;

public class ZyonPrdImpl extends ZyonImpl implements ZyonPrd {

    public ZyonPrdImpl() {
        super("zyon.prd", "user", "pass");
    }

    @Override
    public void specificZyonMethodPrd() {}
}
