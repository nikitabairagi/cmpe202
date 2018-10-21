  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // price for burger type = $16.00
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        // per premium cheese +1.50
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Thai Peanut Sauce", "Mayonnaise" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        //toppings unlimited free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" };
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // premium topping $1.00 - $3.00
        PremiumToppings pt = new PremiumToppings( "Premium Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        
        // bun
        Bun bun = new Bun( "Bun Options" ) ;
        String[] bunOptions = { "Ciabatta" } ;
        bun.setOptions( bunOptions ) ;
        bun.wrapDecorator( pt ) ;
        
        // side
        Side side = new Side( "Side Options" ) ;
        String[] sideOptions = { "Shoestring Fries" } ;
        side.setOptions( sideOptions ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side ) ;
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( pc ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( pt ) ;
        customBurger1.addChild( bun ) ;
        customBurger1.addChild( side ) ;
        
        // Add Custom Burger1 to the ORder
        order.addChild( customBurger1 );
    
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        
        // burger type
        b = new Burger( "Burger Options" ) ;
        bo = new String[] { "Harmone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        // 1 cheese free, extra cheese +1.00
        c = new Cheese( "Cheese Options" ) ;
        co = new String[]{ "Smoked Gouda", "Greek Feta"} ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        // per premium cheese +1.50
        pc = new PremiumCheese( "Premium Cheese Options" ) ;
        pco = new String[]{ "Fresh Mozzarella"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 1 sauce free, extra +.50
        s = new Sauce( "Sauce Options" ) ;
        so = new String[]{ "Habanero Salsa"} ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        //toppings unlimited free
        t = new Toppings( "Toppings Options" ) ;
        to = new String[]{ "Crushed Peanuts"};
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // premium topping $1.00 - $3.00
        pt = new PremiumToppings( "Premium Options" ) ;
        pto = new String[]{ "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        
        // bun
        bun = new Bun( "Bun Options" ) ;
        bunOptions = new String[]{ "Gluten-Free Bun" } ;
        bun.setOptions( bunOptions ) ;
        bun.wrapDecorator( pt ) ;
        
        // side
        side = new Side( "Side Options" ) ;
        sideOptions = new String[]{ "Shoestring Fries" } ;
        side.setOptions( sideOptions ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( side ) ;
        customBurger2.addChild( b ) ;
        customBurger2.addChild( c ) ;
        customBurger2.addChild( pc ) ;
        customBurger2.addChild( s ) ;
        customBurger2.addChild( t ) ;
        customBurger2.addChild( pt ) ;
        customBurger2.addChild( bun ) ;
        customBurger2.addChild( side ) ;
        
        // Add Custom Burger1 to the ORder
        order.addChild( customBurger2 );
        
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/