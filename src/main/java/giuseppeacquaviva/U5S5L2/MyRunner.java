package giuseppeacquaviva.U5S5L2;

import giuseppeacquaviva.U5S5L2.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5S5L2Application.class);
        try {

            Table tavolo1 = (Table) ctx.getBean("Tavolo1");

            Order order1 = new Order(4, tavolo1);

            order1.addElemento(ctx.getBean("pizza_margherita", Pizza.class));
            order1.addElemento(ctx.getBean("hawaiian_pizza", Pizza.class));
            order1.addElemento(ctx.getBean("salami_pizza_xl", Pizza.class));
            order1.addElemento(ctx.getBean("lemonade", Drink.class));
            order1.addElemento(ctx.getBean("lemonade", Drink.class));
            order1.addElemento(ctx.getBean("wine", Drink.class));

            System.out.println("Tavolo 1:");
            order1.print();

            System.out.println("Conto Tavolo 1");
            System.out.println(order1.getTotal());

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
