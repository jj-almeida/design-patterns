package creational.factory.authorization_server.domain.model;

public abstract class AuthorizationServerImpl implements AuthorizationServer {

    private final String url;
    private final String user;
    private final String pass;

    protected AuthorizationServerImpl(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        System.out.println("## Connected on " + url + " authorization server");
    }

    @Override
    public void createCredential() {
        System.out.println("### Credential created successfully");
    }

    @Override
    public void deleteCredential() {
        System.out.println("### Credential deleted successfully");
    }
}
