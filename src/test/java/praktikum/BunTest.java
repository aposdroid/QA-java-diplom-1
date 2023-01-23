package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {

    @Test
    public void bunGetName() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3", 988);
        Assert.assertEquals("Флюоресцентная булка R2-D3", bun.getName());
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3", 988);
        Assert.assertEquals(988, bun.getPrice(),0);
    }
}