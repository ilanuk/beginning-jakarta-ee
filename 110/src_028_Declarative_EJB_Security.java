import javax.annotation.security.*;
...

@Singleton 
@Local(NameEjbLocal.class)
@Remote(NameEjbRemote.class)
@DeclareRoles({"admin"})
public class NameEjb 
        implements NameEjbLocal, NameEjbRemote {
    public String hello(String name) {
        return "Hello " + name + " (admin)";
    }
}
