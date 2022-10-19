package creational.factory.authorization_server.factory;

import creational.factory.authorization_server.domain.enumeration.Environment;
import creational.factory.authorization_server.domain.model.narnia.Narnia;
import creational.factory.authorization_server.domain.model.narnia.impl.NarniaDevImpl;
import creational.factory.authorization_server.domain.model.narnia.impl.NarniaHomImpl;
import creational.factory.authorization_server.domain.model.narnia.impl.NarniaPrdImpl;

public class NarniaFactory {

    public Narnia build(Environment environment) {
        Narnia narnia;
        switch (environment) {
            case DEV:
                narnia = new NarniaDevImpl();
                ;
                break;
            case HOMOLOG:
                narnia = new NarniaHomImpl();
                ;
                break;
            case PROD:
                narnia = new NarniaPrdImpl();
                break;
            default:
                throw new RuntimeException();
        }
        return narnia;
    }
}
