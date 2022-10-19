package creational.factory.authorization_server.domain.model.zyon.impl;

import creational.factory.authorization_server.domain.model.zyon.ZyonImpl;
import creational.factory.authorization_server.domain.model.zyon.interfaces.ZyonHom;

public class ZyonHomImpl extends ZyonImpl implements ZyonHom {

    public ZyonHomImpl() {
        super("zyon.hom", "user", "pass");
    }

    @Override
    public void specificZyonMethodHom() {
    }
}
