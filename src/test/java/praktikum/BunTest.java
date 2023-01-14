package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {
    Bun bun = new Bun("Флюоресцентная булка R2-D3", 988);

    @Test
    public void bunGetName() {
        Assert.assertEquals("Флюоресцентная булка R2-D3", bun.getName());
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(988, bun.getPrice(),0);
    }
}