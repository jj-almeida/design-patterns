package creational.factory.authorization_server.factory;

import creational.factory.authorization_server.domain.enumeration.Environment;
import creational.factory.authorization_server.domain.model.zyon.Zyon;
import creational.factory.authorization_server.domain.model.zyon.impl.ZyonDevImpl;
import creational.factory.authorization_server.domain.model.zyon.impl.ZyonHomImpl;
import creational.factory.authorization_server.domain.model.zyon.impl.ZyonPrdImpl;

public class ZyonFactory {

    public Zyon build(Environment environment) {
        Zyon zyon;
        switch (environment) {
            case DEV:
                zyon = new ZyonDevImpl();
                break;
            case HOMOLOG:
                zyon = new ZyonHomImpl();
                break;
            case PROD:
                zyon = new ZyonPrdImpl();
                break;
            default:
                throw new RuntimeException();
        }
        return zyon;
    }
}
