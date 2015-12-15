package Entity; /**
 * Created by Юля on 11.12.2015.
 */
import javax.persistence.*;
import java.util.*;

public class Profile {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProfile;

    @Column(name = "login", length = 32)
    private String login;

    @Column(name = "password", length = 32)
    private String password;

    @Column(name = "post", length = 32)
    private String post;

    @OneToMany(mappedBy="user")
    private List<ShoppingList> shoppingLists=new ArrayList<ShoppingList>();

    @OneToMany(mappedBy="user")
    private List<Entity.MonthlySpending> monthlySpendings=new ArrayList<Entity.MonthlySpending>();

    @OneToMany(mappedBy="user")
    private List<RegularBuy> regularBuys=new ArrayList<RegularBuy>();

}
